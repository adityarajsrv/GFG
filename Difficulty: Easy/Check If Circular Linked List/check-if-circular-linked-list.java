/* Structure of LinkedList
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) {
        Node curr = head;
        while(curr!=null){
            if(curr.next == head){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
}