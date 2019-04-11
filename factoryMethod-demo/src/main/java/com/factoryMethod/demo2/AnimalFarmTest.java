package com.factoryMethod.demo2;

public class AnimalFarmTest {
    public static void main(String[] args){
        Animal animal;
        AnimalFarm animalFarm;
        animalFarm=(AnimalFarm) ReadXML2.getObject();
        animal=animalFarm.newAnimal();
        animal.show();
    }
}
