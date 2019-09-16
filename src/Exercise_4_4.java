import java.util.Scanner;

public class Exercise_4_4 {
    public static void main(String[] args) {
        System.out.println("Enter the side of a hexagon: ");
        Scanner input = new Scanner(System.in);
        double side = input.nextDouble();

        double area = (6*Math.pow(side, 2))/(4*Math.tan(Math.PI/6));
        System.out.printf("The area of the hexagon is %5.2f\n", area );
    }
}
