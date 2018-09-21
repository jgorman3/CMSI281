import java.lang.Exception;

public class IntLinkedList {

  private Node head;
  private int size;
  private Iterator start;
  private Iterator next;

  //the constructor
  public IntLinkedList() {
    head = null;
    size = 0;
  }

  public int getSize(){
    return size;
  }

  public void prepend( int dataToAdd ) {
    Node currentHead = head;
    head = new Node( dataToAdd );
    head.next = currentHead;
    size++;
  }

  public boolean insertAt(Node index, int value) {
    Node n = new Node(value);
    Iterator start = getIteratorAt(index);
    n.next = start.next;
    start.next = n.next;
    //n = it.next();
    //it.next = n;
    //start = getIteratorAt(index);
    //it = it.next();
    //start = it.current.next;
    return true;

  }

  public boolean removeAt(int index) {
    current = getIteratorAt(index);
    int value = current.getCurrentInt();
    previous = getIteratorAt(index-1);
    current.next();
    previous = current.next();
    return value;
  }

   private class Node {
      int data;               //remember this is an "IntLinkedList"
      Node next;              //here's the self-referential part

      // constructor
      public Node( int d) {
        data = d;
        next = null;
      }
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

      public int getCurrentInt() {
        return currentNode.data;
      }
   }
}
