package ProblemSet2_Q4;

import javax.swing.*;

public class MyPoint {
    private int xVal;
    private int yVal;

    private void setxVal(int xVal)
    {
        this.xVal = xVal;
    }

    private void setyVal(int yVal)
    {
        this.yVal = yVal;
    }

    private int getxVal()
    {
        return this.xVal;
    }

    private int getyVal()
    {
        return this.yVal;
    }

    public MyPoint() {
        this.xVal = 0;
        this.yVal = 0;
    }

    public MyPoint(int xVal, int yVal)
    {
        setxVal(xVal);
        setyVal(yVal);
    }

    private void moveHorizontally(int xVal){
        int movement = Integer.parseInt(JOptionPane.showInputDialog("Enter a distance to move horizontally:"));

        this.xVal = xVal + movement;
    }

    private void moveVertically(int yVal){
        int movement = Integer.parseInt(JOptionPane.showInputDialog("Enter a distance to move vertically:"));

        this.yVal = yVal + movement;
    }

    public void translate() {
        moveHorizontally(this.xVal);
        moveVertically(this.yVal);
    }

    public String distanceFromOrigin(){
        double distance = Math.sqrt((this.xVal*this.xVal)+(this.yVal*this.yVal));

        return "The point is " + String.format("%.2f",distance) + " units from (0,0).";
    }

    public String toString()
    {
        return "The point is at (" + getxVal() + "," + getyVal() + ")";
    }


}
