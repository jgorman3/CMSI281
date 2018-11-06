//class that implements Simon Says game
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.lang.Thread;

public class Simon{

  private Node head;
  private int size;
  private String blue = "B";
  private String red = "R";
  private String yellow = "Y";
  private String green = "G";
  private Simon.Iterator current;
  private String[] simon = {blue, red, yellow, green};
  private String[] gameArray = new String[100];
  private int turn;

  public Simon(){
    head = null;
    size = 0;
  }

  public void randomDisk(int turnPlay){
    Random rand = new Random();
    for (int i = 0; i< turnPlay; i++){
      int randInt = rand.nextInt(4);
      gameArray[i] = simon[randInt];
      System.out.print(gameArray[i]);
    }
  }

  public boolean arrayCompare(int turnPlay,String response){
    String concat = "B";
    for (int i = 0; i< turnPlay; i++){
      concat = gameArray[i];
    }
    if (concat.equals(response)){
      return true;
    }
    else{
      return false;
    }
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
    int turn = 1;
    boolean play = true;
    System.out.println("Welcome to Simon Says!\n");
    while (play){
      Simon game = new Simon();
      System.out.println("Here is the sequence.");
      game.randomDisk(turn);
      try {
        Thread.sleep(1000);
      }
      catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
      }
      for (int i=0;i < turn;i++){
        System.out.print("\b");
      }
      for (int i=0;i < turn;i++){
        System.out.println(" ");
      }
      System.out.println("What is the sequence?");
      Scanner input = new Scanner(System.in);
      String response = input.next();
      System.out.println(game.arrayCompare(turn,response));
      if (game.arrayCompare(turn,response)){
        System.out.println("Congratulations! Onto the next round.");
        turn++;
      }
      else {
        System.out.println("Thanks for playing.");
        play = false;
      }
    }
  }
  }
