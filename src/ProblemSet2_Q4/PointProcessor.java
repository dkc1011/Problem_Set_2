//PointProcessor.java by Daragh Carroll t00201097
/*
This program communicates with MyPoint.java to create a point, check the point's position, reposition the point
and calculate the distance between the point and the origin(0,0).
*/

package ProblemSet2_Q4;

import javax.swing.*;

public class PointProcessor {
    public static void main(String[] args) {
        MyPoint point = new MyPoint(1,6);
        int loopSentinel = 0;
        do{
        String choice = JOptionPane.showInputDialog("What function would you like? \n\t\t A - Check Point Location \n B - Translate the Point \n C - Calculate the distance to the Origin \n D - Exit");
        char choiceAsChar = choice.toUpperCase().charAt(0);

            switch (choiceAsChar) {
                case 'A':
                    JOptionPane.showMessageDialog(null, point.toString(), "Point Location", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 'B':
                    point.translate();
                    break;

                case 'C':
                    JOptionPane.showMessageDialog(null, point.distanceFromOrigin(), "Move Point", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 'D':
                    loopSentinel = -1;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid Option!", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }while(loopSentinel >= 0);

        System.exit(0);
    }
}
