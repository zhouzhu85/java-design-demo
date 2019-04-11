package com.singleton.lazy;

/**
 * 懒汉式单例
 */
public class LazySingleton {
    //保证instance在所有线程中同步
    private static volatile LazySingleton instance=null;
    //避免类在外部被实例化
    private LazySingleton() {
    }
    public static synchronized LazySingleton getInstance(){

        if (instance==null){
            instance=new LazySingleton();
        }
        return instance;
    }
}
