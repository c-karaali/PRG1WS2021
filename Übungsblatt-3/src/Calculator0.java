import java.util.Scanner;
public class Calculator0 {
    public static void main(String[] args) {
        System.out.print("Zahl 1: ");
        double n1 = new Scanner(System.in).nextDouble();

        System.out.print("Operator: ");
        char op = new Scanner(System.in).nextLine().charAt(0);

        System.out.print("Zahl 2: ");
        double n2 = new Scanner(System.in).nextDouble();

        double result = Double.NaN;

        if (op == '+') {
            result = n1 + n2;
        } else if (op == '-') {
            result = n1 - n2;
        } else if (op == '*') {
            result = n1 * n2;
        } else if (op == '/') {
            result = n1 / n2;
        } else {
            System.err.println("Syntax.Error");
        }

        System.out.print("Ergebnis: " + n1 + " " + op + " " + n2 + " = " + result);
    }
}
