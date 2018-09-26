import java.lang.Exception;

public class IntLinkedList {

  private Node head;
  private int size;
  private IntLinkedList.Iterator current;
  private IntLinkedList.Iterator previous;

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

  public void insertAt(int index, int value) {
    if ( index > size - 1 || index < 0 ) {
      throw new IllegalArgumentException("Index too long!");
    }
    Node data = new Node(value);
    current = getIteratorAt(index - 1);
    data.next = current.currentNode.next;
    current.currentNode.next = data;
    size++;
  }

  public void removeAt(int index) {
    if ( index > size - 1 || index < 0 ) {
      throw new IllegalArgumentException("Index too long!");
    }
    Iterator curren = getIteratorAt(index - 1);
    Node curr = curren.currentNode;
    curr.next = curr.next.next;
    size--;
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
