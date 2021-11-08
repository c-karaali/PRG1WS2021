import java.util.Scanner;
public class CarConsumption2 {
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

        if (route < 0 || route > 5000 ||
                fuel < 1 || fuel > 31 ||
                price < 1.20 || price > 2) {
            System.err.print("Irgendwas stimmt leider nicht! ... ");
        } else {
            System.out.println("Bei " + route + "km benötigt ihr Auto "
                    + (int)fuelConsumption + "l Kraftstoff und " + (int)oilConsumption + "l Öl.");
            System.out.print("Das kostet Sie " + pricePaid + "€");
        }
    }
}
