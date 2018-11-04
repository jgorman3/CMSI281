//class that implements Simon Says game
import java.util.Scanner;
import java.util.Random;

public class Simon{

  private Node head;
  private int size;
  private String blue = "B";
  private String red = "R";
  private String yellow = "Y";
  private String green = "G";
  private Simon.Iterator current;

  public Simon(){
    head = null;
    size = 0;
  }

  public String randomDisk(){
    Random rand = new Random();
    int randInt = rand.nextInt(4);
    return simon[randInt];
  }

  public int getSize() {
    return size;
  }

  public void prepend( String dataToAdd ) {
    Node currentHead = head;
    head = new Node( dataToAdd );
    head.next = currentHead;
    size++;
  }

  public Iterator getIteratorAt( int index ) throws IllegalArgumentException {
    if ((index > size) || (index < 0)) {
      throw new IllegalArgumentException();
    }
    Iterator it = new Iterator();
    while( index > 0) {
      it.next();
      index--;
    }
    return it;
  }

  //display disks
  private class Node {
     String data;               //remember this is an "IntLinkedList"
     Node next;              //here's the self-referential part

     // constructor
     public Node( String d) {
       data = d;
       next = null;
     }
  }

  public class Iterator {
     private Node currentNode;

     public Iterator() {
       currentNode = head;
     }

     public void next() {
       if (currentNode == null) {
         return;
       }
       else {
         currentNode = currentNode.next;
       }
     }

     public boolean hasNext() {
       return ((currentNode != null) && (currentNode.next != null));
     }

     public String getCurrentString() {
       return currentNode.data;
     }
  }

  //simon game

  public static void main(String[] args){
    Simon game = new Simon();
    System.out.println("Welcome to Simon Says!");
    System.out.println(game.randomDisk());
    System.out.println(game.randomDisk());
    System.out.println(game.randomDisk());
    System.out.println(game.randomDisk());

  }
}
