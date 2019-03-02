package org.razertory.javacodelab.sort;

import org.junit.Assert;

import java.util.Random;

/**
 * @author springchan
 * @date 2019/3/2
 * @description
 **/
public class SortHelper {

    // 随机数组
    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size);
        }
        return arr;
    }

    // 检查是否从小到大
    public static boolean validate(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i + 1]) return false;
        }
        return true;
    }
}
