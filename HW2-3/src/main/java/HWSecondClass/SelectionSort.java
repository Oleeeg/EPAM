package HWSecondClass;

public class SelectionSort {
    public static int[] selectionSort(int array[]) {
        int min_idx;
        int temp;
        for (int i = 0; i < array.length; i++) {
            min_idx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_idx]) {
                    min_idx = j;
                }
            }
            temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
