package ProblemSet2_Q5;

import javax.swing.*;

public class BikeProcessor {
    public static void main(String[] args) {
        //Create bike 1
        String name, make;
        float value;

        name = JOptionPane.showInputDialog("1. Enter the owner's name: ");
        value = Float.parseFloat(JOptionPane.showInputDialog("1. Enter the value of the bike in €:"));
        make = JOptionPane.showInputDialog("1. Enter the make of the bike: ");
        Bicycle bike1 = new Bicycle(name, value, make);


        //Create bike 2
        Bicycle bike2 = new Bicycle();

        bike2.setOwnerName(JOptionPane.showInputDialog("2. Enter the owner's name: "));
        bike2.setValue(Float.parseFloat(JOptionPane.showInputDialog("2. Enter the value of the bike in €:")));
        bike2.setMake(JOptionPane.showInputDialog("2. Enter the make of the bike: "));


        //Increase bike 1 value
        value = (bike1.getValue() + 10);
        bike1.setValue(value);


        //Output owner name and values of both bikes
        JOptionPane.showMessageDialog(null, "Owner of bike 1: " + bike1.getOwnerName() +
                "\nValue of bike 1: €" + bike1.getValue() + "\n\n\nOwner of bike 2: " + bike2.getOwnerName() +
                "\nValue of bike 2: €" + bike2.getValue(), "Bike information", JOptionPane.INFORMATION_MESSAGE);


        //Calculate and display the total value of the 2 Bicycles
        JOptionPane.showMessageDialog(null,"Total value of both bikes: €" + (bike1.getValue()+bike2.getValue()), "Total Value", JOptionPane.INFORMATION_MESSAGE);

        //End
        System.exit(0);

    }
}