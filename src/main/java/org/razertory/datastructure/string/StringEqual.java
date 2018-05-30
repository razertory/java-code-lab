package org.razertory.datastructure.string;

public class StringEqual {

	/**
	 * 字符串比较
	 * @author razertory
	 */
	public static void main(String[] args) {
		// s1和s2被分配到永久区(方法区)的运行时常量池的相同的内存
		String s1 = "abc";
		String s2 = "abc";
		
		// s3和s4被分配到堆中的两个不同对象
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		System.out.println(s1 == s2); //true
		System.out.println(s1.equals(s2)); //true
		
		System.out.println(s3 == s4); //false
		System.out.println(s3.equals(s4)); //ture

		System.out.println(s1 == s3); //false
		System.out.println(s1.equals(s3)); //true
	}

}
