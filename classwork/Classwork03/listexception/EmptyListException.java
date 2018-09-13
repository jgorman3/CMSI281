/** EmptyListException.java   1.0.0   13-September-2018
*  Purpose    : Creates an exception for catching empty lists
*  Author     : Joe Gorman
*  Description: Implements exception for empty lists
*/
package listexception;
import java.io.*;

public class EmptyListException extends RuntimeException {
  public EmptyListException(String message) {
    super(message);
  }
}
