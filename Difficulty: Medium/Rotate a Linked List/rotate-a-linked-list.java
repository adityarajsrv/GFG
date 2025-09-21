/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        if(k==0 || head == null || head.next == null) return head;
        
        int len = 1;
        Node tail = head;
        while(tail.next!=null){
            len++;
            tail = tail.next;
        }
        k = k%len;
        if(k==0) return head;
        
        tail.next = head;
        
        Node newTail = head;
        for(int i=1; i<k; i++){
            newTail = newTail.next;
        }
        
        head = newTail.next;
        newTail.next = null;
        return head;
    }
}