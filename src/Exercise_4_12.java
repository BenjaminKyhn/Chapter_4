import java.util.Scanner;

public class Exercise_4_12{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex digit: ");
        String hexString = input.nextLine();

        char ch = Character.toUpperCase(hexString.charAt(0));
        if (0 <= ch && ch <= 'F'){
                System.out.println("The binary value is ");
                switch(ch){
                    case 0: System.out.println(0000); break;
                    case 1: System.out.println(0001); break;
                    case 2: System.out.println(0010); break;
                    case 3: System.out.println(0011); break;
                    case 4: System.out.println(0100); break;
                    case 5: System.out.println(0101); break;
                    case 6: System.out.println(0110); break;
                    case 7: System.out.println(0111); break;
                    case 8: System.out.println(1000); break;
                    case 9: System.out.println(1001); break;
                    case 'A': System.out.println(1010); break;
                    case 'B': System.out.println(1011); break;
                    case 'C': System.out.println(1100); break;
                    case 'D': System.out.println(1101); break;
                    case 'E': System.out.println(1110); break;
                    case 'F': System.out.println(1111); break;
            }
        }
        else {
            System.out.println(hexString.charAt(0) + " is an invalid input");
        }
    }
}