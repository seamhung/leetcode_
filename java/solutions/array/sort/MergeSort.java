package solutions.array.sort;

import solutions.utility.ArrayListEngine;

import java.util.Arrays;

/**
 * Created by hoducust on 2018/8/12 22H 52m .
 */
public class MergeSort {

    private void merge(int[] arr, int l, int mid, int r) {
        // copy 待排序段
        int[] aux = Arrays.copyOfRange(arr, l, r+1);
        // 初始化 左右两段 其实位置
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {

            if (i > mid) { // 左边已经 merge 完毕
                arr[k] = aux[j - l];
                j++;
            } else if (j > r) { // 右边已经 merge 完毕
                arr[k] = aux[i - l];
                i++;
            } else if (aux[i - l] < aux[j - l]) { // 左边小于右边的情况
                arr[k] = aux[i - l];
                i++;
            } else {
                arr[k] = aux[j - l];
                j++;
            }
        }
    }

    // 递归调用 [l,r] 区间中的元素，进行合并排序
    private void sort(int[] arr, int l, int r) {
        if(l >= r) return;

        int mid = (l + r) / 2;
        sort(arr, l, mid);
        sort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    //
    public int[] solution1(int[] arr) {
        int len = arr.length;
        sort(arr, 0, len - 1);
        return arr;
    }

    public static void main(String[] args) {
        int[] list = new ArrayListEngine().randomGenerateArray(9999, 1000000, 1423L);
        // int[] copyList = Arrays.copyOfRange(list, 7, 8);
        new MergeSort().solution1(list);
    }
}
