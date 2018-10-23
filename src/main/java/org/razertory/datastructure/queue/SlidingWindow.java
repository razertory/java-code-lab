package org.razertory.datastructure.queue;

import java.util.ArrayList;

/**
 * 滑动窗口：根据窗口大小找出当前窗口的最大值
 * 解法一：两个循环，循环一是遍历整个数组，循环二是找出窗口中的最大值（注意边界问题，条件问题）
 * 解法二：双端队列，继续优化？？？？？？？？？
 */

// https://www.nowcoder.com/practice/1624bc35a45c42c0bc17d17fa0cba788?tpId=13&tqId=11217&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
public class SlidingWindow {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        if (size > num.length || size == 0) {
            return new ArrayList<Integer>();
        }

        ArrayList<Integer> array = new ArrayList<Integer>();

        for (int i = 0; i <= num.length - size; i++) {
            int a = 0;

            for (int j = i; j < i + size; j++) {
                a = Math.min(a, num[j]);
            }

            array.add(a);
        }
        return array;
    }
}
