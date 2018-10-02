package ProblemSet2_Q2;

import javax.swing.*;

public class EmailSystem {
    public static void main(String[] args) {
        Message msg1 = new Message();

        msg1.setSender(JOptionPane.showInputDialog("From: "));
        msg1.setRecipient(JOptionPane.showInputDialog("To: "));
        msg1.setMessage(JOptionPane.showInputDialog("Message: "));

        JOptionPane.showMessageDialog(null,msg1.toString(),"Email to: " + msg1.getRecipient(),JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showConfirmDialog(null,"Confirm Email Send?");
    }
}
