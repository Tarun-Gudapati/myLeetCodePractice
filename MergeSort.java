import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 5, 9, 7, 6, 4 };
        System.out.println(Arrays.toString(Msort(arr)));

    }

    public static int[] Msort(int[] arr) {
        if (arr.length <= 1)
            return arr;
        int len = arr.length;
        int middle = len / 2;
        int[] leftSide = new int[middle];
        int[] rightSide = new int[len - middle];
        int i = 0;
        int j = 0;
        for (; i < len; i++) {
            if (i < middle) {
                leftSide[i] = arr[i];
            } else {
                rightSide[j] = arr[i];
                j++;
            }
        }
        leftSide = Msort(leftSide);
        rightSide = Msort(rightSide);
        return merge(leftSide, rightSide);

    }

    private static int[] merge(int[] first, int[] second) {
        int[] x = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                x[k] = first[i];
                i++;
            } else {
                x[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            x[k] = first[i];
            i++;
            k++;

        }
        while (j < second.length) {
            x[k] = second[j];
            j++;
            k++;

        }
        return x;

    }

}
