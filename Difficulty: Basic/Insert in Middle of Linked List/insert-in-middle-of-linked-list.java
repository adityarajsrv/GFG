

/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        if(head == null) return new Node(x);
        
        if(head.next == null){
            head.next = new Node(x);
            return head;
        }
        
        Node slow = head, fast = head;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node newNode = new Node(x);
        newNode.next = slow.next;
        slow.next = newNode;
        
        return head;
    }
}