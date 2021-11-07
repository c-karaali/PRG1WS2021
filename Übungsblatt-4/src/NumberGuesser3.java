import java.util.Scanner;
public class NumberGuesser3 {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 10);
        int number;
        int numberOfGuesses = 0;

        System.out.print("An welche Zahl denke ich? ... ");

        do {
            numberOfGuesses++;
            number = new Scanner(System.in).nextInt();
            if (number < randomNumber) {
                System.out.print("Die gesuchte Zahl ist größer. Bitte nochmal raten! ");
            } else if (number > randomNumber) {
                System.out.print("Die gesuchte Zahl ist kleiner. Bitte nochmal raten! ");
            }

            if (numberOfGuesses == 5) {
                break;
            }
        } while (randomNumber != number);

        if (randomNumber >= number) {
            System.out.print("Super! Sie haben die Zahl " + randomNumber + " in nur " + numberOfGuesses +
                    " Zügen erraten! ");
        } else {
                System.out.println("");
                System.out.print("Leider haben Sie es nicht geschafft, die Zahl " + randomNumber +
                                " innerhalb von " + numberOfGuesses + " Zügen zu erraten ...");
        }
    }
}
