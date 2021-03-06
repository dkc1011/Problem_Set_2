package ProblemSet2_Q1;

import javax.swing.*;

public class Book {
    private String title;
    private float price;
    private String ISBN;
    private int numberOfPages;

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public String getISBN()
    {
        return ISBN;
    }

    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages(){
        return numberOfPages;
    }

    public Book(){
        this.title = "No Title";
        this.price = 0.00f;
        this.ISBN = "No ISBN";
        this.numberOfPages = 0;
    }

    public String toString(){
        return "Title: " + this.title + "\nPrice: " + this.price + "\nISBN: " + this.ISBN + "\nNumber of Pages: " + this.numberOfPages + "\n\n";
    }

    public Book(String title, float price, String ISBN, int numberOfPages){
        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setNumberOfPages(numberOfPages);
    }
}
