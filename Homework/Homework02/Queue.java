// Queue.java   1.0.0   21-October-2018
// Purpose     : Class that implements a queue (FIFO) data structure
// Authors     : Joe Gorman & Lindsey Fry
// Description : The intent of the exercise is create a queue with 
//               an underlying sequential list
////////////////////////////////////////////////////////////////
class Queue
{
private int maxSize;
private long[] queArray;
private int front;
private int rear;
private int nItems;

/*Write a method for the Queue class in the queue.java program (Listing 4.4)
that displays the contents of the queue. Note that this does not mean simply
displaying the contents of the underlying array. You should show the queue contents
from the first item inserted to the last, without indicating to the viewer whether
the sequence is broken by wrapping around the end of the array. Be careful that one
item and no items display properly, no matter where front and rear are*/
//--------------------------------------------------------------
public Queue(int s) // constructor
{
  maxSize = s;
  queArray = new long[maxSize];
  front = 0;
  rear = -1;
  nItems = 0;
}
//--------------------------------------------------------------
public void insert(long j) // put item at rear of queue
{
  if(rear == maxSize-1) // deal with wraparound
    rear = -1;
  queArray[++rear] = j; // increment rear and insert
  nItems++; // one more item
}
//--------------------------------------------------------------
public long remove() // take item from front of queue
{
  long temp = queArray[front++]; // get value and incr front
  if(front == maxSize) // deal with wraparound
    front = 0;
  nItems--; // one less item
  return temp;
}
//--------------------------------------------------------------
public long peekFront() // peek at front of queue
{
  return queArray[front];
}
//--------------------------------------------------------------
public void dispQueue(){
  if (isEmpty() == true) {
    System.out.println("Queue is empty!");
  }
  if (maxSize == 1){
    System.out.println(peekFront());
  }
  for (int i = 0; i < nItems; i++){
    System.out.println(queArray[i]);
  }
}
//--------------------------------------------------------------
public boolean isEmpty() // true if queue is empty
{
  return (nItems==0);
}
//--------------------------------------------------------------
public boolean isFull() // true if queue is full
{
  return (nItems==maxSize);
}
//--------------------------------------------------------------
public int size() // number of items in queue
{
  return nItems;
}
//--------------------------------------------------------------
} // end class Queue
