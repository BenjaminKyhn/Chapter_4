import java.util.Scanner;

public class Exercise_4_20{
    public static void main (String[] args) {

        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        System.out.print("The length of the string is " + s.length() + " and the last character is " + s.charAt(s.length()-1));
    }
}