import java.util.*;

public class LinearSearch {

    int[] arr = { 3, 5, 362, 7544, 8454 };
    int key;
    int size = arr.length - 1;

    // Search
    public void search() {

        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Element" + " " + key + "found at index" + " " + arr[i]);
                break;
            } else {
                System.out.println("Element Not found.");

            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = { 3, 5, 362, 7544, 8454 };
        System.out.println("Enter element to search");
        int key = s.nextInt();
        LinearSearch ls = new LinearSearch();

        ls.search();

    }

}
