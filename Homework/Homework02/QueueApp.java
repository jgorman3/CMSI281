// HighArray.java   1.0.0   21-October-2018
// Purpose     : Class that implements Queue.java
// Authors     : Joe Gorman & Lindsey Fry
// Description : The intent of this class is to test the methods
//               in Queue.java
////////////////////////////////////////////////////////////////
class QueueApp
{
  public static void main(String[] args)
  {
    Queue theQueue = new Queue(5); // queue holds 5 items
    theQueue.insert(10); // insert 4 items
    theQueue.insert(20);
    theQueue.insert(30);
    theQueue.insert(40);
    theQueue.remove();   // remove 3 items
    theQueue.remove();   // (10, 20, 30)
    theQueue.remove();
    theQueue.insert(50); // insert 4 more items
    theQueue.insert(60); // (wraps around)
    theQueue.insert(70);
    theQueue.insert(80);
    theQueue.dispQueue();
    //while( !theQueue.isEmpty() ) // remove and display
    //{ // all items
    //  long n = theQueue.remove(); // (40, 50, 60, 70, 80)
    //  System.out.print(n);
    //  System.out.println(' ');
    //}
    //System.out.println(' ');
  } // end main()
} // end class QueueApp
