/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*  File name     :  BubbleSortApp.java
*  @author       :  Lindsey Fry and Joe Gorman
*  Date written  :  2018-11-06
*
*  Notes         :  None right now.  I'll add some as they occur.
*  Warnings      :  None
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

class BubbleSortApp
{
public static void main(String[] args)
{
int maxSize = 100; // array size
BubbleSort arr; // reference to array
arr = new BubbleSort(maxSize); // create the array
arr.insert(7); // insert 10 items
arr.insert(9);
arr.insert(4);
arr.insert(5);
arr.insert(2);
arr.insert(8);
arr.insert(1);
arr.insert(0);
arr.insert(6);
arr.insert(3);
arr.display(); // display items
arr.bubbleSort(); // bubble sort them
arr.display(); // display them again
arr.oddEvenSort();
arr.display();
} // end main()
} // end class BubbleSortApp
