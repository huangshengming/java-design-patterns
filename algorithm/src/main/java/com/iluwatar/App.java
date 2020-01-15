package com.iluwatar;

import com.iluwatar.algorithm.BubbleSort;
import com.iluwatar.algorithm.InsertSort;
import com.iluwatar.algorithm.QuickSort;
import com.iluwatar.algorithm.SelectionSort;

public class App {

    public static void main(String[] args) {
        int[] arrays = new int[]{3,4,2,9,5,8};

        System.out.println("---------------------选择排序----------------------------");
        // 选择排序
        SelectionSort selectionSort = new SelectionSort();
        int[] selectResult = selectionSort.sort(arrays);
        for (int i = 0; i < selectResult.length; i++) {
            System.out.println(selectResult[i]);
        }

        System.out.println("---------------------冒泡排序----------------------------");
        // 冒泡排序
        BubbleSort bubbleSort = new BubbleSort();
        int[] bubbleResult = bubbleSort.sort(arrays);
        for (int i = 0; i < bubbleResult.length; i++) {
            System.out.println(bubbleResult[i]);
        }

        System.out.println("---------------------直接插入排序----------------------------");
        // 冒泡排序
        InsertSort insertSort = new InsertSort();
        int[] insertResult = insertSort.sort(arrays);
        for (int i = 0; i < insertResult.length; i++) {
            System.out.println(insertResult[i]);
        }

        System.out.println("---------------------快速排序----------------------------");
        // 冒泡排序
        QuickSort quickSort = new QuickSort();
        int[] quickResult = quickSort.sort(arrays);
        for (int i = 0; i < quickResult.length; i++) {
            System.out.println(quickResult[i]);
        }
    }
}
