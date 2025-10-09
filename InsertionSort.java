public class InsertionSort {
        int[] array = { 6, 5, 4, 3, 7 };
        int size = array.length;

        // sort
        public void sort() {
                for (int i = 1; i < size; i++) {
                        int temp = array[i];
                        int j = i - 1;

                        while (j >= 0 && array[j] > temp) {
                                array[j + 1] = array[j];
                                j--;
                        }

                        array[j + 1] = temp;
                }
        }

        // print
        public void print() {
                for (int i = 0; i < size; i++) {
                        System.out.print(array[i] + " ");
                }
                System.out.println();
        }

        public static void main(String[] args) {
                InsertionSort ins = new InsertionSort();

                ins.sort();

                System.out.println(" Sorted:");
                ins.print();
        }
}
