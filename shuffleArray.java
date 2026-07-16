class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j = 0;
        int k = n;
        int newArr[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            if(i % 2 == 0){
                newArr[i] = nums[j++];
            }
            else{
                newArr[i] = nums[k++];
            }
        }
        return newArr;
    }
}

// https://leetcode.com/problems/shuffle-the-array/
