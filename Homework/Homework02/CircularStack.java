public class CircularStack {


    CircularList myStack;

    CircularStack() {
      myStack = new CircularList();         // constructor
    }

    public void push( int itemToPush ) {
      myStack.insertion(itemToPush);
    }

    public int peek() {
      return myStack.searching(myStack.getCurrentInt());
    }

    public void pop() {
      myStack.deletion(myStack.getCurrentInt());
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
       testStack.pop();
       System.out.println( "Removing top thing: " );         // 57 removed
       testStack.pop();
       System.out.println( "The top of the stack: " + testStack.peek() );      // 51
       testStack.pop();
       System.out.println( "Removing top thing: " );         // 51 removed
       testStack.pop();
       System.out.println( "The top of the stack: " + testStack.peek() );      // 47
       testStack.pop();
       System.out.println( "Removing top thing: " );         // 47 removed
       System.out.println( "The top of the stack: " + testStack.peek() );      // 43

       //testStack.push( testStack.pop() + testStack.pop() );
       System.out.println( "The top of the stack: " + testStack.peek() );      // what'll it be?
    }

  }
