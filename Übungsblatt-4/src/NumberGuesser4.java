import java.util.Scanner;
import static java.lang.Math.*;

public class NumberGuesser4 {
    public static void main(String[] args) {
        int randomNumber = (int) (random() * 10) + 1;
        int number;
        int numberOfGuesses = 0;
        char playAgain;

        System.out.println("Willkommen zu Zahlenraten! ");
        System.out.print("An welche Zahl denke ich? ... ");

        do {
            number = new Scanner(System.in).nextInt();
            numberOfGuesses++;

            if (numberOfGuesses >= 5) {
                break;
            }

            if (number < randomNumber) {
                System.out.print("Die gesuchte Zahl ist größer. Bitte nochmal raten! ");
            } else if (number > randomNumber) {
                System.out.print("Die gesuchte Zahl ist kleiner. Versuche es nochmal! ");
            }

        } while (randomNumber != number);

        if (randomNumber == number) {
            System.out.println("Super! Sie haben die Zahl " + randomNumber + " in nur " + numberOfGuesses +
                    " Zügen erraten! ");
            System.out.print("Wollen Sie nochmal spielen? (j/n) ");
            char playAgain = new Scanner(System.in).nextLine().charAt(0);
        } else {
            System.out.println("Leider haben Sie es nicht geschafft, die Zahl " + randomNumber +
                    " innerhalb von " + numberOfGuesses + " Zügen zu erraten ...");
            System.out.print("Wollen Sie nochmal spielen? (j/n) ");
            char playAgain = char playAgain = new Scanner(System.in).nextLine().charAt(0);
        }
    }
}