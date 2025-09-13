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
    public Node insertAtEnd(Node head, int x) {
        Node newNode = new Node(x);
        if(head == null) return newNode;
        
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;
        return head;
    }
}