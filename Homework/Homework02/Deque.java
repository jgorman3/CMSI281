class Deque {

  private int maxSize;
  private long[] deqArray;
  private int front;
  private int rear;
  private int nItems;

  public Deque(int s){
    maxSize = s;
    deqArray = new long[maxSize];
    front = 0;
    rear = -1;
    nItems = 0;
  }
  //----------------------------------------------
  public void insertLeft(long j){
    if (front == maxSize-1)
      front = 0;
    deqArray[front++] = j;
    nItems++;
  }
  //----------------------------------------------
  public void insertRight(long j){
    if(rear == maxSize-1) // deal with wraparound
      rear = -1;
    deqArray[++rear] = j; // increment rear and insert
    nItems++; // one more item
  }
  //----------------------------------------------
  public long removeLeft(){
    long temp = deqArray[front++]; // get value and incr front
    if(front == maxSize) // deal with wraparound
      front = 0;
    nItems--; // one less item
    return temp;
  }
  //----------------------------------------------
  public long removeRight(){
    long temp = deqArray[rear++];
    if (rear == maxSize)
      rear = -1;
    nItems--;
    return temp;
  }
  //----------------------------------------------
  public boolean isEmpty(){
    return (nItems==0);
  }
  //----------------------------------------------
  public boolean isFull(){
    return (nItems==maxSize);
  }
}
