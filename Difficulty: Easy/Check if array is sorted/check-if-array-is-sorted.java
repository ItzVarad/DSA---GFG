class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        int len = arr.length;
        for(int i=1; i < len; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}