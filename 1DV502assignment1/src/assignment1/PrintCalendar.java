package assignment1;

import java.util.Scanner;
import java.util.ArrayList;

public class PrintCalendar {
  
  /**
   * Check if year is a leap year.
   * 
   * @param year - A year.
   * @return if the year is a leap year or not.
   */
  public static boolean isLeapYear(int year) {

    boolean leapYear;

    if (year %  4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          leapYear = true;
        } else {
          leapYear = false;
        }
      } else {
        leapYear = true;
      }
    } else {
      leapYear = false;
    }
    return leapYear;
  }

  /**
   * Get the first day of a month.
   * 
   * @param year - A year.
   * @param month - A month.
   * @return The number of the weekday the first of that year and month.
   */
  public static int firstDayInMonth(int year, int month) {
    int weekday = 0;

    int k = year % 100;
    int j = year / 100;
    
    if (month > 2 && month < 13) {     
    weekday = (1 + ((26 * (month + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
    }
    
    if (month > 0 && month < 3) {
      month += 12;
      k = (year - 1) % 100;
      j = (year - 1) / 100;
      weekday = (1 + ((26 * (month + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
    }

    if (weekday == 0 || weekday == 1) {
      weekday += 7;
    }

    return weekday - 1;
  }
 
/**
 * Get the month from the corresponding number.
 * 
 * @param month - A month.
 * @return A string contianing a month.
 */
  public static String getMonth(int month) {
    String[] months = new String[] {"January", "February", "Mars", "April", "May", "June", "July", "August", "September", "Ocotber", "November", "December"};
    return  months[month - 1];
  }

  /**
   * Get the number of days from a given month.
   * 
   * @param year - A Year
   * @param month - A month.
   * @return number of days in the given month.
   */
  public static int numberOfDays(int year, int month) {
    boolean leap = isLeapYear(year);
    int[] days = new int [] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    if (leap) {
      days[1] = 29;
    }
    return days[month - 1];
   }

   /**
    * Prints a calendar.
    * 
    * @param year - A year.
    * @param month - A month.
    */
   public static void printCalendar(int year, int month) {
    String[] days = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun", };
    
    System.out.println(getMonth(month) + " " + year);

    System.out.println("-----------------------------");

    for(String d: days) {    /// for d in days
      System.out.print(" " + d);
    }

    System.out.println();

    int numOfdays = numberOfDays(year, month);

    ArrayList<Integer> arrayOfDays = new ArrayList<>();

    for(int i = 1; i <= numOfdays; i++) {
      arrayOfDays.add(i);
    }

    int firstDay = firstDayInMonth(year, month);

    for(int i = 1; i < firstDay; i++) {
      arrayOfDays.add(0, 0);
    }

    while(arrayOfDays.size() > 0) {
      for (int j = 0; j < 7; j++) {

        if (arrayOfDays.size() > 0) {
          if (arrayOfDays.get(0) == 0) {
            System.out.print("    ");
          } else if (arrayOfDays.get(0) < 10) {
            System.out.print("   " + arrayOfDays.get(0));
          } else {
            System.out.print("  " + arrayOfDays.get(0));
          }
          arrayOfDays.remove(0);
        }
      }
      System.out.println();
    }
   }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a year after 1800: ");
    int yearInput = scan.nextInt();

    System.out.print("Enter a month (1-12): ");
    int monthInput = scan.nextInt();
    
    printCalendar(yearInput, monthInput);

    scan.close();
  }
}
