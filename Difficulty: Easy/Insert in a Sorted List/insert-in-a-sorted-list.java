/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head, int key) {
        Node newNode = new Node(key);
        if(head == null) return newNode;
        
        if(head.data >= key){
            newNode.next = head;
            return newNode;
        }
        
        Node curr = head;
        while(curr.next != null && curr.next.data < key){
            curr = curr.next;
        }
        
        newNode.next = curr.next;
        curr.next = newNode;
        
        return head;
    }
}