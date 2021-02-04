package assignment1;

import java.util.Scanner;

public class Hex2Dec {

  /**
   * Converts a hexadecimal number to a decimal number.
   * 
   * @param hex - the hexadecimal number.
   * @return decimal number.
   */
  public static int hexToDecimal(String hex) {

    String characters = "0123456789ABCDEF";
    int decimalValue = 0;
    int x =  hex.length() - 1;
    hex = hex.toUpperCase();

    for (int i = 0; i < hex.length(); i++) {
      
      char c = hex.charAt(i);
      int charValue = characters.indexOf(c);
      decimalValue += charValue * Math.pow(16, x);
      x--;
    }
    return decimalValue;
  }
  
  public static void main(String[] args) {
    
    System.out.print("Enter a hex number: ");
    
    String input;
    int result;
    Scanner scan = new Scanner(System.in);
    input = scan.nextLine();
    
    result = hexToDecimal(input);

    System.out.println("The decimal value for " + input + " is " + result + ".");
    
    scan.close();
  }
}
