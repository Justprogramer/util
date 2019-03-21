package algorithm;

import java.util.Arrays;

/**
 * author: TAOPENG
 * time ： 2019/3/8
 **/
public class QuickSort {
    private void quickSort(int[] a, int head, int tail) {
        int mid = partition(a, head, tail);
        if (mid < tail) {
            quickSort(a, mid, tail);
        }
        if (mid - 1 > head) {
            quickSort(a, head, mid - 1);
        }
    }

    private int partition(int[] a, int left, int right) {
        int pivot = a[(left + right) / 2];
        while (left <= right) {
            while (a[left] < pivot) left++;
            while (pivot < a[right]) right--;
            if (left < right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            } else if (left == right) {
                left++;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] a = {12, 23, 23, 11, 444, 22, 41, 52, 778};
        quickSort.quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
