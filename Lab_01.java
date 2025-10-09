import java.util.Scanner;

public class Lab_01 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = s1.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = s1.nextInt();
        }
        int evenCount = 0, oddCount = 0;
        int[] evenList = new int[size];
        int[] oddList = new int[size];
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                evenList[evenCount++] = array[i];
            } else {
                oddList[oddCount++] = array[i];
            }
        }
        System.out.println("All elements:");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println("Even Elements:");
        for (int i = 0; i < evenCount; i++) {
            System.out.println(evenList[i] + " ");
        }
        System.out.println("Odd Elements:");
        for (int i = 0; i < oddCount; i++) {
            System.out.println(oddList[i] + " ");
        }
        if (size >= 4) {
            System.out.println("The 4th element is: " + array[3]);
        } else {
            System.out.println("The array size is less than 4.");
        }
        s1.close();
    }
}