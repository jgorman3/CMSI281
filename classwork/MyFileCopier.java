/** MyFileCopier.java   1.0.0   5-September-2018
*  Purpose    : Simple Class that reads and writes files
*  Author     : Joe Gorman
*  Description: The intent of the exercise is to get experience with
*               packages, and with having different classes perform
*               different operations as part of the program's
*               functionality. The file copier will be command
*               line or terminal window driven.
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import copiersupport.*;

public class MyFileCopier {
  //class fields
  public static final int END_OF_FILE = -1;
  //main constructor
  public MyFileCopier() {
  }
  //main method
  public static void main(String[] args) throws IOException{
    System.out.println("Enter a file name: ");
    Scanner myFile = new Scanner(System.in);
    String filename = myFile.nextLine();
    SourceFile src = new SourceFile(filename);
    String buffer = src.readtoString(filename);
    TargetFile target = new TargetFile(filename, buffer);
    target.fileCreator();
  }
}
