package com.factory.simple2;

public class VeggiesPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public VeggiesPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing "+name);
        dough=ingredientFactory.createDough();
        sauce=ingredientFactory.createSauce();
        cheese=ingredientFactory.createCheese();
        veggies=ingredientFactory.createVeggies();
    }
}
