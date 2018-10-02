package ProblemSet2_Q1;

public class simpleDriver {
    public static void main(String[] args) {
        Book endersGame = new Book();
        Book lordOfTheRings = new Book();
        Book rainbowSix = new Book();

        endersGame.setTitle("Ender's Game");
        endersGame.setPrice(10.50f);
        endersGame.setISBN("A12FY15692");
        endersGame.setNumberOfPages(220);

        lordOfTheRings.setTitle("The Lord of the Rings");
        lordOfTheRings.setPrice(22.50f);
        lordOfTheRings.setISBN("B51JN2152");
        lordOfTheRings.setNumberOfPages(820);

        System.out.println(endersGame.toString());

        System.out.println("Title: " + lordOfTheRings.getTitle() + "\nPrice: " + lordOfTheRings.getPrice() + "\nISBN: " + lordOfTheRings.getISBN() + "\nNumber of Pages: " + lordOfTheRings.getNumberOfPages() + "\n\n");

        System.out.println(rainbowSix.toString());

    }
}
