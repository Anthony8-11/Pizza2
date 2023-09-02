package Pizza.Base.Especialidades;

import Pizza.Base.Pizza;
import Pizza.Base.Topping;
public class Italiana extends Pizza{

    private String salsa;

    public  Italiana(String name, double price, String salsa, Topping... toppings){
        super(name,

                toppings);
        this.salsa=salsa;

    }


    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

}
