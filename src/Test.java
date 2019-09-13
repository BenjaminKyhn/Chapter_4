public class Test {
    public static void main(String[] args) {
        int count = 5;
        double amount = 45.56;
        System.out.printf("count is %d and amount is %f", count, amount);
        System.out.println();

        double amount2 = 12618.98;
        double interestRate = 0.0013;
        double interest = amount2 * interestRate;
        System.out.printf("Interest is $%4.2f",
                interest);
    }
}
