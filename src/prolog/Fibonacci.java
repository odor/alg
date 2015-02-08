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

    private void polinom(int n) {
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

//    private void matrix(int n) {
//        long[][] fib = new long[2][2];
//        long[][] base = new long[2][2];
//        base[0][0] = 0;
//        base[0][1] = 1;
//        base[1][0] = 1;
//        base[1][1] = 1;
//        fib[0][0] = 0;
//        fib[0][1] = 1;
//        fib[1][0] = 1;
//        fib[1][1] = 1;
//        for (int t = 1; t <=n; t++) {
//            for (int i = 0; i < 2; i++) {
//                for (int j = 0; j < 2; j++) {
//                    for (int k = 0; k < 2; k++) {
//                        fib[i][j] = fib[i][k] * base[k][j];
//                    }
//                }
//            }
//        }
//        System.out.println("\tfor N=" + n + "  F=");
//
//    }

    public void fibonacciNumber () {
        System.out.print("\tЭкспоненциальный алгоритм:\n" +
                "\tочень медленный\n");
        for (int i = 0; i <= N; i++)
            System.out.print("\t" + fibExp(i));
        System.out.print("\n\tгорадздо быстрее запоминать в массив:\n(полиномиальный алгоритм)\n");
        polinom(N);
//        System.out.print("\tеще быстрее - f(n) - как n-степень матрицы (0 1, 1 1)\n");
    }
}
