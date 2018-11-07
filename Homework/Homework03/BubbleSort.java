/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*  File name     :  BubbleSort.java
*  @author       :  Lindsey Fry and Joe Gorman
*  Date written  :  2018-11-06
*
*  Notes         :  None right now.  I'll add some as they occur.
*  Warnings      :  None
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

// oddEven.java
// demonstrates bubble sort
// to run this program: C>java BubbleSortApp
////////////////////////////////////////////////////////////////
class BubbleSort{
  private long[] a; // ref to array a
  private int nElems; // number of data items
//--------------------------------------------------------------
public BubbleSort(int max) // constructor
{
  a = new long[max]; // create the array
  nElems = 0; // no items yet
}
//--------------------------------------------------------------
public void insert(long value) // put element into array
{
  a[nElems] = value; // insert it
  nElems++; // increment size
}
//--------------------------------------------------------------
public void display() // displays array contents
{
  for(int j=0; j<nElems; j++){ // for each element,
    System.out.print(a[j] + " "); // display import junit.framework.TestCase;
    // System.out.println("");
  }
  System.out.println("");
}
//--------------------------------------------------------------
public void bubbleSort(){
  int out, in;
  for(out=nElems-1; out>1; out--) // outer loop (backward)
  for(in=0; in<out; in++) // inner loop (forward)
  if( a[in] > a[in+1] ) // out of order?
  swap(in, in+1); // swap them
} // end bubbleSort()
//--------------------------------------------------------------

public void oddEvenSort(){
  for(int i = 0; i < nElems; i++){
    for( int j = 1; j < nElems - 1; j+=2){
      if( a[j] > a[j+1]){
        swap(j, j+1);
        //display();
      }
    }
    for( int j = 0; j < nElems - 1; j+=2){
      if( a[j] > a[j+1]){
        swap(j, j+1);
      }
      //System.out.println("Showing evens " + j);
    }
  }
}
private void swap(int one, int two)
{
  long temp = a[one];
  a[one] = a[two];
  a[two] = temp;
}
//--------------------------------------------------------------
} // end class BubbleSort
