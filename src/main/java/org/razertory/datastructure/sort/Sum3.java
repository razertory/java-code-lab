package org.razertory.datastructure.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.lintcode.com/problem/3sum/description
public class Sum3 {

    /**
     * @param numbers: Give an array numbers of n integer
     * @return: Find all unique triplets in the array which gives the sum of zero.
     */
    public List<List<Integer>> threeSum(int[] numbers) {
        if(null == numbers || numbers.length < 3) {
            return new ArrayList<>();
        }
        //对原数组进行排序
        Arrays.sort(numbers);
        List threeNums = new ArrayList<>();
        for(int i = 2; i < numbers.length; i++ ) {
            if((i != numbers.length - 1) && (numbers[i] == numbers[i+1])) {
                continue;
            }
            List<List<Integer>> records = twoSum(numbers, i, numbers[i]);
            threeNums.addAll(records);
        }
        return threeNums;
    }


    /**
     * @param numbers  排好序的数组
     * @param index    三数求和中第三个数的位置
     * @param compare 三数求和中第三个数
     * @return
     */
    private List<List<Integer>> twoSum(int[] numbers, int index, int compare) {
        if(null == numbers || numbers.length < 2) {
            return new ArrayList<>();
        }
        List<List<Integer>> records = new ArrayList<>();
        int head = 0;
        //将第三个数前面的数取出两个
        //不用考虑第三个数后面的数,因为当后面的数成为被比较的第三个数的时候就会囊括
        int tail = index - 1;
        while(head < tail) {
            if(numbers[head] + numbers[tail] == -compare) {
                List<Integer> record = new ArrayList<>();
                record.add(numbers[head]);
                record.add(numbers[tail]);
                record.add(compare);
                records.add(record);
                head++;
                tail--;
                //从前往后,如果head位置的数和head+1的数相等,直接到head+2
                while (head < tail && numbers[head] == numbers[head-1]) {
                    head+=1;
                }
                //同理
                while (head < tail && numbers[tail+1] == tail) {
                    tail-=1;
                }
            }else {
                //前两个数比第三个数绝对值大,则前两个数的选择范围前移
                if(numbers[head] + numbers[tail] > -compare) {
                    tail-=1;
                }else {//否则后移
                    head+=1;
                }
            }
        }
        return records;
    }
}
