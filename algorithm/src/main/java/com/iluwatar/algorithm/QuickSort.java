package com.iluwatar.algorithm;

import java.util.Arrays;

/**
 * @author huangshengming
 *
 * 1、从数列中挑出一个元素，称为 “基准”（pivot）;
 *
 * 2、重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
 *
 * 3、递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序；
 */
public class QuickSort implements IArraySort{
    @Override
    public int[] sort(int[] sortArray) {
        int[] arr = Arrays.copyOf(sortArray, sortArray.length);
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    public void quickSort(int[] array, int left, int right){
        if (left < right){
            int startValue = array[left];

            int i = left+1, j = right;
            while (i <= j){
                while (i <= j && array[i] < startValue){
                    i++;
                }
                while (i <= j && array[j] > startValue){
                    j--;
                }

                if (i <= j){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            // 将基准点放入最终找到的位置
            array[left] = array[j];
            array[j] = startValue;

            // 递归调用排序
            quickSort(array, left, j - 1);
            quickSort(array, j+1, right);
        }
    }
}
