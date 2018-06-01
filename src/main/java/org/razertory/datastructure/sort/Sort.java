package org.razertory.datastructure.sort;

/**
 * 排序算法的接口
 * @author razertory
 */
public abstract class Sort {

	/**
	 * 对数组array进行升序排序
	 *
	 * @param array
	 */
	void sort(int[] array) {
	}

	public Sort(){
		System.out.println(this.getClass().getName());
	}
}
