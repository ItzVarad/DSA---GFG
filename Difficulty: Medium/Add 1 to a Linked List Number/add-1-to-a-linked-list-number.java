//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class GfG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(str[i]));
                tail = tail.next;
            }
            Solution obj = new Solution();
            head = obj.addOne(head);
            printList(head);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        int carry = carryCount(head);
        if(carry == 1){
            Node newHead = new Node(1);
            newHead.next = head;
            return newHead;
        }
        return head;
    }
    private int carryCount(Node head){
        if(head == null || head.next == null) {
            head.data += 1;
            if(head.data > 9){
                head.data = 0;
                return 1;
            }
            else{
                return head.data;
            }
        }
        int carry = carryCount(head.next);
        if(carry == 1){
            head.data += 1;
            if(head.data > 9){
                head.data = 0;
                return 1;
            }
            else{
                return head.data;
            }
        } else{
            return 0;
        }
    }
}
