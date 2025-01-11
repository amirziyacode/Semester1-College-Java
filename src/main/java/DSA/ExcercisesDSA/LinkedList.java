package DSA.ExcercisesDSA;

public class LinkedList {
   private Node first;
   private Node last;
   private int size;


   public void addFirst(int data) {
       Node node = new Node(data);
       if(first == null) {
           first = last = node;
       }else{
           first.forward = node;
           node.back = first;
           first = node;
       }
       size++;
   }

   public void addLast(int data) {
       Node node = new Node(data);
       if(first == null) {
           first = last = node;
       }else  {
           last.forward = node;
           node.back = last;
           last = node;
       }
       size++;
   }

   public void sorted(){
       var current = first;
       var next = current.forward;
       while (next != null) {
           if(current.value == next.value){
               current.forward = next.forward;
               size--;
           }
           current = next;
           next = next.forward;
       }
   }

   public void revers(){
       var current = first;
       var second = first.forward;
       last = first;
       last.forward = null;
       while(second != null){
           var next = second.forward;
           second.forward = current;
           current = second;
           second = next;
       }
     first = current;
   }

    public Node getPrev(Node node){
       var current = first;
       while(current != null){
           if(current.forward == node) return current;
           current = current.forward;
       }
       return node;
    }


   public int[] toArray() {
       int[] array = new int[size];
       var current = first;
       int index = 0;
       while(current != null) {
           array[index] = current.value;
           current = current.forward;
           index++;
       }
       return array;
   }
}

class Node{
    int value;
    Node forward;
    Node back;

    public Node(int value) {
        this.value = value;
    }
}
