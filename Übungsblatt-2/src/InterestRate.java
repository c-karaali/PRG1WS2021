import java.util.Scanner;
public class InterestRate {
    public static void main(String[] args) {
        System.out.print("Wie viel hast du investiert? ");
        double capital = new Scanner(System.in).nextDouble();

        System.out.print("Wie hoch ist der Zinssatz? ");
        double interestRate = new Scanner(System.in).nextDouble();

        System.out.print("Wie lang ist die Laufzeit? ");
        double duration = new Scanner(System.in).nextDouble();

        double profit = (capital * Math.pow(1 + interestRate / 100, duration)) - capital;
        double newCapital = capital + profit;

        System.out.println("Nach " + duration + " Jahren würdest du aus "
                            + (int)capital + "€, "
                            + (int)newCapital + "€ machen.");
    }
}
