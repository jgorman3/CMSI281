import java.io.*;

class DataItem { // (could have more data)
  private String iData; // data item (key)
//--------------------------------------------------------------
  public DataItem(String ii) // constructor
  {
    iData = ii;
  }
//--------------------------------------------------------------
  public String getKey()
  {
    return iData;
  }
//--------------------------------------------------------------
} // end class DataItem

////////////////////////////////////////////////////////////////
class HashTable {
  private DataItem[] hashArray; // array holds hash table
  private int arraySize;
  private DataItem nonItem; // for deleted items
// -------------------------------------------------------------
  public HashTable(int size) // constructor
  {
    arraySize = size;
    hashArray = new DataItem[arraySize];
    nonItem = new DataItem("-1"); // deleted item key is -1
  }
// -------------------------------------------------------------
  public void displayTable()
  {
    System.out.print("Table: ");
    for(int j=0; j<arraySize; j++)
    {
      if(hashArray[j] != null)
        System.out.print(hashArray[j].getKey() + " ");
      else
        System.out.print("** ");
    }
    System.out.println("");
  }
// -------------------------------------------------------------
  public int hashFunc(String key)
  {
    int sum;
    int hash = 0;
    for (int i = 0; i < key.length(); i++){
      sum = key.charAt(i) - 65; //use ASCII rep to make it alphabetical
      hash = (hash + sum) % arraySize; //bound hash by array size
    }
    return hash;
  }
// -------------------------------------------------------------
  public void insert(DataItem item){ // insert a DataItem
// (assumes table not full)
    String key = item.getKey(); // extract key
    int hashVal = hashFunc(key); // hash the key
  // until empty cell or -1,
    while(hashArray[hashVal] != null && hashArray[hashVal].getKey() != "-1")
    {
      ++hashVal; // go to next cell
      hashVal %= arraySize; // wraparound if necessary
    }
    hashArray[hashVal] = item; // insert item
  } // end insert()

// -------------------------------------------------------------
  public DataItem delete(String key) // delete a DataItem
  {
    int hashVal = hashFunc(key); // hash the key
    while(hashArray[hashVal] != null) // until empty cell,
    { // found the key?
      if(hashArray[hashVal].getKey() == key){
        DataItem temp = hashArray[hashVal]; // save item
        hashArray[hashVal] = nonItem; // delete item
        return temp; // return item
      }
    ++hashVal; // go to next cell
    hashVal %= arraySize; // wraparound if necessary
    }
    return null; // can’t find item
  } // end delete()
// -------------------------------------------------------------
  public DataItem find(String key) // find item with key
  {
    int hashVal = hashFunc(key); // hash the key
    while(hashArray[hashVal] != null) // until empty cell,
    { // found the key?
    if(hashArray[hashVal].getKey() == key)
      return hashArray[hashVal]; // yes, return item
    ++hashVal; // go to next cell
    hashVal %= arraySize; // wraparound if necessary
    }
    return null; // can’t find item
  }
    // -------------------------------------------------------------
} // end class HashTable

