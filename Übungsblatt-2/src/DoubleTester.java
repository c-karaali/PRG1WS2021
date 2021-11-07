import java.util.Scanner;
public class DoubleTester {
    public static void main(String[] args) {
        System.out.print("Wert a: ");
        double a = new Scanner(System.in).nextDouble();

        System.out.print("Wert b: ");
        double b = new Scanner(System.in).nextDouble();

        double calculation1 = (a + b);
        double calculation2 = (a - b);
        double calculation3 = (a * b);
        double calculation4 = (a / b);
        double calculation5 = (a % b);

        System.out.println("a + b = " + calculation1);
        System.out.println("a - b = " + calculation2);
        System.out.println("a * b = " + calculation3);
        System.out.println("a / b = " + calculation4);
        System.out.println("a % b = " + calculation5);
    }
}
