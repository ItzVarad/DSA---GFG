//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(new Solution().infixToPostfix(br.readLine().trim()));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public static String infixToPostfix(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        StringBuilder str = new StringBuilder();
        int n = s.length(), i =0;
        while(i < n){
            char ch = s.charAt(i);
            if((ch >= 'A' && ch <= 'Z') || 
                (ch >= 'a' && ch <= 'z') || 
                (ch >= '0' && ch <= '9')){
                str.append(ch);        
            } else if(ch == '('){
                st.push(ch);
            } else if(ch == ')'){
                while(!st.empty() && st.peek() != '('){
                    str.append(st.pop());
                }
                st.pop();
            } else{
                while(!st.empty() && priority(ch) <= priority(st.peek())){
                    str.append(st.pop());
                }
                st.push(ch);
            }
            i++;
        }
        while(!st.empty()){
            str.append(st.peek());
            st.pop();
        }
        return str.toString();
        
    }
    private static int priority(char c){
        if(c == '^') return 3;
        if(c == '*' || c == '/') return 2;
        if(c == '+' || c == '-') return 1;
        return -1;
    }
}