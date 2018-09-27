package org.razertory.datastructure.string;

/*
 * @Author Awarker
 * KMP算法
 * 应用场景：两个字符串匹配的情况
 * 核心：KMP算法的关键是利用匹配失败后的信息，尽量减少子串与主串的匹配次数以达到快速匹配的目的
 */
public class KMP {
	//pat子串    txt  父串 
    public boolean kmpSearch(String pat, String txt) {
        int[] next = getNext(pat);
        int res = kmp(txt, pat,next);
        return res == 0;
    }
    
    public  int kmp(String str, String dest,int[] next){//str父串  dest 子串
        for(int i = 0, j = 0; i < str.length(); i++){
            while(j > 0 && str.charAt(i) != dest.charAt(j)){
                j = next[j - 1];
            }
            if(str.charAt(i) == dest.charAt(j)){
                j++;
            }
            if(j == dest.length()){
                return i-j+1;
            }
        }
        return 0;
    }
    /**
	 * 
	 * @param str
	 * @return
	 * 
	 * 这个是KMP算法最核心的部分，得出子串的重复字符，
	 * 也就是和父串匹配失败后下一次子串匹配开始的位置
	 */
     public  int[] getNext(String str){
        int[] next = new int[str.length()];
        next[0] = 0;
        for(int i = 1,j = 0; i < str.length(); i++){
            while(j > 0 && str.charAt(j) != str.charAt(i)){
                j = next[j - 1];
            }
            if(str.charAt(i) == str.charAt(j)){
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
