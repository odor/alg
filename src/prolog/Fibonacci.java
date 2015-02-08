package prolog;

public class Fibonacci {
    private static final int N = 40;

    private long fibExp (int n) {
        long fib;
        if (n == 0) {
            fib = 0;
            return fib;
        }
        if (n == 1) {
            fib = 1;
            return fib;
        }
        else {
            fib = fibExp(n - 1) + fibExp(n - 2);
            return fib;
        }
    }

    private void fibExp2 (int n) {
        n = n + 1;
        double[] fib = new double[n];
        fib[0] = 0;
        fib[1] = 1;
        System.out.print("\t" + fib[0] + "\t" + fib[1]);
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib [i - 2];
            System.out.print("\t" + fib[i]);
        }
    }

    public void fibonacciNumber () {
        System.out.print("\tЭкспоненциальный алгоритм:\n" +
                "\tочень медленный\n");
        for (int i = 0; i <= N; i++)
            System.out.print("\t" + fibExp(i));
        System.out.print("\nгорадздо быстрее запоминать в массив:\n(полиномиальный алгоритм)\n");
        fibExp2(N);
        System.out.print("\n\n");

    }
}
