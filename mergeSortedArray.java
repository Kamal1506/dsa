class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int res[] = new int[m+n];
        int left = 0;
        int right = 0;
        int ind = 0;
        while(left < m && right < n){
            if(nums1[left] <= nums2[right]){
                res[ind++] = nums1[left];
                left++;
            }
            else{
                res[ind++] = nums2[right];
                right++;
            }
        }
        while(left < m){
            res[ind++] = nums1[left];
            left++;
        }
        while(right < n){
            res[ind++] = nums2[right];
            right++;
        }
        System.out.println(Arrays.toString(res));
        System.arraycopy(res, 0, nums1, 0, res.length);
        // nums1 = Arrays.copyOf(res, res.length);
    }
}

leetcode : 88
  https://leetcode.com/problems/merge-sorted-array/description/
