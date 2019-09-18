import java.util.Scanner;

public class Exercise_4_11{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String binaryString = input.nextLine();
        int decimal=Integer.parseInt(binaryString,2);
        System.out.println(decimal);
    }
}