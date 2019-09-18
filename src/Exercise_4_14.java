import java.util.Scanner;

public class Exercise_4_14{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter grade: ");
        String grade = input.nextLine();

        char ch = Character.toUpperCase(grade.charAt(0));
        if (('A' <= ch && ch <= 'D') || ch == 'F'){
            System.out.print("The numeric value for " + ch + " is ");
            switch(ch){
                case 'A': System.out.println(4); break;
                case 'B': System.out.println(3); break;
                case 'C': System.out.println(2); break;
                case 'D': System.out.println(1); break;
                case 'F': System.out.println(0); break;
            }
        }
        else {
            System.out.println(ch + " is an invalid input");
        }
    }
}