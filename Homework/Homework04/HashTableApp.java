import java.io.*;
import java.util.Random;

class HashTableApp
{
public static void main(String[] args) throws IOException {
  String[] animals = {"dog", "cow", "sheep", "cat", "horse", "lions", "bears"};
  DataItem aDataItem;
  int size = 10000;
  int n, keysPerCell;
  String aKey;
  //Open Addressing 537
  // get sizes
  System.out.print("Enter size of hash table: ");
  size = getInt();
  System.out.print("Enter initial number of items: ");
  n = getInt();
  keysPerCell = 10;
  Random rand = new Random();
  // make table
  HashTable theHashTable = new HashTable(size);
  for(int j=0; j<n; j++) // insert data
  {
    aKey = animals[rand.nextInt(7)];
    //aKey = (int)(java.lang.Math.random() * keysPerCell * size);
    aDataItem = new DataItem(aKey);
    theHashTable.insert(aDataItem);
  }
  while(true) // interact with user
  {
    System.out.print("Enter first letter of");
    System.out.print("show, insert, delete, or find: ");
    char choice = getChar();
    switch(choice)
    {
      case 's':
        theHashTable.displayTable();
        break;
      case 'i':
        System.out.print("Enter key value to insert: ");
        aKey = getString();
        aDataItem = new DataItem(aKey);
        theHashTable.insert(aDataItem);
        break;
      case 'd':
        System.out.print("Enter key value to delete: ");
        aKey = getString();
        theHashTable.delete(aKey);
        break;
      case 'f':
        System.out.print("Enter key value to find: ");
        aKey = getString();
        aDataItem = theHashTable.find(aKey);
        if(aDataItem != null)
        {
          System.out.println("Found " + aKey);
        }
        else
          System.out.println("Could not find " + aKey);
          break;
      default:
      System.out.print("Invalid entry\n");
    } // end switch
  } // end while
} // end main()
//--------------------------------------------------------------
public static String getString() throws IOException
{
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);
  String s = br.readLine();
  return s;
}
//--------------------------------------------------------------
public static char getChar() throws IOException
{
  String s = getString();
  return s.charAt(0);
}
//-------------------------------------------------------------
public static int getInt() throws IOException
{
  String s = getString();
  return Integer.parseInt(s);
}
//--------------------------------------------------------------
} // end class HashTableApp
////////////////////////////////////////////////////////////////
