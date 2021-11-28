public class Fraction1Main {
    public static void main(String[] args) {
        //Instancing using "new" operator
        Fraction1 myFraction1 = new Fraction1();
        myFraction1.numerator = 2;
        myFraction1.denominator = 3;

        Fraction1 myFraction2 = new Fraction1();
        myFraction2.numerator = 2;
        myFraction2.denominator = 3;

        System.out.println("Fraction 1: " + myFraction1.numerator + " / "
                + myFraction1.denominator);
        System.out.println("Fraction 2: " + myFraction2.numerator + " / "
                + myFraction2.denominator);

    }
}
