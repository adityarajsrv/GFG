/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        if(head == null || head.next == null) return head;
        
        Node current = head;
        Node temp = null;
        
        while(current != null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        
        if(temp!=null){
            head = temp.prev;
        }
        return head;
    }
}