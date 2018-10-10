package ProblemSet2_Q10;

import javax.swing.*;

public class VendingMachineDriver {
    public static void main(String[] args) {
        VendingMachine cokeMachine = new VendingMachine(15,0);

        char choice = 'd';
        int noOfCans=0;

        do {
            choice = JOptionPane.showInputDialog("Welcome to VendFast!\n\n1.Insert a coin and get a can!\n2.Add a new can!\n3.Check how many cans are left!\n4.Check how many coins have been entered?\n5.Exit").charAt(0);

            switch (choice)
            {
                case '1':   if(cokeMachine.getNumberOfCans() > 0)
                            {
                                noOfCans++;
                                JOptionPane.showMessageDialog(null,"You get a can! You now have " + noOfCans + " can(s).", "Can get!", JOptionPane.INFORMATION_MESSAGE);
                                cokeMachine.tokenEntered();
                                break;
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"There are no more cans in the machine.", "Error!", JOptionPane.ERROR_MESSAGE);
                                break;
                            }


                case '2':   JOptionPane.showMessageDialog(null,"You insert a can!");
                            cokeMachine.fillUp(cokeMachine.getNumberOfCans());
                            break;

                case '3':   JOptionPane.showMessageDialog(null, "There are " + cokeMachine.getNumberOfCans() + " cans of coke left.");
                            break;

                case '4':   JOptionPane.showMessageDialog(null, "There are " + cokeMachine.getNumberOfTokens() + " tokens entered.");
                            break;

                case '5':   break;

                default:    JOptionPane.showMessageDialog(null, "Invalid choice! Please enter another.", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }while(choice != '5');

        System.exit(0);
    }

}
