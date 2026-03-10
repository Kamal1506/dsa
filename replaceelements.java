class Solution {
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length-1];
        arr[arr.length-1] = -1;
        for(int i = arr.length-2 ; i>=0 ; i--){
            if(arr[i]<max){
                arr[i] = max;
            }
            else{
                int temp = arr[i];
                arr[i] = max;
                max = temp;
            }
        }
        return arr;
    }
}

// https://neetcode.io/problems/replace-elements-with-greatest-element-on-right-side/question
