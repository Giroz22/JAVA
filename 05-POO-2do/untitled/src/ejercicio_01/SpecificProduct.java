package ejercicio_01;

/*
Clase ProductoEspecifico: Hereda de Producto y añade propiedades específicas, como
categoria o marca.
 */
public class SpecificProduct extends Product{
    //Atributes
    private String category;
    private String brand;
    //Constructors
    public SpecificProduct() {
        super();
        this.category = "category";
        this.brand = "brand";
    }

    public SpecificProduct(int id, String name, double price, String category, String brand) {
        super(id, name, price);
        this.category = category;
        this.brand = brand;
    }

    //Methods


    //Setters and Getters
    public String getcategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
