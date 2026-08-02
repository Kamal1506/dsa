class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> mapped = new HashMap<>();
        for(int num : nums){
            mapped.put(num, mapped.getOrDefault(num, 0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(var entry : mapped.entrySet()){
            if(entry.getValue() == 2){
                list.add(entry.getKey());
            }
        }
        return list;
    }
}

//leetcode : https://leetcode.com/problems/find-all-duplicates-in-an-array/
