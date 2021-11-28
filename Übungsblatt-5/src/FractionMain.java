public class FractionMain {
    public static void main(String[] args) {
        //Instancing using "new" operator
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();

        f1.numerator = f2.numerator = 4;
        f1.denominator = f2.denominator = 3;

        f1.add(f2);

        System.out.println("Result: "
                + f1.numerator + " / "
                + f1.denominator);

    }
}
