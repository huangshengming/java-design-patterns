package com.iluwatar.algorithm;

import java.util.Arrays;

/**
 * @author huangshengming
 *
 * 1、首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
 *
 * 2、再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 *
 * 3、重复第二步，直到所有元素均排序完毕。
 *
 * 选择排序算法实现
 */
public class SelectionSort implements IArraySort {

    @Override
    public int[] sort(int[] sortArray) {
        int[] arr = Arrays.copyOf(sortArray, sortArray.length);

        for (int i = 0; i < arr.length-1; i++){
            int min = i;

            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            if (min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

        }
        return arr;
    }
}
