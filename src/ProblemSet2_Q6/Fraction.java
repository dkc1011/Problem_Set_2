package ProblemSet2_Q6;

public class Fraction {
    private int numerator;
    private int denominator;

    //Accessors and Mutators
    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator)
    {
        this.denominator = denominator;
    }

    public int getNumerator()
    {
        return this.numerator;
    }

    public int getDenominator()
    {
        return this.denominator;
    }

    //Constructors
    public Fraction()
    {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator)
    {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    //toString
    public String toString()
    {
        return getNumerator() + "/" + getDenominator();
    }

}
