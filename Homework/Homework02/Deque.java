// Deque.java   1.0.0   21-October-2018
// Purpose     : Class that implements double ended queue 
//               (FLIFLO) data structure
// Authors     : Joe Gorman & Lindsey Fry
// Description : The intent of the this class is to be able to 
//               access data from the back and front of sequential list
////////////////////////////////////////////////////////////////
public class Deque {
    private int maxSize;
    private int front;
    private int rear;
    private int nItems;
    private long[] dArray;


    public Deque( int size ) {
        maxSize = size;
        front = 0;
        rear = -1;
        nItems = 0;
        dArray = new long[maxSize];
    }

    //insert at front of array
    public void insertLeft( long j ) {
        if ( front == 0 ) {
            front = maxSize;
        }
        dArray[--front] = j;
        nItems++;
    }

    //insert at rear of array
    public void insertRight( long j ) {
        if ( rear == maxSize - 1 ) {
            rear = -1;
        }
        dArray[++rear] = j;
        nItems++;
    }

    //Removes from the front
    public long removeLeft() {
        long temp = dArray[front++];
        if ( front == maxSize ) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    //removes item at rear
    public long removeRight() {
        long temp = dArray[rear--];
        if ( rear == -1 ) {
            rear = maxSize-1;
        }
        nItems--;
        return temp;
    }


    public boolean isEmpty() {
        return ( nItems == 0 );
    }


    public boolean isFull() {
        return ( nItems == maxSize );
    }


    public void displayDequeue() {
        int index = front;
        for ( int i = 0; i < nItems; i++ ) {
            System.out.print( dArray[index] + " " );
            if ( index == maxSize - 1 ) {
                index = 0;
            }
            else {
                index++;
            }
        }
        System.out.println();
    }
  }
