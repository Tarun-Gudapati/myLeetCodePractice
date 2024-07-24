import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 10, 1, 2, 5, 7, 4, 9, 6, 8, 3 };
        sort(arr);
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int min = arr[j];
                    int temp = arr[i];
                    arr[i] = min;
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
