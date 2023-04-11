package org.example.libs;

public class LinkedListNode {
    private LinkedListNode prev;
    private LinkedListNode next;
    private int val;

    public LinkedListNode(int val, LinkedListNode next, LinkedListNode prev) {
        this.val = val;

        this.prev = prev;
        this.next = next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
    public LinkedListNode getNext(){
        return this.next;
    };

    public void setPrev(LinkedListNode prev) {
        this.prev = prev;
    }
    public LinkedListNode getPrev() {
        return this.prev;
    }

    public void setVal(int val) {
        this.val = val;
    }
    public int getVal() {
        return this.val;
    }

}
