import java.util.Scanner;

public class Exercise_4_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string s1: ");
        String s1 = input.nextLine();

        System.out.println("Enter string s2: ");
        String s2 =input.nextLine();

        boolean isSubstring = s1.contains(s2);

        if (isSubstring == true)
            System.out.println(s2 + " is a substring of " + s1);
        else
            System.out.println(s2 + " is not a substring of " + s1);
    }
}
