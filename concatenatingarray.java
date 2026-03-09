class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[2*nums.length];
        int ind = 0, count = 0;
        for(int i = 0; i<nums.length; i++){
            if(count==2){
                break;
            }
            arr[ind++] = nums[i];
            if(i==nums.length-1){
                count++;
                i = -1;
            }
        }
        return arr;
    }
}
// pratice at neetcode with this link : https://neetcode.io/problems/concatenation-of-array/question