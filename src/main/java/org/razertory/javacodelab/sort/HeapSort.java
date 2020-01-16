package org.razertory.javacodelab.sort;

/**
 * 堆排序
 */
public class HeapSort {
    void sort(int[] array) {
        if (array == null || array.length == 0) return;
        buildMaxHeap(array, array.length - 1);
        for (int end = array.length - 1; end > 0; end--) {
            swap(array, 0, end);
            siftDown(array, 0, end - 1);
        }
    }

    private void buildMaxHeap(int[] arr, int end) {
        for (int i = end/2; i >= 0; i--) {
            siftDown(arr, i, end);
        }
    }

    private void siftDown(int[] arr, int i, int end) {
        int parent = i, child = 2 * parent + 1;
        while (child <= end) {
            if (child+1 <= end && arr[child+1] > arr[child]) ++child;
            if (arr[parent] >= arr[child]) break;
            swap(arr, parent, child);
            parent = child;
            child = 2 * parent + 1;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
