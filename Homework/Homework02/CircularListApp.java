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

    //will be in
    myList.searching(23);
    myList.searching(19);
    myList.searching(17);
    myList.searching(13);
    myList.searching(5);
    myList.searching(3);
    myList.searching(2);

    //not be in
    myList.searching(1);
    myList.searching(40);
    myList.searching(50);
    myList.searching(60);
    myList.searching(70);
    myList.searching(80);
    myList.searching(90);

  }
}
