class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums2){
            set.add(num);
        }
        int res[] = new int[2];
        int count = 0;
        for(int num : nums1){
            if(set.contains(num)){
                count++;
            }
        }
        res[0] = count;
        count = 0;
        set.clear();
        for(int num : nums1){
            set.add(num);
        }
        for(int num : nums2){
            if(set.contains(num)){
                count++;
            }
        }
        res[1] = count;
        return res;
    }
}

// https://leetcode.com/problems/find-common-elements-between-two-arrays/description/
