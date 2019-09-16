import java.util.Scanner;

public class Exercise_4_2 {
    public static void main(String[] args) {
        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x1Radians = Math.toRadians(x1);
        double y1Radians = Math.toRadians(y1);

        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x2Radians = Math.toRadians(x2);
        double y2Radians = Math.toRadians(y2);

        final double radiusOfEarth = 6371.01;

        double d = radiusOfEarth * Math.acos(Math.sin(x1Radians) * Math.sin(x2Radians) + Math.cos(x1Radians) * Math.cos(x2Radians) * Math.cos(y1Radians - y2Radians));

        System.out.printf("The distance between the two points is " + d + " km");
    }
}
