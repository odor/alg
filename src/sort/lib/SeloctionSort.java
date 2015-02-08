package sort.lib;

import java.util.Random;

public class SeloctionSort {
    private static final int LONG_ARRAY = 25;
    public void selectionSort(){
        System.out.print("\t\tSelection sort\n\t\t");
        Random random = new Random();
        int[] sortArray = new int[LONG_ARRAY];
        for (int i = 0; i < LONG_ARRAY; i++) {
            sortArray[i] = random.nextInt(1000);
            System.out.print(sortArray[i] + "\t");
        }
        System.out.print("\t\tНаходится наименьшее значение и ставится в начало.\n" +
                "\t\tЗатем поиск повторяется уже со второго элемента, потом с третьего...\n\t\t");
        int j;
        for (int k = 0; k < LONG_ARRAY; k++) {
            for (int i = k; i < LONG_ARRAY; i++) {
                if (sortArray[k] > sortArray[i]) {
                    j = sortArray[k];
                    sortArray[k] = sortArray[i];
                    sortArray[i] = j;
                }
            }
        }
        for (int i = 0; i < LONG_ARRAY; i++) {
            System.out.print(sortArray[i] + "\t");
        }
        System.out.print("\n");
    }
}
