package Pizza.Interface;

public class PizzaBase implements iPreparable {

    private String nombre;
    private double precio;

    public PizzaBase(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void preparare(){
        System.out.println("Preparando pizza base");
    }

}
