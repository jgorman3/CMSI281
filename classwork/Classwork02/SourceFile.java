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
import java.io.IOException;
import java.nio.file.*;

public class SourceFile {
  public static final int END_OF_FILE = -1;
  public String file;

  //main constructor
  public SourceFile(String filename) {
    file = filename;
  }

  //readtoString returns filedata as string
  public String readtoString(String filename) throws IOException{
    String file_data = null;
    file_data = new String(Files.readAllBytes(Paths.get(file)));
    return file_data;
  }
}
