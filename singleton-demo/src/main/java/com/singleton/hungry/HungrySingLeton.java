package com.singleton.hungry;

/**
 * 饿汉式
 */
public class HungrySingLeton {
    private static final  HungrySingLeton instance=new HungrySingLeton();
    private HungrySingLeton(){

    }
    public static HungrySingLeton getInstance(){
        return instance;
    }
}
