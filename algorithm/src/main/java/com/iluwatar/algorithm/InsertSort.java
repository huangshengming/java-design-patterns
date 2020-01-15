package com.iluwatar.algorithm;

import java.util.Arrays;

/**
 * @author huangshengming
 *
 * 1、将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
 *
 *2、从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。（如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）
 */
public class InsertSort implements IArraySort{
    @Override
    public int[] sort(int[] sortArray) {
        int[] arr = Arrays.copyOf(sortArray, sortArray.length);

        for (int i = 1; i < arr.length; i++) {
            // 将第一个已经作为排好序的元素
            int temp = arr[i];

            int j = i;
            while (j > 0 && arr[j-1] > temp){
                arr[j] = arr[j-1];
                j--;
            }
            if (j != i){
                arr[j] = temp;
            }
        }
        return arr;
    }
}
