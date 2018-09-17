// highArray.java
// demonstrates array class with high-level interface
// to run this program: C>java HighArrayApp
////////////////////////////////////////////////////////////////
class HighArray
   {
   private long[] a;                 // ref to array a
   private int nElems;               // number of data items
   private long EMPTY_ARRAY = -1;    // used in getMax(), denotes empty array
   private long difference;
   private long max_value = 0;
   //-----------------------------------------------------------
   public HighArray(int max)         // constructor
      {
      this.a = new long[max];                 // create the array
      nElems = 0;                        // no items yet
      }
   //-----------------------------------------------------------
   public boolean find(long searchKey)
      {                              // find specified value
      int j;
      for(j=0; j<nElems; j++)            // for each element,
         if(a[j] == searchKey)           // found item?
            break;                       // exit loop before end
      if(j == nElems)                    // gone to end?
         return false;                   // yes, can't find it
      else
         return true;                    // no, found it
      }  // end find()

    public long getMax() {
      if (nElems == 0) {
        return EMPTY_ARRAY;
      }
      else {
        for (int i = 0; i < nElems; i++) {
          if (a[i] > max_value) {
            max_value = a[i];
          }
        }
      }
      return max_value;
    }

    public void noDups() {
      int count = 0;
      for (int j = 0; j < nElems; j++) {
        for(int i = j+1; i < nElems; i++) {
          if (a[j] == a[i]) {
            a[i] = -1;
            count++;
          }
        }
      }
      for (int l = 0; l < count; l++) {
        this.delete(-1);
      }
    }
   //-----------------------------------------------------------
   public void insert(long value)    // put element into array
      {
      a[nElems] = value;             // insert it
      nElems++;                      // increment size
      }
   //-----------------------------------------------------------
   public boolean delete(long value)
      {
      int j;
      for(j=0; j<nElems; j++)        // look for it
         if( value == a[j] )
            break;
      if(j==nElems)                  // can't find it
         return false;
      else                           // found it
         {
         for(int k=j; k<nElems; k++) // move higher ones down
            a[k] = a[k+1];
         nElems--;                   // decrement size
         return true;
         }
      }  // end delete()
   //-----------------------------------------------------------
   public void display()             // displays array contents
      {
      for(int j=0; j<nElems; j++)       // for each element,
         System.out.print(a[j] + " ");  // display it
      System.out.println("");
      }
   //-----------------------------------------------------------
   }  // end class HighArray
////////////////////////////////////////////////////////////////

