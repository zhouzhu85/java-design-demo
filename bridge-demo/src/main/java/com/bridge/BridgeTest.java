package com.bridge;

public class BridgeTest {
    public static void main(String[] args){
        Implementor imple=new ConcretelmplementorA();
        Abstraction abs=new RefinedAbstraction(imple);
        abs.Operation();
    }
}
