package org.razertory.datastructure.queue;

import java.util.ArrayList;
import java.util.ArrayDeque;

/**
 * 滑动窗口：根据窗口大小找出当前窗口的最大值
 * 解法一：两个循环，循环一是遍历整个数组，循环二是找出窗口中的最大值（注意边界问题，条件问题）
 * 解法二：双端队列，在队列中操作数组下标，操作下标的意义有两个，一个是不用写两个循环，二是不用
 * 重复遍历很多数据
 * 
 */

// https://www.nowcoder.com/practice/1624bc35a45c42c0bc17d17fa0cba788?tpId=13&tqId=11217&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
public class SlidingWindow {

    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int begin;
        if(num.length == 0 || size == 0)
            return array;
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
        for (int i = 0; i < num.length; i++){
            begin = i - size + 1;
            if(ad.isEmpty()){
                ad.add(i);
            }else if(begin > ad.peekFirst()){  //踢出不在窗口范围内的元素下标
                ad.pollFirst();
            }
            while((!ad.isEmpty()) && num[ad.peekLast()] <= num[i]){ //筛选出最大值
                ad.pollLast();
            }
            ad.add(i);
            if (begin >= 0){
                array.add(num[ad.peekFirst()]);
            }
        }
        return array;
    }


    //暴力法，双循环
    public ArrayList<Integer> maxInWindows1(int[] num, int size) {
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
