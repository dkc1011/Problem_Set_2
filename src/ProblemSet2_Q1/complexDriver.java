package ProblemSet2_Q1;

import javax.swing.*;

public class complexDriver {
    public static void main(String args[])
    {
        Book favoriteBook = new Book();
        Book leastFavoriteBook = new Book();

        favoriteBook.setTitle(JOptionPane.showInputDialog("Please enter the title of your favorite book! :"));
        favoriteBook.setPrice(Float.parseFloat(JOptionPane.showInputDialog("How much does your favorite book cost? :")));
        favoriteBook.setISBN(JOptionPane.showInputDialog("What is the ISBN of your favorite book? : "));
        favoriteBook.setNumberOfPages(Integer.parseInt(JOptionPane.showInputDialog("How many pages are in your favorite book? :")));

        leastFavoriteBook.setTitle(JOptionPane.showInputDialog("Please enter the title of your least favorite book! :"));
        leastFavoriteBook.setPrice(Float.parseFloat(JOptionPane.showInputDialog("How much does your least favorite book cost? :")));
        leastFavoriteBook.setISBN(JOptionPane.showInputDialog("What is the ISBN of your least favorite book? : "));
        leastFavoriteBook.setNumberOfPages(Integer.parseInt(JOptionPane.showInputDialog("How many pages are in your least favorite book? :")));

        JOptionPane.showMessageDialog(null, favoriteBook.toString(), "Your Favorite Book", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, leastFavoriteBook.toString(), "Your Least Favorite Book", JOptionPane.INFORMATION_MESSAGE);
    }
}
