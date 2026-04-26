class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replaceAll("[,.!@#$%^&*()_+:';]"," ");
        String arr[] = paragraph.toLowerCase().split("\\s+");
        HashMap<String,Integer> mapped = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if(arr[i].equals("")) continue;
            mapped.put(arr[i],mapped.getOrDefault(arr[i],0)+1);
        }
        for(String s : banned){
            mapped.remove(s);
        }
        int high = 0;
        String sb = "";
        for(String key : mapped.keySet()){
            if(mapped.get(key) > high){
                high = mapped.get(key);
                sb = key;
            }
        }
        return sb;
    }
}

// https://leetcode.com/problems/most-common-word/description/?envType=problem-list-v2&envId=string
