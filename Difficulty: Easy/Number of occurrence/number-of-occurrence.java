

class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int f =0,l=0;
        f = binarySearch(arr,target,true);
        l = binarySearch(arr,target,false);
        
        if(f == -1 && l == -1){
            return 0;
        } 
        if(f == -1) f = 0;
        if(l == -1) l = 0;
        
        return l - f + 1; 
    }
    private int binarySearch(int[] nums, int target, boolean isFindLeft){
        int start = 0, end=nums.length - 1;
        int num = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] < target){
                start = mid + 1;
            } else if(nums[mid] > target){
                end = mid - 1;
            } else{
                num = mid;
                if(isFindLeft){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return num;
    }
}
