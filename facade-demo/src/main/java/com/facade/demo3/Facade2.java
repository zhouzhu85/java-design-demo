package com.facade.demo3;

public class Facade2 implements AbstractFacade{
    private SubSystem02 subSystem02=new SubSystem02();
    private SubSystem03 subSystem03=new SubSystem03();
    private SubSystem04 subSystem04=new SubSystem04();
    @Override
    public void color() {
        System.out.println("需要黑色系统：");
        subSystem02.sys();
        subSystem03.sys();
        subSystem04.sys();
    }

    @Override
    public void shape() {
        System.out.println("需要长方形系统：");
        subSystem02.sys();
        subSystem03.sys();
        subSystem04.sys();
    }
}
