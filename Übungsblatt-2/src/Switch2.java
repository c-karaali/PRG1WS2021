import java.util.Scanner;
public class Switch2 {
    public static void main(String[] args) {
        System.out.print("Notausschalter 1 ist an? ");
        boolean switch1 = new Scanner(System.in).nextBoolean();

        System.out.print("Notausschalter 2 ist an? ");
        boolean switch2 = new Scanner(System.in).nextBoolean();

        boolean heater = !(switch1 || switch2);

        System.out.print("Die Heizung läuft? --> " + heater);
    }
}
