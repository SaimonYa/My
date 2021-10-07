package lab2_1_5;

public class lab2_1_5_5 {
    public static int recursion(int n, int k) {
        if (n==0) return k;
        if (n>0) return (recursion(n / 10, k+n%10));
        return 1;
    }

    public static void main(String[] args) {
        int n=64373;
        int k=0;
        System.out.println(recursion(n, k));
    }
}
