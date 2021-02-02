package assignment1;

import java.util.Random;
import java.util.Scanner;

public class GameSRP {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rnd =  new Random();

    int win = 0;
    int lose = 0;
    int draw = 0;
    int input = 1;

    while (input != 0){
      System.out.print("Scissor (1), rock (2), paper (3) or 0 to quit: ");
      input = scan.nextInt();
      int computer = rnd.nextInt(3) + 1;
      
      if (input == computer) {
        System.out.println("It's a draw!");
        draw++;
      } else if (input == 1 && computer == 2) {
        System.out.println("You lost, computer had rock!");
        lose++;
      } else if (input == 3 && computer == 1) {
        System.out.println("You lost, computer had scissor!");
        lose++;
      } else if (input == 2 && computer == 3) {
        System.out.println("You lost, computer had paper!");
        lose++;
      } else if (input == 1 && computer == 3) {
        System.out.println("You won, computer had paper!");
        win++;
      } else if (input == 3 && computer == 2) {
        System.out.println("You won, computer had rock!");
        win++;
      } else if (input == 2 && computer == 1) {
        System.out.println("You won, computer had scissor!");
        win++;
      }
    }

    System.out.println("Score: " + win + " (you) " + lose + " (computer) " + draw + " (draw).");
    
    scan.close();
  }
 
}
