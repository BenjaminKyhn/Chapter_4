import java.util.Scanner;

public class Exercise_4_19{
    public static void main (String[] args) {

        System.out.println("Enter the first 9 digits of an ISBN as a string: ");
        Scanner input = new Scanner(System.in);
        String isbn = input.nextLine();
        int d1 = Integer.parseInt(isbn.substring(0,1));
        int d2 = Integer.parseInt(isbn.substring(1,2));
        int d3 = Integer.parseInt(isbn.substring(2,3));
        int d4 = Integer.parseInt(isbn.substring(3,4));
        int d5 = Integer.parseInt(isbn.substring(4,5));
        int d6 = Integer.parseInt(isbn.substring(5,6));
        int d7 = Integer.parseInt(isbn.substring(6,7));
        int d8 = Integer.parseInt(isbn.substring(7,8));
        int d9 = Integer.parseInt(isbn.substring(8));
        int d10 = ((d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)%11);

        System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);
        if (d10 == 10)
            System.out.println("X");
        else
            System.out.println(d10);
    }
}