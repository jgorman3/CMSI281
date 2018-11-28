
/** BinaryTreeNode.java   1.0.0   27-November-2018
*  Purpose    : Class that supports tree operations by 
                creating tree nodes
*  Author     : Joe Gorman & Lindsey Fry
*  Description: The intent of this program is to create methods
*               that will aid in developing trees. Trees are built
*               from the BinaryTreeNode class.
**/
public class BinaryTreeNode {

   private int data;
   private BinaryTreeNode left;
   private BinaryTreeNode right;

   BinaryTreeNode( int d ) {
       data = d;
       left = null;
       right = null;
   }

   public void add( int s, String child ) {
      child = child.toUpperCase();
      if( child.equals( "L" ) ) {
         left = new BinaryTreeNode( s );
      } else if( child.equals( "R" ) ) {
         right = new BinaryTreeNode( s );
      } else {
         throw new IllegalArgumentException();
      }
   }

   public BinaryTreeNode getChild( String child ) {
      child = child.toUpperCase();
      if( child.equals("L") || child.equals("R") ) {
         return (child.equals("L") ? left : right);
      } else {}
         throw new IllegalArgumentException();
      }

   public int getData() {
       return data;
   }

   public static void inOrderPrinter( BinaryTreeNode node ) {
      if( node == null ) {
         return;
      }
      inOrderPrinter( node.getChild( "L" ) );
      System.out.print( "[" + node.data + "]" );
      inOrderPrinter( node.getChild( "R" ) );
   }
}
