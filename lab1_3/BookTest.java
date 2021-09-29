import java.util.Scanner;

public class BookTest {
    private static int pages;
    private static String author;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        pages=in.nextInt();
        author=in.nextLine();
        Book book = new Book(pages, author);
        System.out.println(book.toString());
    }
}
