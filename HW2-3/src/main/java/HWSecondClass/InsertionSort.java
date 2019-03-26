package HWSecondClass;

public class InsertionSort {
    public static int[] insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            int temp;
            while (j >= 0 && array[j] > key) {
                temp = array[j + 1];
                array[j + 1] = array[j];
                array[j] = temp;
                j = j - 1;
            }
        }
        return array;
    }
}
