public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 6, 3, 4, 1, 7, 2, 1 };
        System.out.println("Elements before sorting are of the order");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
        bubblesort(arr);
        System.out.println("Elements after sorting are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }

    static void bubblesort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
