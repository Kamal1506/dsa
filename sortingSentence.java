class Solution {
    public String sortSentence(String s) {
        String arr[] = s.split(" ");
        String res[] = new String[arr.length];
        for(int i = 0; i<arr.length; i++){
            String a = arr[i];
            int j = a.charAt(a.length()-1)-'0';
            res[j-1] = a.substring(0,a.length()-1);
        }
        return String.join(" ",res);
    }
}

// https://leetcode.com/problems/sorting-the-sentence/description/
