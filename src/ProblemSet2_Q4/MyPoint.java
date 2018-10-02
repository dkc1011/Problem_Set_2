package ProblemSet2_Q4;

public class MyPoint {
    private int xVal;
    private int yVal;

    public void setxVal(int xVal)
    {
        this.xVal = xVal;
    }

    public void setyVal(int yVal)
    {
        this.yVal = yVal;
    }

    public int getxVal()
    {
        return this.xVal;
    }

    public int getyVal()
    {
        return this.yVal;
    }



    public String toString()
    {
        return "X = " + getxVal() + "\nY = " + getyVal();
    }


}
