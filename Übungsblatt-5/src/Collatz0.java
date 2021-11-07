import java.util.Scanner;
public class Collatz0 {
    public static void main(String[] args) {
        System.out.print("Bitte geben Sie die Startzahl n (> 0) ein: ");
        int n = new Scanner(System.in).nextInt();           // read a number from the console
        int i = 0;                                          // used for counting the number of iterations

        while (n > 0 && i < 200) {
            System.out.print(n + " ");

            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }

            ++i;
        }
    }
}
