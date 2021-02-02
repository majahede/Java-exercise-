package assignment1;

import java.util.Scanner;

public class Hex2Dec {
  public static int hexToDecimal(String hex) {

    String characters = "0123456789ABCDEF";
    int decimal = 0;
    int x =  hex.length() - 1;
    hex = hex.toUpperCase();

    for (int i = 0; i < hex.length(); i++) {
      
      char c = hex.charAt(i);
      int value = characters.indexOf(c);
      decimal += value * Math.pow(16, x);
      x--;
    }
    return decimal;
  }
  
  public static void main(String[] args) {
    
    System.out.print("Enter a hex number: ");
    
    String input;
    int decimal;
    Scanner scan = new Scanner(System.in);
    input = scan.nextLine();
    
    decimal = hexToDecimal(input);

    System.out.println("The decimal value for " + input + " is " + decimal + ".");
    
    scan.close();
  }
}
