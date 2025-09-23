/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        ArrayList<Integer> arr = new ArrayList<>();
        Node curr = head;
        while(curr!=null){
            arr.add(curr.data);
            curr = curr.next;
        }
        return arr;
    }
}