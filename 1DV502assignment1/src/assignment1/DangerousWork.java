package assignment1;

import java.util.Scanner;

public class DangerousWork {
  public static void main(String[] args) {
 
    Scanner scan = new Scanner(System.in);
    System.out.print("How much would you like to earn? ");
    
    int input = scan.nextInt();

    double total = 0;
    double salary = 0;
    int workingDays = 0;

    while (total <= input) { 
        if (workingDays == 0) {
          salary = 0.01;
        }
        total += salary;
        workingDays++;
        salary = salary * 2;
      }

    System.out.println("You will have your money in " + workingDays + " days.");

    scan.close();
  }
}
