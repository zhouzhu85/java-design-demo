package com.factoryMethod.demo2;

public class HorseFarm implements AnimalFarm{
    @Override
    public Animal newAnimal() {
        System.out.println("新马出生");
        return new Horse();
    }
}
