class Solution {
    public boolean isSubsequence(String s, String t) {
        int s_ind = 0;
        if(s.equals("")) return true;
        for(int i = 0; i<t.length(); i++){
            if(s.charAt(s_ind)==t.charAt(i)){
                s_ind++;
            }
        if(s_ind == s.length()){
            return true;
        }
        }
        return false;
    }
}

// https://neetcode.io/problems/is-subsequence/question
