package oct.ex_14102024.Tasks;

public class PrintMyBook extends Book {


    @Override
    void getDetails(String title, String author, int price) {
        // Print the details of the book
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);

    }
}
