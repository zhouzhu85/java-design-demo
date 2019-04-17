package com.facade.demo3;

public class Facade1 implements AbstractFacade{
    private SubSystem01 subSystem01=new SubSystem01();
    private SubSystem02 subSystem02=new SubSystem02();
    private SubSystem03 subSystem03=new SubSystem03();
    @Override
    public void color() {
        System.out.println("需要红色的系统：");
        subSystem01.sys();
        subSystem02.sys();
        subSystem03.sys();
    }

    @Override
    public void shape() {
        System.out.println("需要方形系统：");
        subSystem01.sys();
        subSystem02.sys();
        subSystem03.sys();
    }
}
