// Queue.java   1.0.0   21-October-2018
// Purpose     : Class that implements a queue (FIFO) data structure
// Authors     : Joe Gorman & Lindsey Fry
// Description : The intent of the exercise is create a queue with 
//               an underlying sequential list
////////////////////////////////////////////////////////////////
public class Queue{
  private int maxSize;
  private int front;
  private int rear;
  private int nItems;
  private long[] qArray;

  //constructor
  public Queue( int size ){
    maxSize = size;
    front = 0;
    rear = -1;
    nItems = 0;
    qArray = new long[maxSize];
  }

  //Inserts element at end of Queue
  public void insert( long i ){
    if(rear == maxSize - 1){
      rear = -1;
    }
    qArray[++rear] = i;
    nItems++;
    }


  //removes the items at the front and returns value
  public long remove() {
    long t = qArray[front++];
    if( front == maxSize ){
      front = 0;
    }
    nItems--;
    return t;
  }

  //returns value at the Front
  public long peek(){
    return qArray[front];
  }

  public boolean isEmpty(){
    return (nItems == 0);
  }

  public void displayQueue(){
    int index = front;
    for( int k = 0; k < nItems; k++){
      System.out.print( qArray[index] + " " );
      if( index == maxSize - 1){
        index = 0;
      }
      else{
        index++;
      }
    }
    System.out.println();
  }
}
