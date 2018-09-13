/** IntListInterface.java   1.0.0   13-September-2018
*  Purpose    : Simple Interfaces that works with IntList.java
*  Author     : Joe Gorman
*  Description: Interface implements four different methods from IntList.java
*/
public interface IntListInterface {
      int getValueAtIndex( int index );
      boolean append( int valueToAdd );
      boolean insertValueAtIndex( int value, int index );
      int removeValueAtIndex( int index );
   }
