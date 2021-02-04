package assignment1;

import java.util.Scanner;

public class Diamonds {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Give a positiv number: ");
    
    int number = scan.nextInt();
    int blankspace = number;
    
    if (number > 0) {
      for (int i = 1; i <= number; i++) {
        for(int j = 1; j < blankspace; j++) {
          System.out.print(" ");
        }
        blankspace--;

        for (int j = 1; j <= i * 2 - 1; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
      
      int stars = number;
      blankspace = 1;

      for (int i = 1; i <= number; i++) {
        for(int j = 1; j <= blankspace; j++) {
          System.out.print(" ");
        }
        blankspace++;

        for(int j = 1; j <= stars * 2 - 3; j++) {
          System.out.print("*");
        }
        stars--;
        System.out.println();
      }
    }

      scan.close();
  }
}
