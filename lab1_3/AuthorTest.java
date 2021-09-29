import java.util.Scanner;

public class AuthorTest {
    private static String name;
    private static String email;
    private static char gender;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        name=in.nextLine();
        email=in.nextLine();
        int g=in.nextInt(); // нужно вводить код символа Char
        gender = (char) g;
        Author author = new Author(name, email, gender);
        System.out.println(author.toString());
    }
}
