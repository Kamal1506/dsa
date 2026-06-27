class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        Map<String, Integer> freq = new HashMap<>();
        int maxFreq = 0;
        
        for (List<String> list : responses) {
            Set<String> seen = new HashSet<>(list); // Cleaner way to deduplicate
            for (String str : seen) {
                int count = freq.getOrDefault(str, 0) + 1;
                freq.put(str, count);
                maxFreq = Math.max(maxFreq, count);
            }
        }
        
        // Find lexicographically smallest with max frequency
        String result = null;
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == maxFreq) {
                if (result == null || entry.getKey().compareTo(result) < 0) {
                    result = entry.getKey();
                }
            }
        }
        return result == null ? "" : result;
    }
}


//https://leetcode.com/problems/find-the-most-common-response/submissions/2048117061/
