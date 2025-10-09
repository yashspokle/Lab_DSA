import java.util.*;

public class Bubblesort {
    public static void main(String[] args) {
        int temp;
        int[] array = { 6, 5, 4, 3, 7, };
        int size = array.length;

        for (int i = 0; i < (size - 1); i++) {
            for (int j = 0; j < (size - i - 1); j++) {

                if (array[j + 1] < array[j]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }

        }
        System.out.println("Sorted Array");
        for (int a = 0; a <= (size - 1); a++) {
            System.out.print(array[a] + " ");
        }

    }
}

   