/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    public int getCount(Node head) {
        int length = 0;
        Node current = head;
        while(current!=null){
            length++;
            current = current.next;
        }
        return length;
    }
}