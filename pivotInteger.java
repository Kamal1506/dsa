class Solution {
    public int pivotInteger(int n) {
        int totalSum = 0;
        for(int i = 1; i<=n; i++){
            totalSum += i;
        }
        if(n == 1){
            return 1;
        }
        int currSum = 0;
        for(int i = n; i>0; i--){
            currSum += i;
            totalSum -= i;
            if(currSum == (totalSum-(i-1))){
                return i-1;
            }
        }
        return -1;
    }
}

// https://leetcode.com/problems/find-the-pivot-integer/
