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
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.IOException;

public class TargetFile {
  public static String string_buff;
  public static String file;

  //main constructor
  public TargetFile(String filename , String buffer) {
    file = filename;
    string_buff = buffer;
  }

  //copy file method
  public static void fileCreator() throws IOException {
    String newfile = file + ".copy";
    try
    (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(newfile), "utf-8")))
        {
          writer.write(string_buff);
          writer.close();
        }
  }
