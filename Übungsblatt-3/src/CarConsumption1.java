import java.util.Scanner;
public class CarConsumption1 {
    public static void main(String[] args) {
        System.out.print("Wie weit ist die Strecke? ");
        double route = new Scanner(System.in).nextDouble();

        System.out.print("Wie viel Kraftstoff verbraucht ihr Auto? ");
        double fuel = new Scanner(System.in).nextDouble();

        System.out.print("Wie viel Öl verbraucht ihr Auto? ");
        double oil = new Scanner(System.in).nextDouble();

        System.out.print("Wie viel kostet der Sprit? ");
        double price = new Scanner(System.in).nextDouble();

        double fuelConsumption = fuel / 100 * route;
        double oilConsumption = oil / 1000 * route;
        double pricePaid = fuelConsumption * price;

        System.out.println("Bei " + route + "km benötigt ihr Auto "
                + fuelConsumption + "l Kraftstoff und " + oilConsumption + "l Öl.");
        System.out.print("Das kostet Sie " + pricePaid + "€");
    }
}
