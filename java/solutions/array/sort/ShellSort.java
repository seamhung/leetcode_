package solutions.array.sort;

import solutions.utility.ArrayListEngine;

/**
 * Created by hoducust on 2018/8/12 22H 52m .
 */
public class ShellSort {

    /**
     * 希尔排序： 将数组通过 gap 划分为不同的 小区间 通过将小区间的有序（比较间隔 两端的大小进行交换），逐渐缩小gap的大小 ，将数组排序为有序
     *
     * @param arr
     * @return sorted arr
     */
    public int[] solution1(int[] arr) {

        int len = arr.length, gap = len / 3;

        while (gap > 0) {

            for (int i = gap; i < len; i++) {
                for (int j = i; j - gap > -1 && arr[j] < arr[j - gap]; j -= gap) {
                    int temp = arr[j];
                    arr[j] = arr[j - gap];
                    arr[j - gap] = temp;
                }
            }
            gap = gap / 2;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] list = new ArrayListEngine().randomGenerateArray(9999, 1000000, 1423L);
        int[] result = new ShellSort().solution1(list);
    }

}
