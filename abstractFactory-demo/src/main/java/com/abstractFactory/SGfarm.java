package com.abstractFactory;

public class SGfarm implements Farm{
    @Override
    public Animal newAnimal() {
        System.out.println("新牛出生！");
        return new A_Cattle();
    }

    @Override
    public Plant newPlant() {
        System.out.println("蔬菜长成！");
        return new P_Vegetables();
    }
}
