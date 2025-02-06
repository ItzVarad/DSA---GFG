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
        // code here.
        Node newHead = reverseLL(head);
        Node temp = newHead;
        int sum = 1;
        while(temp != null){
            sum = temp.data + sum;
            if(sum > 9){
                temp.data = 0;
                sum = 1;
            }
            else {
                temp.data = sum;
                break;
            }
            temp = temp.next;
        }
        newHead = reverseLL(newHead);
        if(sum == 1){
            Node one = new Node(1);
            one.next = newHead;
            return one;
        }
        return newHead;
        
        
    }
    private Node reverseLL(Node head){
        if(head == null || head.next == null) return head;
        Node start = null;
        Node mid = head;
        while(mid != null){
            Node end  = mid.next;
            mid.next = start;
            start = mid;
            mid = end;
        }
        return start;
    }
}
