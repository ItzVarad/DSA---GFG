//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.countFreq(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int f =0,l=0;
        f = binarySearch(arr,target,true);
        l = binarySearch(arr,target,false);
        if(f == -1 || l == -1){
            if(f == -1 && l == -1){
                return 0;
            } else if(f == -1) f = 0;
            else if(l == -1) l = 0;
        }
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
