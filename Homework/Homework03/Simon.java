/** Simon.java   1.0.0   6-November-2018
*  Purpose    : Simple Class that executes Simon game
*  Author     : Joe Gorman & Lindsey Fry
*  Description: The intent of this program is to implement
*  the simon game with artificial disks, when you guess the
*  sequence of disks wrong, you lose!
**/
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.lang.Thread;

public class Simon{

  private int size;
  private String blue = "B";
  private String red = "R";
  private String yellow = "Y";
  private String green = "G";
  private String[] simon = {blue, red, yellow, green};
  private String[] gameArray = new String[100];
  private int turn;

  public Simon(){

  }

  public void arrayPrint(int turnplay){
    for (int i = 0; i < turnplay; i++){
      System.out.print(gameArray[i]);
    }
  }

  public boolean arrayCompare(int turnPlay,String response){
    String concat = "";
    for (int i = 0; i< turnPlay; i++){
      concat += gameArray[i];
    }
    if (concat.equals(response)){
      return true;
    }
    else{
      return false;
    }
  }

  //simon game
  public static void main(String[] args){
    Simon game = new Simon();
    ///random array generation
    Random rand = new Random();
    for (int i = 0; i< game.gameArray.length; i++){
      int randInt = rand.nextInt(4);
      game.gameArray[i] = game.simon[randInt];
    }
    //game begins
    int turn = 1;
    boolean play = true;
    System.out.println("Welcome to Simon Says!\n");
    while (play){
      System.out.println("Here is the sequence.");
      game.arrayPrint(turn);
      try {
        Thread.sleep(1000);
      }
      catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
      }
      for (int i=0;i < turn;i++){
        System.out.print("\b");
      }
      for (int i=0;i < turn;i++){
        System.out.print(" ");
      }
      System.out.print("\n");
      System.out.println("What is the sequence?");
      Scanner input = new Scanner(System.in);
      String response = input.next();
      try {
        Thread.sleep(1000);
      }
      catch(InterruptedException ex) {
        Thread.currentThread().interrupt();
      }
      for (int i=0;i < turn;i++){
        System.out.print("\b");
      }
      for (int i=0;i < turn;i++){
        System.out.print(" ");
      }
      System.out.print("\n");
      if (game.arrayCompare(turn,response)){
        System.out.println("Congratulations! Onto the next round.");
        turn++;
      }
      else {
        System.out.println("Thanks for playing. Would you like to play again? (Yes/No)");
        Scanner answer = new Scanner(System.in);
        String finalResponse = answer.next();
        if (finalResponse.equals("Yes")) {
          play = true;
          turn = 1;
        }
        else {
          play = false;
        }
      }
    }
  }
}

