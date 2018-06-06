package org.razertory.datastructure.designPatterns.singleton.classic;

/**
 * 懒汉式
 * 经典的非线程安全单例模式实现类
 * @author razertory
 *
 */
public class Singleton {
    private static Singleton instance;
    
    private Singleton(){ }
    
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
