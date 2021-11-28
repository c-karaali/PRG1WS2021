public class FractionMain {
    public static void main(String[] args) {

        //Initializing 2 fractions using "new" method and assigning values
        Fraction1 f1 = new Fraction1();
        f1.num = 2;
        f1.denom = 5;
        Fraction1 f2 = new Fraction1();
        f2.num = 3;
        f2.denom = 8;


        //Using the new add method created in Fraction
        f1.add(f2);
        System.out.println("Result: " + f1.num + " / " + f1.denom);

    }
}
