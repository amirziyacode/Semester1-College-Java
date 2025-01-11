package DSA.LinkList;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;


    public void addLast(int value){
        var node  = new Node(value);
        if(isEmpty())
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addFirst(int value){
        var node  = new Node(value);
        if(isEmpty())
            head = tail = node;
        else {
            head.next = node;
            head = node;
        }
        size++;
    }

    public int indexOf(int value){
        var current = head;
        int index = 0;
        while(current != null){
            if(value == current.value) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public  boolean contains(int value){
        return  indexOf(value) != -1;
    }

    public void removeFirst() {
        if (isEmpty()) throw new NoSuchElementException();
        if (head == tail) {
            tail = head = null;
            return;
        } else {
        var second = head.next;
        head.next = null;
        head = second;}
        size --;
    }

    public void removeLast(){
        if(isEmpty()) throw new NoSuchElementException();
        if(head == tail) {
            tail = head = null;
            return;
        }else {
            var previous = getPrevious(tail);
            tail = previous;
            tail.next = null;
        }

        size--;

    }



    public int size(){
        return size;
    }

    // [10 -> 20 -> 30 -> null]
    public void revers(){
        if(isEmpty()) throw new NoSuchElementException();
        Node first = head;
        Node second = head.next;
        tail = first;
        tail.next = null;
        while (second != null){
            Node next = second.next;
            second.next = first;
            first = second;
            second = next;
        }

        head = first;
    }

    public int findKth(int k){
        if(isEmpty()) throw new NoSuchElementException();
        revers();
        int index= 1;
        Node current = head;
        while(current != null){
            if(index == k){
                return current.value;
            }
            current = current.next;
            index++;

        }
        return-1;
    }


    public int[] toArray(){
        int[] array = new int[size];
        var current = head;
        int index = 0;
        while(current != null){
            array[index] = current.value;
            current = current.next;
            index++;
        }
        return array;
    }

    private boolean isEmpty(){
        return head == null;
    }
    private Node getPrevious(Node node) {
        var current = head;
        while(current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }
}
