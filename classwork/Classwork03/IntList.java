import java.util.Arrays;
import EmptyListException.*;

public class IntList implements IntListInterface {
   private int[] theList;
   private int[] newList;
   private int   size;
   private int new_length;

   private static final int STARTING_SIZE = 19;    // defines starting size; don't worry, we'll deal

   public IntList() {                        // doesn't HAVE to be declared public, but doesn't hurt
      theList = new int[STARTING_SIZE];
      size = 0;
   }

   public int getValueAtIndex( int index ) throws ArrayIndexOutOfBoundsException {
      if( size == 0 ) {
         //throw new EmptyListException( "The list is empty!" );   // maybe not the best...
         throw new ArrayIndexOutOfBoundsException("The list is empty!" );
      } else if( index > size ) {
         throw new ArrayIndexOutOfBoundsException( "The index value is too large" );
      } else if( index < 0 ) {
         throw new ArrayIndexOutOfBoundsException( "The index value is too small");
      } else {
         return theList[index];
      }
   }

   public boolean append( int valueToAdd ) {
      if( size < theList.length ) {
         theList[size] = valueToAdd;
         size++;
         return true;
      } else {
         // what should we do here, if there's no room?
      }
      return false;
   }

   // we've gotta have this to actually get things to compile
   public boolean insertValueAtIndex( int value, int index ) {
     /*if (index > theList.length) {
       new_length = index + STARTING_SIZE;
       newList = new int[theList.length];
       for (int i = 0; i < index; i++){
         theList[i] = newList[i];
       }
       newList[index] = value;
       for (int i = index + 1; i < theList.length; i++){
         newList[i] = theList[i - 1];
       }
       System.out.println(Arrays.toString(newList));
       return true;
     }
     else if (index < 0) {
       throw new ArrayIndexOutOfBoundsException("List is Empty!");
     }*/
     //else {
     newList = new int[theList.length];
     for (int i = 0; i < index; i++){
       newList[i] = theList[i];
     }
     newList[index] = value;
     for (int i = index + 1; i < newList.length; i++){
       newList[i] = theList[i-1];
     }
     theList = newList;
     System.out.println(Arrays.toString(theList));
     return true;
     }

  public boolean checkIndex(int index) {
    if (index <= theList.length){
      return true;
    }
    else {
      return false;
    }
  }

  public boolean prepend(int value){
    insertValueAtIndex(value,0);
    return true;
  }

   public int removeValueAtIndex( int index ) throws ArrayIndexOutOfBoundsException {
      int value = theList[index];
      if( size == 0 ) {
         //throw new EmptyListException("The list is empty!");   // maybe not the best...
         throw new ArrayIndexOutOfBoundsException("The list is empty!");
      } else if( index > size ) {
         throw new ArrayIndexOutOfBoundsException( "The index value is too large" );
      } else if( index < 0 ) {
         throw new ArrayIndexOutOfBoundsException( "The index value is too small");
      } else {
         holeFiller( index );
      }
      return value;
   }

   private void holeFiller( int index ) {
      for( int i = index; i < size - 1; i++ ) {
         theList[i] = theList[i+1];
      }
      size--;
   }

   public static void main( String[] args ) {
      IntList list = new IntList();
      list.append( 2 );
      list.append( 3 );
      list.append( 5 );
      list.append( 7 );
      System.out.println( list.getValueAtIndex( 3 ) );   // should return the value 7
      list.append( 11 );
      list.append( 13 );
      list.append( 17 );
      list.append( 19 );
      System.out.println( list.getValueAtIndex( 7 ) );      // should return the value 19
      //System.out.println( list.removeValueAtIndex( 3 ) );   // should return the value 7
      System.out.println( list.getValueAtIndex( 3 ) );      // should return the value 11
      System.out.println( list.insertValueAtIndex(6,3));
      System.out.println( list.prepend(1));
      //System.out.println( list.getValueAtIndex( 18 ) );     // just to see what happens

   }
}
