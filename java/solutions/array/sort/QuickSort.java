package solutions.array.sort;

import solutions.utility.ArrayListEngine;

/**
 * Created by hoducust on 2018/8/12 22H 52m .
 *
 * 快速排序： 通过标定点，将待排序数组进行分区操作；
 *          （通过标定点将待排序数组分为 小于标定点/大于标定段，）
 *
 */
public class QuickSort {

    private int partition(int[] arr, int l, int r) {
        int v = arr[l];
        int j = l;
        for (int i = l + 1; i <= r; i++) { // 大分区起始点 从标定点下一个开始
            if (arr[i] < v) {
                // 将小于标定点的 数据移动到小数分区中 （注意，小分区从标定点下一个开始）
                swap(arr, ++j, i);
            }
        }
        // 分区完成 将标定点移动到 小分区尾端
        swap(arr, l, j);
        return j;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void sort(int[] arr, int l, int r) {

        if (l >= r) {
            return;
        }
        int p = partition(arr, l, r);
        sort(arr, l, p - 1);
        sort(arr, p + 1, r);

    }

    public int[] solution1(int[] arr) {
        int len = arr.length;
        sort(arr, 0, len - 1);
        return arr;
    }

    public static void main(String[] args) {
        int[] list = new ArrayListEngine().randomGenerateArray(9999, 1000000, 1423L);
        new QuickSort().solution1(list);
    }
}
