package solutions.array.sort;

import solutions.utility.ArrayListEngine;

/**
 * Created by hoducust on 2018/8/12 22H 51m .
 */
public class BubbleSort {


    public int[] solution1(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {

            for (int j = 0; j < i; j++) {
                int curr = arr[j];
                int next = arr[j + 1];
                if (curr > next) {
                    int tmp = curr;
                    curr = next;
                    next = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] list = new ArrayListEngine().randomGenerateArray(100, 100, 1423L);


        new BubbleSort().solution1(list);
    }
}
