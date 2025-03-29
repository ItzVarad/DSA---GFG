//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            obj.print_divisors(n);
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution {
    public static void print_divisors(int n) {
        // code here
        Stack<Integer> stack = new Stack<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                System.out.print(i+" ");
                if(n/i != i){
                    stack.push(n/i);
                }
            }
            
        }
        while(!stack.empty()){
            System.out.print(stack.peek()+" ");
            stack.pop();
        }
        
    }
}
