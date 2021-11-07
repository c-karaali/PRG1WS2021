import java.util.Scanner;
public class Switch3 {
    public static void main(String[] args) {
        System.out.print("Schalter 1 ist an? ");
        boolean switch1 = new Scanner(System.in).nextBoolean();

        System.out.print("Schalter 2 ist an? ");
        boolean switch2 = new Scanner(System.in).nextBoolean();

        if (switch1 || switch2)
            System.out.print("Das Licht ist an! ");
        else
            System.out.print("Das Licht ist aus! ");
    }
}
