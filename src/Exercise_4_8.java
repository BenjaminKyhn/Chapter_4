import java.util.Scanner;

public class Exercise_4_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String asciiString = input.nextLine();

        // Check if the hex string has exactly one character
        if (asciiString.length() != 1){
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }

        char ch = asciiString.charAt(0);
        int code = ch;
        System.out.println("ASCII code for " + asciiString + " is " + code);

    }
}
