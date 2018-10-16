import java.lang.Exception;

public class CircularList{

  private Node current;
  private int size;

  //the constructor
  public CircularList() {
    current = null;
    size = 0;
  }

  public int getSize(){
    return size;
  }

  public void insertion(int value) {
    Node newnode = new Node(value);
    if (size == 0){
      current = newnode;
      current.next = current;
      size++;
    }
    else {
      newnode.next = current.next;
      current.next = newnode;
      size++;
      current = newnode;
    }
  }

  public void deletion(int value) {
    for ( int i = 0; i < size; i++ ) {
      if ( current.next.data == value ) {
        current.next = current.next.next;
        size--;
      }
      step();
    }
  }

  public void step() {
    current = current.next;
  }

  public int searching(int value){
    for (int i = 1; i < size; i++) {
      if (value == current.data) {
        value = current.data;
        break;
      }
    }
    return value;
  }

  public void printList() {
    System.out.print("Circular List: ");
    for (int i = 0; i < size; i++){
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }

  public int getCurrentInt() {
    return current.data;
  }

   private class Node {
      int data;               //remember this is an "IntLinkedList"
      Node next;              //here's the self-referential part

      // constructor
      public Node(int d) {
        data = d;
        next = null;
      }
   }
}
