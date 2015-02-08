import sort.Sort;
import prolog.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu;
        boolean exitMenu = true;
        while (exitMenu == true) {
            System.out.print("START MENU\n1 - Sort algorithm\n2 - fibonacci\n0 - exit\n");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    Sort sort = new Sort();
                    sort.menu_sort();
                    break;
                case 2:
                    Fibonacci fibonacci = new Fibonacci();
                    fibonacci.fibonacciNumber();
                    break;
                default: exitMenu = false;
                    break;
            }
        }
    }
}
