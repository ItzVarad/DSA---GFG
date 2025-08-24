class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int s = 0, len = arr.length, e  = len -1, ans = len;
        if(target < arr[0]) return 0;
        if(target > arr[len-1]) return len;
        while(s <= e){
            int m = s + (e -s)/2;
            if(arr[m] >= target){
                ans = m;
                e = m -1;
            } else{
                s = m + 1;
            }
        }
        return ans;
    }
}
