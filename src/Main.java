import java.text.NumberFormat;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Principal: ");
        double Principal = scanner.nextDouble();
        System.out.println("Annual interest rate: ");
        double AnnualInterestRate = scanner.nextDouble();
        System.out.println("Period (years): ");
        double Period = scanner.nextDouble();
        double MonthlyInterestRate = AnnualInterestRate / PERCENT / MONTHS_IN_YEAR;
        double months = Period * MONTHS_IN_YEAR;
        double MortgageCalculator = Principal*(MonthlyInterestRate*(Math.pow((1+MonthlyInterestRate), months))/(Math.pow((1+MonthlyInterestRate), months)-1));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(MortgageCalculator);
        System.out.println("Mortgage: " + result);
    }
}