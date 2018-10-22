// CircularList.java   1.0.0   21-October-2018
// Purpose     : Class that implements a circular singly-linked list
// Authors     : Joe Gorman & Lindsey Fry
// Description : The intent of the exercise is to create a list with 
//               no beginning or end and only one one node reference
////////////////////////////////////////////////////////////////
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
      }
      step();
    }
    size--;
  }

  public void step() {
    current = current.next;
  }

  public void stepDown() {
    current.next = current;
  }

  public int searching(int value){
    if (current.data == value) {
      System.out.println(value + " is in the list.");
      return value;
    }
    else {
      step();
    }
    for (int i = 0; i < size; i++){
      if (current.data == value) {
        System.out.println(value + " is in the list.");
        return value;
      }
        step();
      }
      System.out.println(value + " is not in the list.");
      return -1;
    }

  public void printList() {
    System.out.print("Circular List: ");
    for (int i = 0; i < size; i++){
      System.out.print(current.data + " ");
      step();
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

