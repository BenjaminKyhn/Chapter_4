import java.util.Scanner;

public class Exercise_4_18{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two characters
        System.out.println("Enter two characters: ");
        String majorStatus = input.nextLine();

        // Get characters from string
        char major = majorStatus.charAt(0);
        char status = majorStatus.charAt(1);

        //Display major
        switch (major){
            case 'I': System.out.print("Information Management "); break;
            case 'C': System.out.print("Computer Science "); break;
            case 'A': System.out.print("Accounting "); break;
            default : System.out.println("Invalid input");
                System.exit(1);
        }

        //Display status
        switch (status){
            case '1': System.out.println("Freshman"); break;
            case '2': System.out.println("Sophomore"); break;
            case '3': System.out.println("Junior"); break;
            case '4': System.out.println("Senior"); break;
            default :
                System.out.println("Invalid input");
        }

    }
}