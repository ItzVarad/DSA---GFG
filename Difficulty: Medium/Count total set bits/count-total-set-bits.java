//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


// } Driver Code Ends

//User function Template for Java

class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
        
        // Your code here
        //indexing of bits start from 0. So have to consideration of 0
        n++;
        
        int powerOf2 = 1;
        int count = 0;
        
        while(powerOf2 <= n){
            // no. of groups
            int pairs = n / powerOf2;
            
            // no. of set bit groups
            int setBit = pairs / 2;
            
            //no. of set bits in set bit groups
            count += setBit * powerOf2;
            
            // if no. of set bit group i odd that means there might be some
            // bits remaining to form complete group
            count += (pairs & 1) != 0 ? n % powerOf2: 0;
            
            //raise power of 2 to move next bit group
            powerOf2 = powerOf2 << 1;
            
        }
        return count;
    }
}


//{ Driver Code Starts.

// Driver code
class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int x, n;
		while(t-->0) {
	        n = sc.nextInt();//input n

		    Solution obj = new Solution();

		    System.out.println(obj.countSetBits(n));//calling countSetBits() method
		
System.out.println("~");
}
	}
}

// } Driver Code Ends