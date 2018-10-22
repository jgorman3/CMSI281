
// CircularStack.java   1.0.0   21-October-2018
// Purpose     : Class that implements a Stack Data Structure (LIFO) from Circular List
// Authors     : Joe Gorman & Lindsey Fry
// Description : The intent of the exercise is to be able to push, pop,
//               and peek within the rules of a stack data structure
////////////////////////////////////////////////////////////////
public class CircularStack {


    CircularList myStack;
    int popCount;

    CircularStack() {
      myStack = new CircularList();         // constructor
    }

    public void push( int itemToPush ) {
      myStack.insertion(itemToPush);
    }

    public int peek() {
      int value = 0;
      if (popCount == 0){
        popCount++;
        return myStack.searching(myStack.getCurrentInt());
      }
      else {
        for (int i = 0; i < myStack.getSize() - popCount; i++){
          myStack.step();
        }
        value = myStack.searching(myStack.getCurrentInt());
        return value;
      }
    }

    public void pop() {
      myStack.deletion(myStack.getCurrentInt());
    }

    public void printList() {
      myStack.printList();
    }

    public void step() {
      myStack.step();
    }

    public int getSize() {
      return myStack.getSize();
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

       testStack.printList();
       System.out.println( "The top of the stack: " + testStack.peek() );
       testStack.pop();

       testStack.printList();
       System.out.println( "The top of the stack: " + testStack.peek() );
       testStack.pop();

       testStack.printList();
       System.out.println( "The top of the stack: " + testStack.peek() );
       testStack.pop();

       testStack.printList();
       System.out.println( "The top of the stack: " + testStack.peek() );
       testStack.pop();

       testStack.printList();
       System.out.println( "The top of the stack: " + testStack.peek() );
       testStack.pop();

       testStack.printList();
       System.out.println( "The top of the stack: " + testStack.peek() );
       testStack.pop();

       testStack.printList();
       System.out.println( "The top of the stack: " + testStack.peek() );
       testStack.pop();

       testStack.printList();
       System.out.println( "The top of the stack: " + testStack.peek() );
       testStack.pop();

       testStack.printList();
       System.out.println( "The top of the stack: " + testStack.peek() );
       testStack.pop();
       
       testStack.printList();
       System.out.println( "The top of the stack: " + testStack.peek() );
    }

  }
