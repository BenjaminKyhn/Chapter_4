import java.util.Scanner;

public class Listing_4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();

        // Check if the hex string has exactly one character
        if (hexString.length() != 1){
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }

        // Display decimal value for the hex digit
        char ch = Character.toUpperCase(hexString.charAt(0));
        if ('A' <= ch && ch <= 'F'){
            int value = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit " + hexString.charAt(0) + " is " + value);
        }
        else if (Character.isDigit(ch)){
            System.out.println("The decimal value for hex digit " + hexString.charAt(0) + " is " + hexString.charAt(0));
        }
        else {
            System.out.println(hexString.charAt(0) + " is an invalid input");
        }
    }
}
