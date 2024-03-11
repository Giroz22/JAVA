package ejercicio_02;

/*
Clase Empleado: Hereda de Persona y añade propiedades como
id y salary. Usa
encapsulamiento adecuadamente.
 */

public class Employ extends Person{
    //Atributes
    private int id;
    private double salary;

    //Constructors
    public Employ(String name, int age, int id, double salary) {
        super(name, age);
        this.id = id;
        this.salary = salary;
    }

    //Methods

    //Setters and Getters
    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public double getsalary() {
        return salary;
    }

    public void setsalary(double salary) {
        this.salary = salary;
    }

    //toString

    @Override
    public String toString() {
        return  "\nid=" + id +
                super.toString()+
                "\nsalary=" + salary;
    }
}
