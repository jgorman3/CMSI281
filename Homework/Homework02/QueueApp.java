// HighArray.java   1.0.0   21-October-2018
// Purpose     : Class that implements Queue.java
// Authors     : Joe Gorman & Lindsey Fry
// Description : The intent of this class is to test the methods
//               in Queue.java
////////////////////////////////////////////////////////////////

public class QueueApp {
  public static void main( String args[] ) {
    Queue newQueue = new Queue(5);

    //testing insert
    System.out.println( "Test Insert" );
    newQueue.insert( 1 );
    newQueue.insert( 5 );
    newQueue.insert( 32 );
    newQueue.insert( 3 );
    newQueue.displayQueue( );


    //testing remove
    System.out.println( "Test Remove" );
    newQueue.remove();
    System.out.println( " Remove 1 " );
    newQueue.remove();
    System.out.println( " Remove 5 " );
    newQueue.remove();
    System.out.println( " Remove 32 " );
    newQueue.displayQueue( );

    //testing wraparound
    System.out.println( "Test Wrap Around " );
    newQueue.insert( 14 );
    newQueue.insert( 12 );
    newQueue.insert( 45 );
    //newQueue.insert( 48 );
    newQueue.displayQueue( );

    // testing displayQueue
    System.out.println( "Test Display " );
    System.out.print( " Current queue: " );
    newQueue.displayQueue( );
    System.out.println();

    System.out.println( " Adding 13 " );
    newQueue.insert( 13 );
    System.out.print( " Current queue: " );
    newQueue.displayQueue();
  }
}
