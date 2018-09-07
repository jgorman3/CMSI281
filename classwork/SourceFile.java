/** SourceFile.java   1.0.0   5-September-2018
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
import java.lang.StringBuffer;

public class SourceFile {
  public static final int END_OF_FILE = -1;
  public String file;

  //main constructor
  public SourceFile(String filename) {
    file = filename;
  }

  //readtoString returns filedata as string
  public StringBuffer readtoString(String filename) throws IOException{
    int i;
    FileReader in = null;
    in  = new FileReader(file);
    StringBuffer filedata = new StringBuffer();
    try {
      while ((i= in.read()) != END_OF_FILE) {
        filedata.append(in);
      }
    }
    finally {
      if (in != null) {
               in.close();
      }
    }
    return filedata;
  }
}
