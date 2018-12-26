package org.razertory.datastructure.string;

public class KMP {
    public static int kmp(String text,String target){
        if (text == null || target == null || "".equals(text)
                || "".equals(target))
            return -1;
        char[] targetChars = target.toCharArray();
        char[] textChars = text.toCharArray();

        int textIndex = 0,targetIndex = 0;

        int[] next = getNext(target);

        while (targetIndex < targetChars.length && textIndex < textChars.length){
            if (targetIndex == -1 || targetChars[targetIndex] == textChars[textIndex]){
                ++targetIndex;
                ++textIndex;
            }else targetIndex = next[targetIndex];
        }

        if (targetIndex == targetChars.length) return textIndex - targetIndex;

        return -1;
    }

    private static int[] getNext(String target) {
        char[] p = target.toCharArray();
        int[] next = new int[p.length];
        next[0] = -1;
        int j = 0;
        int k = -1;
        while (j < p.length - 1) {
            //k = -1 将k置0，将j+1
            if (k == -1 || p[j] == p[k]) {
                //下一个字符比较如果相等就跳过，避免子串重复回溯
                if (p[++j] == p[++k]) {
                    next[j] = next[k];
                } else {
                    next[j] = k;
                }
            } else {
                k = next[k];
            }
        }
        return next;
    }
}
