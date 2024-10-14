package oct.ex_14102024.Tasks;

public class Runner {
    public static void main(String [] args) {
        Book myBook = new PrintMyBook();
        myBook.getDetails("Harry Potter", "J.k. Rowling", 120);
    }
}
