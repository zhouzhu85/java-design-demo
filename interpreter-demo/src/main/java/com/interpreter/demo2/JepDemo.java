package com.interpreter.demo2;


import com.singularsys.jep.Jep;

public class JepDemo {
    public static void main(String[] args)throws Exception{
        Jep jep=new Jep();
        //定义要计算的数据表达式
        String 存款利息="本金*利率*时间";
        //给相关变量赋值
        jep.addVariable("本金",10000);
        jep.addVariable("利率",0.038);
        jep.addVariable("时间",2);
        jep.parse(存款利息);    //解析表达式
        Object accrual=jep.evaluate();    //计算
        System.out.println("存款利息："+accrual);
    }
}
