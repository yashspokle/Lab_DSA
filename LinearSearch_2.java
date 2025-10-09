public class LinearSearch_2 {
    public static int search(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int target = 30;
        int result = search(arr, target);
        if (result == -1) {
            System.out.println("Element Not found");
        } else {
            System.out.println("Element " + target + " " + "found at index" + " " + result);
        }
    }
}
