package ejercicio_05;

/*
5. Control de Stock: Crea un sistema para gestionar el stock de productos en
un almacén. Deberás tener una clase Producto con atributos como id,
descripción, cantidad en stock. Añade métodos para agregar o quitar
productos del stock, y para verificar la cantidad actual de un producto.
 */
public class Producto {
    //Atributos
    private int id;
    private String descripcion;
    private int cantidadStock;

    //Constructores
    public Producto(int id, String descripcion, int cantidadStock) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidadStock = cantidadStock;
    }
    //Metodos
    public void agregarProducto(int cantidad){
        this.cantidadStock += cantidad;
    }
    public void quitarProducto(int cantidad){
        this.cantidadStock -= cantidad;
    }
    public void verCantidadActualProducto(){
        System.out.println(this.cantidadStock);
    }

    //Setter and Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
}
