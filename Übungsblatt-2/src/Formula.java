import java.util.Scanner;
public class Formula {
    public static void main(String[] args) {
        System.out.print("Geben Sie den Wert für x ein: ");
        double x = new Scanner(System.in).nextDouble();

        double formula = 3 * x * x - 8 * x + 4;

        System.out.print("Bei x = " + x + " ergibt die Gleichung den Wert " + formula);
    }
}
