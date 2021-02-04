package assignment1;

import java.util.Random;
import java.util.Scanner;

public class Nine {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rnd =  new Random();
  
    System.out.println("Playing a game");
    System.out.println("================= \n");
    System.out.print("Ready to play? (Y/N) ");
    String start = scan.nextLine();
    start = start.toUpperCase();

    if (start.equals("Y")) {
      int first = 0;
      int second = 0;
      int playerTotal = 0;
      int computerTotal = 0;
      
      first = rnd.nextInt(6) + 1;
      System.out.println("You rolled " + first);
      playerTotal = first;
      System.out.print("Would you like to roll again? (Y/N) ");
      
      String rollAgain = scan.nextLine();
      rollAgain = rollAgain.toUpperCase();

      if (rollAgain.equals("Y")) {
        second = rnd.nextInt(6) + 1;
        playerTotal = first + second;
        System.out.println("You rolled " + second + " and in total you have " + (playerTotal));
      } 

      first = rnd.nextInt(6) + 1;
      System.out.println("The computer rolled " + first);
      computerTotal = first;
      
      if (first <= 4) {
        second = rnd.nextInt(6) + 1;
        computerTotal = first + second;
        System.out.println("The computer rolls again and gets " + second + " in total " + (computerTotal));
      }
      
      if (playerTotal == computerTotal || playerTotal > 9 && computerTotal > 9) {
        System.out.println("No one wins");
      } else if (playerTotal > computerTotal || computerTotal > 9) {
          System.out.println("You won!");
      } else {
          System.out.println("You lost");
      }
      
    }

    scan.close();
  }
}
