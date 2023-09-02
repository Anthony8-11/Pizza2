package org.example;
import Pizza.Base.Especialidades.Italiana;
import Pizza.Base.Pizza;
import Pizza.Base.Topping;
import Pizza.Base.Especialidades.Italiana;
public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("Pizza Margarita");
        pizza.addTopping(new Topping("Tomato",10));
        pizza.addTopping(new Topping("Mozzarella",20));
        pizza.addTopping(new Topping("Brocoli",10));
        pizza.prepare();
        System.out.println("PRecio Toltal: "+pizza.getPizzaPrice());


/*
        //Quitar mozzarela
        pizza.removeTopping(1);

        //Agregar Mozzarella de nuevo
        pizza.addTopping(new Topping("Mozzarella",20));

        pizza.prepare();

        Italiana italiana = new Italiana("Italiana", 20, "Especial");
        italiana.addTopping(new Topping("Tomato",20));
        italiana.prepare();*/




    }
}