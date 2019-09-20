import java.util.Scanner;

public class Exercise_4_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first country: ");
        String country1 = input.nextLine();
        System.out.print("Enter the second country: ");
        String country2 = input.nextLine();
        System.out.print("Enter the third country: ");
        String country3 = input.nextLine();

        String temp;
        if ((country2.length() > country1.length()) && (country2.length() > country3.length()))
        {
            temp = country1;
            country1 = country2;
            country2 = temp;
        }
        else if ((country3.length() > country1.length()) && (country3.length() > country2.length()))
        {
            temp = country1;
            country1 = country3;
            country3 = temp;

        }
        if (country3.length() > country2.length())
        {
            temp = country2;
            country2 = country3;
            country3 = temp;
        }

        System.out.println("The three countries in descending order are " +
                country1 + " " + country2 + " " + country3);
    }
}