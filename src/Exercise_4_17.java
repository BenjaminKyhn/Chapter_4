import java.util.Scanner;

public class Exercise_4_17{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        System.out.println("Enter the first 3 letters of a month: ");
        String month = input.next();

        if ('A' <= month.charAt(0) && month.charAt(0) <= 'Z' ) {
            if (year % 4 == 0 && month.equals("Feb"))
                System.out.print("February of " + year + " has 29 days");

                switch (month) {
                    case "Jan":
                        System.out.println("January of " + year + " has 31 days");
                        break;
                    case "Feb":
                        System.out.println("February of " + year + " has 28 days");
                        break;
                    case "Mar":
                        System.out.println("March of " + year + " has 31 days");
                        break;
                    case "Apr":
                        System.out.println("April of " + year + " has 30 days");
                        break;
                    case "May":
                        System.out.println("May of " + year + " has 31 days");
                        break;
                    case "Jun":
                        System.out.println("June of " + year + " has 30 days");
                        break;
                    case "Jul":
                        System.out.println("July of " + year + " has 31 days");
                        break;
                    case "Aug":
                        System.out.println("August of " + year + " has 31 days");
                        break;
                    case "Sep":
                        System.out.println("September of " + year + " has 30 days");
                        break;
                    case "Oct":
                        System.out.println("October of " + year + " has 31 days");
                        break;
                    case "Nov":
                        System.out.println("November of " + year + " has 30 days");
                        break;
                    case "Dec":
                        System.out.println("December of " + year + " has 31 days");
                        break;
                }

        }
        else
            System.out.println(month + " is not a correct month name");
    }
}