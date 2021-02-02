package assignment1;

import java.util.Random;

public class Ants {
  public static void main(String[] args) {

    System.out.println("Ants");
    System.out.println("===== \n");
    
    Random rnd =  new Random();
    int stepsTotal = 0;
  
    for (int s = 1; s <= 10; s++) {
      int[][] chessboard = new int[8][8];
      
      int steps = 0;
      int sum = 0;
      // Starting position.
      int y = rnd.nextInt(8);
      int x = rnd.nextInt(8);
     

      while (sum < 64) {
        sum = 0;
        int direction = rnd.nextInt(4);

        if (direction == 0)  { // Move up.
          if (y == 0 ) {
            y++;
          } else {
            y--;  
          }   
        } else if (direction == 1) { // move right
          if (x == 7 ) {
            x--;
          } else {
            x++;  
          }  
        } else if (direction == 2) { // Move down
            if (y == 7 ) {
              y--;
            } else {
              y++;  
            }  
        } else if (direction == 3) { //move left
          if (x == 0 ) {
              x++;
            } else {
              x--;  
            }  
        }
        chessboard[y][x] = 1;
        steps ++;

        for (int i = 0; i < chessboard.length; i++) {
          for (int j = 0; j < chessboard[i].length; j++) {
            sum += chessboard[i][j];
          }
        }
      }
      System.out.println("Number of steps in simulation " + s + ": " + steps); 
      stepsTotal += steps;
    }

    double average = stepsTotal / 10.0;

    System.out.println("Average amount of steps: " + average);
  }
}
