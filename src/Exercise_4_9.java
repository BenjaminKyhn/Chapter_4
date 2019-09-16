import java.util.Scanner;

public class Exercise_4_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String uniCodeString = input.nextLine();

        // Check if the hex string has exactly one character
        if (uniCodeString.length() != 1){
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }

        char ch = uniCodeString.charAt(0);
        int uniCode = ch;
        System.out.println("Unicode for " + uniCodeString + " is " + uniCode);

    }
}

/** ALTERNATE SOLUTION
 import java.util.Scanner;

 public class Exercise_4_9 {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

 // Prompt the user to enter a character
 System.out.print("Enter a character: ");
 String s = input.nextLine();
 char ch = s.charAt(0);

 // Display Unicode of character
 System.out.println((int)ch);
 }
 }
 */