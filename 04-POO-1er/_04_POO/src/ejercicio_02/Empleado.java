package ejercicio_02;


/*
* 2. Sistema de Gestión de Empleados: Diseña un sistema donde puedas
gestionar empleados utilizando la POO. Crea una clase Empleado con
atributos como nombre, posición, salario y id. Implementa métodos para
obtener y modificar estos atributos, además de un método para aumentar el
salario por un porcentaje dado.
* */
public class Empleado {
    //Atributos
    private String nombre;
    private String posicion;
    private double salario;
    private int id;

    //Constructores
    public Empleado() {

    }

    public Empleado(String nombre, String posicion, double salario, int id) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.salario = salario;
        this.id = id;
    }

    //Metodos
    public void aumentarSalario(float porcentajeAumentar){
        this.salario += this.salario * (porcentajeAumentar / 100);
        System.out.println(this.salario);
    }
    //Setter and Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
