import java.util.Scanner;

public class SayHello {
  
  public static void main(String[] args) {

    Scanner myInput = new Scanner(System.in);
    String inputname = myInput.nextLine();
    System.out.println("Hello, " + inputname);
    
  }
}
