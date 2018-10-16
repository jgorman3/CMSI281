public class CircularStack {


    CircularList myStack;

    CircularStack() {
      myStack = new CircularList();         // constructor
    }

    public void push( int itemToPush ) {

    }

    public int peek() {
            // we use the iterator
    }

    public int pop() {

    }

    public static void main( String[] args ) {
       CircularStack testStack = new CircularStack();
       testStack.push( 19 );
       testStack.push( 23 );
       testStack.push( 29 );
       testStack.push( 31 );
       testStack.push( 37 );
       testStack.push( 41 );
       testStack.push( 43 );
       testStack.push( 47 );
       testStack.push( 51 );
       testStack.push( 57 );
       System.out.println( "The top of the stack: " + testStack.peek() );      // 57
       System.out.println( "Removing top thing: " + testStack.pop() );         // 57 removed
       System.out.println( "The top of the stack: " + testStack.peek() );      // 51
       System.out.println( "Removing top thing: " + testStack.pop() );         // 51 removed
       System.out.println( "The top of the stack: " + testStack.peek() );      // 47
       System.out.println( "Removing top thing: " + testStack.pop() );         // 47 removed
       System.out.println( "The top of the stack: " + testStack.peek() );      // 43
       testStack.pushd( testStack.pop() + testStack.pop() );
       System.out.println( "The top of the stack: " + testStack.peek() );      // what'll it be?
    }

  }
}
