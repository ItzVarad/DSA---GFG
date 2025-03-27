//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int l;
            l = sc.nextInt();

            int r;
            r = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.findXOR(l, r);

            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int findXOR(int l, int r) {
        return helper(l-1) ^ helper(r);
    }
    private static int helper(int n){
        // n & 3 is equal to n % 4 (bitman works on power of 2 as i-1)
        if((n & 3) == 0){
            return n;
        }
        if((n & 3) == 1){
            return 1;
        }
        if((n & 3) == 2){
            return n+1;
        }
        return 0;
    }
}