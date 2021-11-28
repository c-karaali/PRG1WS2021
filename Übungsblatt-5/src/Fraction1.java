public class Fraction1 {
    //Attributes of a fraction
    int num;
    int denom;

    //Creating a new method to add fractions
    void add(Fraction2 op) {
        num = (num * op.denom) +
                (op.num * denom);
        denom = denom * op.denom;
    }

    //Creating a new method to subtract fractions
    void sub(Fraction1 op) {
        //Insert code here
    }

}
