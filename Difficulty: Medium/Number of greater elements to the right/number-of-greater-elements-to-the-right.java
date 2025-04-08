//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      int q = sc.nextInt();
      int ind[]=new int[q]; 
      for(int i=0;i<q;i++) ind[i]=sc.nextInt();
      Solution obj = new Solution();
      int ans[] = obj.count_NGEs(n,a,q,ind);
      for(int e : ans)
      System.out.print(e+" ");
      System.out.println();
    
System.out.println("~");
}
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
  public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
      // code here
      Stack<Integer> desc = new Stack<>();
      Stack<Integer> asc = new Stack<>();
      int[] ans  = new int[N];
      for(int i = N-1; i >= 0; i--){
          while(!desc.empty() && arr[i] >= desc.peek()){
              asc.push(desc.pop());
          }
          ans[i] = desc.empty() ? 0 : desc.size();
          desc.push(arr[i]);
          while(!asc.empty()){
              desc.push(asc.pop());
          }
      }
      int[] out = new int[queries];
      for(int k=0; k < queries; k++){
          out[k] = ans[indices[k]];
      }
      return out;
  }
}
     