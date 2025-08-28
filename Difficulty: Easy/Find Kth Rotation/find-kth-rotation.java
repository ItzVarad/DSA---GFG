class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int len = arr.length, s = 0, e = len -1;
        while(s < e){
            int mid = s + (e - s)/2;
            if(arr[mid] <= arr[e]){
                e = mid;
            } else{
                s = mid + 1;
            }
        }
        return s;
    }
}