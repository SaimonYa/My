import java.util.Scanner;

public class BallTest {
    private static int volume;
    private static String color;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        volume=in.nextInt();
        color=in.nextLine();
        Ball ball = new Ball(volume, color);
    }
}
