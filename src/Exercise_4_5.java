import java.util.Scanner;

public class Exercise_4_5 {
    public static void main(String[] args) {
        System.out.println("Enter the number of sides in a regular polygon: ");
        Scanner input = new Scanner(System.in);
        int numberOfSides = input.nextInt();

        System.out.println("Enter the length of each side in the regular polygon: ");
        double side = input.nextDouble();

        double area = (numberOfSides*Math.pow(side, 2))/(4*Math.tan(Math.PI/numberOfSides));
        System.out.printf("The area of the regular polygon with " + numberOfSides + " sides is " + area);
    }
}
