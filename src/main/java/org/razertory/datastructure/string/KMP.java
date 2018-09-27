package org.razertory.datastructure.string;

/*
 * @Author Awarker
 */
public class KMP {
    public void kmpSearch(String pat, String txt) {
        
        String a = "ababa";
        String b = "ssdfgasdbababx";
        int[] next = get_next(a);
        int res = kmp(b, a,next);
        System.out.println(res);
        for(int i = 0; i < next.length; i++){
            System.out.print(" --> "+next[i]);            
        }
        System.out.println();
        System.out.println(next.length);
    }
    
    public  int kmp(String str, String dest,int[] next){//str被匹配串  dest 匹配串
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
     public  int[] get_next(String str){
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
