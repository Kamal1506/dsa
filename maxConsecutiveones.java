class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxones = 0;
        int ones = 0;;
        for(int i : nums){
            if(i == 0){
                maxones = Math.max(maxones,ones);
                ones = 0;
            }
            else{
                ones++;
            }
        }
        return Math.max(ones,maxones);
    }
}

// https://neetcode.io/problems/max-consecutive-ones/question
