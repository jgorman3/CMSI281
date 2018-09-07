/** TargetFile.java   1.0.0   5-September-2018
*  Purpose    : Simple Class that reads and writes files
*  Author     : Joe Gorman
*  Description: The intent of the exercise is to get experience with
*               packages, and with having different classes perform
*               different operations as part of the program's
*               functionality. The file copier will be command
*               line or terminal window driven.
*/
package copiersupport;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TargetFile {
  public static final int END_OF_FILE = -1;
  public StringBuffer string_buff;
  public String file;
  //main constructor
  public TargetFile(String filename , StringBuffer buffer) {
    file = filename;
    string_buff = buffer;
  }
  public void main(String[] args) throws IOException{
    FileWriter out = null;
    FileReader in = null;
    String new_filename = file + ".copy";
    try{
      in  = new FileReader(file);
      out = new FileWriter(new_filename);
      int c;
      while ((c = in.read()) != END_OF_FILE) {
         out.write(c);
      }
    }
    finally{
      if (in != null) {
        in.close();
      }
      if (out != null) {
        out.close();
      }
    }
    System.out.println(out.toString());
  }
}
