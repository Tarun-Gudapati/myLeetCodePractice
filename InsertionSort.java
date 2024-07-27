public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 6, 5, 4, 9, 8, 7, 3 };
        Isort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void Isort(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1])
                    swap(arr, j, j - 1);
                else
                    break;
            }

        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = 0;
        temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;

    }
}
