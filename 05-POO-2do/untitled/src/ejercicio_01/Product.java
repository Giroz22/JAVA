package ejercicio_01;

/*
Clase Producto: Base para todos los productos, con propiedades como id, nombre, y
precio. Implementa getters y setters para aplicar el encapsulamiento.
 */
public abstract class Product {
    //Atributes
    private int id;
    private String name;
    private double price;

    //Constructors
    public Product(){
        this.id = 0;
        this.name = "name";
        this.price = 0;
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //Methods


    //Setters and Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
