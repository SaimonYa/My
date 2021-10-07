package lab2_1_5;
public class lab2_1_5_2 {
    public static int recursion(int n) {
        if (n==0) System.exit(1);
        System.out.println(n);
        if (n>0) {
            return recursion(n-1);
        }
        return 1;
    }
    public static void main(String[] args) {
        int n=45;
        System.out.println(recursion(n));
    }
}
