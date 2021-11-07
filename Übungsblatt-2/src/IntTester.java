import java.util.Scanner;
public class IntTester {
    public static void main(String[] args) {
        System.out.print("Wert a: ");
        int a = new Scanner(System.in).nextInt();

        System.out.print("Wert b: ");
        int b = new Scanner(System.in).nextInt();

        int calculation1 = (a + b);
        int calculation2 = (a - b);
        int calculation3 = (a * b);
        int calculation4 = (a / b);
        int calculation5 = (a % b);

        System.out.println("a + b = " + calculation1);
        System.out.println("a - b = " + calculation2);
        System.out.println("a * b = " + calculation3);
        System.out.println("a / b = " + calculation4);
        System.out.println("a % b = " + calculation5);
    }
}
