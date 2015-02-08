package sort;
import sort.lib.*;
import java.util.Scanner;

public class Sort {
    public void menu_sort () {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tSorting methods:\n" +
                "\t1 - пузырьковая (bubble sort)\n" +
                "\t2 - быстрая (quicksort)\n" +
                "\t3 - выбором (Selection sort)\n");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                break;
            case 2:
                break;
            case 3: {
                SeloctionSort seloctionSort = new SeloctionSort();
                seloctionSort.selectionSort();
            }
                break;
        }
    }

}
