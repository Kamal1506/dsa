class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch =='('){
                max++;
                count = Math.max(count,max);
            }
            else if(ch == ')'){
                max--;
            }
        }
        return count;
    }
}

// practice at leetcode : https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
