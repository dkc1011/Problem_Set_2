package ProblemSet2_Q10;

public class VendingMachine {
    private static int numberOfCans = 0;
    private static int numberOfTokens = 0;

    public void tokenEntered(){
        VendingMachine.numberOfCans--;
        VendingMachine.numberOfTokens++;
    }

    public void fillUp(int numberOfCans)
    {
        VendingMachine.numberOfCans++;
    }

    public int getNumberOfCans()
    {
        return numberOfCans;
    }

    public int getNumberOfTokens()
    {
        return numberOfTokens;
    }

    public VendingMachine()
    {
        this(0,0);
    }

    public VendingMachine(int numberOfCans, int numberOfTokens)
    {
        VendingMachine.numberOfCans = numberOfCans;
        VendingMachine.numberOfTokens = numberOfTokens;
    }


}
