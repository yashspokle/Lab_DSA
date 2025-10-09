public class BinarySearch {
    public static int binarySearch(int arr[], int left, int right, int key) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (key < arr[mid]) {
                return binarySearch(arr, left, mid - 1, key);
            }

            return binarySearch(arr, mid + 1, right, key);
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 9, 10, 150, 205, 250 };
        int key = 150;

        int result = binarySearch(arr, 0, arr.length - 1, key);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index : " + result);
        }
    }
}
