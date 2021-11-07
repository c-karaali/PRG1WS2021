import java.util.Scanner;
public class BruttoNetto {
    public static void main(String[] args) {
        System.out.print("Geben Sie den Bruttopreis des Produkts in € an: ");
        double brutto = new Scanner(System.in).nextDouble();

        double mwst = 19;
        double tax = brutto * 19 / (100 + 19);
        double netto = brutto - tax;

        System.out.print("Bei einem Bruttopreis von " + Math.round(brutto) + "€, beträgt der Nettopreis bei "
                            + mwst + "% MwSt. genau " + Math.round(netto) + "€.");
    }
}
