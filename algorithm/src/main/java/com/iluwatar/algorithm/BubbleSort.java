package com.iluwatar.algorithm;

import java.util.Arrays;


/**
 * @author huangshengming
 *
 * 1、比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 *
 * 2、对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 *
 * 3、针对所有的元素重复以上的步骤，除了最后一个。
 *
 * 4、持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */
public class BubbleSort implements IArraySort {
    @Override
    public int[] sort(int[] sortArray) {
        int[] arr = Arrays.copyOf(sortArray, sortArray.length);

        for (int i = 1; i < arr.length; i++){
            // 此标志为true，则说明后面的元素为全部有序
            boolean isSort = true;
            for (int j = 0; j < arr.length-i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    isSort = false;
                }
            }

            if (isSort){
                break;
            }
        }
        return arr;
    }
}
