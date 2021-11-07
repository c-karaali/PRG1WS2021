import java.util.Scanner;
public class CarConsumption0 {
    public static void main(String[] args) {
        System.out.print("Wie weit ist die Strecke? ");
        double route = new Scanner(System.in).nextDouble();

        double fuel = 4.7 / 100 * route;
        double oil = 0.4 / 1000 * route;

        System.out.println("Bei " + route + "km benötigt ihr Auto "
                + fuel + "l Kraftstoff und " + oil + "l Öl.");
    }
}