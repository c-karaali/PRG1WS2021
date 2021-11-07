import java.util.Scanner;
public class NumberGuesser0 {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 10);

        System.out.print("An welche Zahl denke ich? ... ");
        int number = new Scanner(System.in).nextInt();

        while (randomNumber != number) {
            System.out.print("Falsch geraten! Nochmal! ");
            number = new Scanner(System.in).nextInt();
        }

        System.out.print("Super! Du hast die " + randomNumber + " erraten! ..");
    }
}
