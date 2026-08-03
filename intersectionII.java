class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersection = new ArrayList<>();
        int i = 0;
        int j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length;
        int m = nums2.length;
        while(i < n && j < m){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums2[j] < nums1[i]){
                j++;
            }
            else{
                intersection.add(nums1[i]);
                i++;
                j++;
            }
        }
        int res[] = new int[intersection.size()];
        int ind = 0;
        for(int num : intersection){
            res[ind++] = num;
        }
        return res;
    }
}

//https://leetcode.com/problems/intersection-of-two-arrays-ii/
