import java.util.Scanner;

public class Exercise_4_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employees name: ");
        String name = input.nextLine();

        System.out.println("Enter number of hours worked in a week: ");
        double hoursPerWeek = input.nextInt();

        System.out.println("Enter hourly pay rate: ");
        double payrate = input.nextDouble();

        System.out.println("Enter federal tax withholding rate: ");
        double fedTax = input.nextDouble();

        System.out.println("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        double grossPay = payrate*hoursPerWeek;
        double fedHolding = grossPay*fedTax;
        double stateHolding = grossPay*stateTax;
        double totalDeduction = fedHolding + stateHolding;
        double netPay = grossPay - totalDeduction;

        System.out.printf("Employee name: " + name +
                "\nHours Worked: " + hoursPerWeek +
                "\nPay Rate: $" + payrate +
                "\nGross Pay: $" + grossPay +
                "\nDeductions:\n    Federal Withholdning (" + fedTax*100 + "%%): $" + fedHolding +
                "\n    State Withholding (" + stateTax*100 + "%%): " + stateHolding +
                "\n    Total Deduction: $" + totalDeduction +
                "\nNet Pay: $" + netPay);


    }
}
