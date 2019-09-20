import java.util.Scanner;

public class Exercise_4_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Danish social security number: ");
        String ssn = input.nextLine();

        int d1 = Integer.parseInt(ssn.substring(0,1));
        int d2 = Integer.parseInt(ssn.substring(1,2));
        int d3 = Integer.parseInt(ssn.substring(2,3));
        int d4 = Integer.parseInt(ssn.substring(3,4));
        int d5 = Integer.parseInt(ssn.substring(4,5));
        int d6 = Integer.parseInt(ssn.substring(5,6));
        char d7 = ssn.charAt(6);
        int d8 = Integer.parseInt(ssn.substring(7,8));
        int d9 = Integer.parseInt(ssn.substring(8,9));
        int d10 = Integer.parseInt(ssn.substring(9,10));
        int d11 = Integer.parseInt(ssn.substring(10));

        if (ssn.length() == 11 && d7 == '-')
            System.out.println(ssn + " is a valid social security number in Denmark.");
        else
            System.out.println(ssn + " is an invalid social security number in Denmark.");

    }
}
