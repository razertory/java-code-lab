package org.razertory.datastructure.queue;

import java.util.ArrayList;

// https://www.nowcoder.com/practice/1624bc35a45c42c0bc17d17fa0cba788?tpId=13&tqId=11217&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
public class SlidingWindow {
    public ArrayList<Integer> maxInWindows(int [] num, int size){
        if(size > num.length || size == 0) {
            return new ArrayList<Integer> ();
        }
        ArrayList<Integer> array = new ArrayList<Integer> ();
        for(int i = 0; i <= num.length - size; i++) {
            int a = 0;
            for(int j = i; j < i + size; j ++) {
                if(a < num[j]) {
                    a = num[j];
                }
            }
            array.add(a);
        }
        return array;
    }
}
