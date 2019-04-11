package com.factoryMethod.demo2;

public class CattleFarm implements AnimalFarm{
    @Override
    public Animal newAnimal() {
        System.out.println("新牛出生");
        return new Cattle();
    }
}
