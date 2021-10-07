package lab2_1_5;

public class lab2_1_5_10 {
    public static int recursion(int n, int n1, int a, int k) {
        if (n1==0) return a;
        if (n>0) return (recursion(n/10, n1, a, k+1));
        if (n1>0) return (recursion(n, n1/10, (int) (a+n1%10*Math.pow(10, k-1)), k-1));
        return 1;
    }

    public static void main(String[] args) {
        int n=34767;
        int n1=n;
        int k=0;
        int a=0;
        System.out.println(recursion(n, n1, a, k));
    }
}
