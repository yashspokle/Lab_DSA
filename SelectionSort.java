public class SelectionSort {
    int[] array = { 6, 5, 4, 3, 7 };
    int size = array.length;
    int temp;

    // sort
    public void sort() {
        for (int i = 0; i < (size - 1); i++) {
            int min = i;

            for (int j = 0; j <= (size - 1); j++) {

                if (array[j] > array[min]) {
                    min = j;

                    
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // print
    public void print() {
        for (int k = 0; k <= (size - 1); k++) {
            System.err.print(+array[k]);
        }
    }

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        ss.sort();
        ss.print();

    }
}
