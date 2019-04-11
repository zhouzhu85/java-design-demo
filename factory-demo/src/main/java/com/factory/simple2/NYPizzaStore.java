package com.factory.simple2;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza=null;
        PizzaIngredientFactory ingredientFactory=new NYPizzaUbgredientFactory();
        if (item.equals("cheese")){
            pizza=new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }else if (item.equals("veggie")){
            pizza=new VeggiesPizza(ingredientFactory);
            pizza.setName("New York Style veggie Pizza");
        }else if (item.equals("clam")){
            pizza=new ClamPizza(ingredientFactory);
            pizza.setName("New York Style clam Pizza");
        }else if (item.equals("pepperoni")){
            pizza=new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style pepperoni Pizza");
        }
        return pizza;
    }
}
