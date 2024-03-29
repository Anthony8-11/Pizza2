package Pizza.Base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {

    //Eliminar la propiedad price de la pizza y
    //crear un metodo que se llame getPizzaPrice
    //haga la sumatoria de los ingredientes y nos de el precio

    private String name;
    //private double price;
    private List<Topping> toppings = new ArrayList<>();

    //    los tres puntos (...) en el parámetro Topping... toppings del constructor de la clase Pizza tienen
//    un significado especial en Java.
//    Estos three dots se llaman "spread operator" (operador de dispersión) y permiten pasar un
//    conjunto de argumentos variádicos a un método. En este caso, el constructor de la clase Pizza
//    espera una lista de objetos Topping, pero en lugar de especificar explícitamente la lista de
//    objetos, se utiliza el operador de dispersión para pasar todos los argumentos restantes como una
//    lista de objetos Topping.
    public Pizza(String name, Topping... toppings) {
        this.name = name;

        for (Topping topping : toppings) {
            this.toppings.add(topping);
        }
    }

    public double getPizzaPrice(){
        double price = 0;
        for (Topping topping : toppings) {
            price += topping.getPrecio();
        }
//        System.out.println("El precio de la pizza es: " + price);
        return price;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public void removeTopping(int index) {
        this.toppings.remove(index);
    }

    public List<Topping> getToppings() {

        return Collections.unmodifiableList(new ArrayList<>(toppings));
    }

    public String getName() {
        return name;
    }

 /*   public double getPrice() {
        return price;
    }*/

    @Override
    public String toString() {
        return "Pizza{" + "name='" + name + '\'' + ", toppings=" + toppings + '}';
    }

    public void prepare() {
        System.out.println("\nPreparing..... " + name);
        System.out.println("Adding toppings:");
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getNombre());
            //put 1 second delay
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("The Pizza is ready!");
    }
}
