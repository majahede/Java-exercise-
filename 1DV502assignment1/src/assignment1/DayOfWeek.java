package assignment1;

import java.util.Scanner;

public class DayOfWeek {
  public static void main(String[] args) {
    String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    Scanner scan = new Scanner(System.in);
    
    while (true) {
    
    System.out.print("Enter year: ");
    int year = scan.nextInt();

    System.out.print("Enter month (1-12): ");
    int month = scan.nextInt();

    System.out.print("Enter day of the month (1-31): ");
    int day = scan.nextInt();
   
    int weekday = 0;

    int k = year % 100;
    int j = year / 100;
    
    if (month > 2 && month < 13) {     
     weekday = (day + ((26 * (month + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
    }
    
    if (month > 0 && month < 3) {
      month += 12;
      k = (year - 1) % 100;
      j = (year - 1) / 100;
      weekday = (day + ((26 * (month + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
      
    }

    System.out.println("Day of week is " + days[weekday]);
    System.out.println();
    
  }

  }
}
