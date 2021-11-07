import java.util.Scanner;
public class NumberGuesser2 {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 10);
        int number;

        System.out.print("An welche Zahl denke ich? ... ");

        do {
            number = new Scanner(System.in).nextInt();
            if (number < randomNumber) {
                System.out.print("Die gesuchte Zahl ist größer. Bitte nochmal raten! ");
            } else if (number > randomNumber) {
                System.out.print("Die gesuchte Zahl ist kleiner. Bitte nochmal raten! ");
            }
        } while (randomNumber != number);


        System.out.print("Super! Du hast die " + randomNumber + " erraten! ..");
    }
}
