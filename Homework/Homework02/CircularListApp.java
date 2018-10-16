class CircularListApp
{
  public static void main(String[] args)
  {
    CircularList myList = new CircularList();
    myList.insertion( 23 );
    System.out.println(myList.getSize());
    myList.insertion( 19 );
    System.out.println(myList.getSize());
    myList.insertion( 17 );
    System.out.println(myList.getSize());
    myList.insertion( 13 );
    System.out.println(myList.getSize());
    myList.insertion( 11 );
    System.out.println(myList.getSize());
    myList.insertion(  7 );
    System.out.println(myList.getSize());
    myList.insertion(  5 );
    System.out.println(myList.getSize());
    myList.insertion(  3 );
    System.out.println(myList.getSize());
    myList.insertion(  2 );
    myList.printList();

    myList.deletion(11);
    myList.deletion(7);
    System.out.println(myList.getSize());
    myList.printList();

    myList.searching(17);
    //System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 2
    //myIt.next();
    //System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 3
    //myIt.next();
    //System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 5
    //myIt.next();
    //System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 7
    //myIt = myList.getIteratorAt( 3 );
    //System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 7
    /*myIt.next();
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 11
    myIt.next();
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 13
    myIt.next();
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 17
    myIt.next();
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 19
    myIt.next();
    System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 23
    */
  }
}
