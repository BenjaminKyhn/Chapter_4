import java.util.Scanner;

public class Exercise_4_13{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter letter in the alphabet: ");
        String s = input.nextLine();

        char ch = Character.toUpperCase(s.charAt(0));
        if ('A' <= ch && ch <= 'Z'){
            System.out.print(ch + " is a ");
            switch(ch){
                case 'A': System.out.println("vowel"); break;
                case 'B': System.out.println("consonant"); break;
                case 'C': System.out.println("consonant"); break;
                case 'D': System.out.println("consonant"); break;
                case 'E': System.out.println("vowel"); break;
                case 'F': System.out.println("consonant"); break;
                case 'G': System.out.println("consonant"); break;
                case 'H': System.out.println("consonant"); break;
                case 'I': System.out.println("vowel"); break;
                case 'J': System.out.println("consonant"); break;
                case 'K': System.out.println("consonant"); break;
                case 'L': System.out.println("consonant"); break;
                case 'M': System.out.println("consonant"); break;
                case 'N': System.out.println("consonant"); break;
                case 'O': System.out.println("vowel"); break;
                case 'P': System.out.println("consonant"); break;
                case 'Q': System.out.println("consonant"); break;
                case 'R': System.out.println("consonant"); break;
                case 'S': System.out.println("consonant"); break;
                case 'T': System.out.println("consonant"); break;
                case 'U': System.out.println("vowel"); break;
                case 'V': System.out.println("consonant"); break;
                case 'X': System.out.println("consonant"); break;
                case 'Y': System.out.println("vowel"); break;
                case 'Z': System.out.println("consonant"); break;
            }
        }
        else {
            System.out.println(s.charAt(0) + " is an invalid input");
        }
    }
}