package com.facade.demo1;

public class Facade {
    SubSystem01 subSystem01=new SubSystem01();
    SubSystem02 subSystem02=new SubSystem02();
    SubSystem03 subSystem03=new SubSystem03();
    public void method(){
        subSystem01.method1();
        subSystem02.method2();
        subSystem03.method3();
    }
}
