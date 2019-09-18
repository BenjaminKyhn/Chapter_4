import java.util.Scanner;

public class Exercise_4_18{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two characters: ");
        String majorStatus = input.nextLine();
        char major = majorStatus.charAt(0);
        char status = majorStatus.charAt(1);

        switch (major){
            case 'I':
                System.out.println("Information Management "); break;
            case 'C':
                System.out.println("Computer Science "); break;
            case 'A':
                System.out.println("Accounting "); break;
            default:
                System.out.println("Invalid input");
                System.exit(1);
        }

        switch (status){
            case 1:
                System.out.println("Freshman"); break;
            case 2:
                System.out.println("Sophomore"); break;
            case 3:
                System.out.println("Junior"); break;
            case 4:
                System.out.println("Senior"); break;
            default:
                System.out.println("Invalid input");
        }

    }
}