// DequeApp.java   1.0.0   21-October-2018
// Purpose     : Class that implements deque (FLIFLO) data structure
// Authors     : Joe Gorman & Lindsey Fry
// Description : The intent of this class is to test deque in Deque.java
////////////////////////////////////////////////////////////////
public class DequeApp {

    public static void main( String args[] ) {
        Deque newDequeue = new Deque( 5 );

        System.out.println( "Test Insert Right");
        newDequeue.insertRight( 4 );
        newDequeue.insertRight( 20 );
        newDequeue.insertRight( 15 );
        newDequeue.insertRight( 32 );
        newDequeue.displayDequeue();

        System.out.println( "Test Remove Left");
        newDequeue.removeLeft();
        newDequeue.displayDequeue();
        newDequeue.removeLeft();
        newDequeue.displayDequeue();
        newDequeue.removeLeft();
        newDequeue.displayDequeue();

        System.out.println( "Test Insert Left");
        newDequeue.insertLeft( 18 );
        newDequeue.insertLeft( 13 );
        newDequeue.insertLeft( 24 );
        newDequeue.insertLeft( 23 );
        newDequeue.displayDequeue();

        System.out.println( "Test Remove Right");
        newDequeue.removeRight();
        newDequeue.displayDequeue();
        newDequeue.removeRight();
        newDequeue.displayDequeue();

        System.out.println( "Test Is Empty" );
        System.out.println( " Dequeue empty? " + newDequeue.isEmpty() );  //false
        System.out.println( " Dequeue full? " + newDequeue.isFull() );   //false
        newDequeue.insertLeft( 143 );
        newDequeue.insertRight( 26 );
        newDequeue.displayDequeue();
        //newDequeue.getSize();
        System.out.println( " Dequeue full? " + newDequeue.isFull() );   //true
        newDequeue.removeRight();
        newDequeue.removeRight();
        newDequeue.removeRight();
        newDequeue.removeRight();
        newDequeue.removeRight();
        newDequeue.displayDequeue();
        System.out.println( " Dequeue empty? " + newDequeue.isEmpty() );  //true
    }
}
