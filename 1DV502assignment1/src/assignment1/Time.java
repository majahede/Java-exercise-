package assignment1;

import java.util.Scanner;

public class Time {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Give a number of seconds: ");

    int number = scan.nextInt();
    int hours = number / 3600;
    int minutes = (number % 3600) / 60;
    int seconds = (number % 60);
    
    System.out.println("This corresponds to: " + hours + " hours, " + minutes + " minutes and " + seconds + " seconds.");

    scan.close();
  }
}
