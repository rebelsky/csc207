public class Fib {
    public static int calls = 0;

    public static int fib(int n) {
        ++calls;
        if ((n == 0) || (n == 1)) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        } // else
    } // fib(int)

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("fib(" + n + ") = " + fib(n));
        System.out.println("   took " + calls + " calls.");
    } // main(String[])
} // class Fib
