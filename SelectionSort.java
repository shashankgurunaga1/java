import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = { 3, 4, 9, 5, 2, 1 };
        int length1 = array.length;
        selectionsort(array, length1);
        for (int ele = 0; ele < length1; ele++) {
            System.out.println("Element at" + ele + "is" + array[ele]);
        }

    }

    static void selectionsort(int[] array, int length1) {
        for (int i = 0; i < length1; i++) {
            int min = i;
            for (int j = i + 1; j < length1; j++) {
                if (array[j] < array[min]) {
                    min = j;
                    int temp = array[min];// temporarily storing the lower value
                    array[min] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
