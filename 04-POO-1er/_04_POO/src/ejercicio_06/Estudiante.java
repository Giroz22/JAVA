package ejercicio_06;

import java.util.ArrayList;

/*
6. Sistema de Calificaciones de Estudiantes: Diseña una clase Estudiante con
atributos para el nombre, una lista de calificaciones y un método para
calcular el promedio de dichas calificaciones. Añade un método para añadir
nuevas calificaciones a la lista
 */
public class Estudiante {
    //Atributos
    private String nombre;
    private ArrayList<Double> calificaciones  = new ArrayList<>();
    //Constructores
    public Estudiante(String nombre, ArrayList<Double> calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    //Metodos
    public double calcularPromedio(){
        double promedio = 0;
        double sumatoria = 0;

        for (double calificacion : this.calificaciones){
            sumatoria += calificacion;
        }

        promedio = sumatoria / this.calificaciones.size();
        return promedio;
    }
    public void annadirCalificaciones(double calificacion){
        this.calificaciones.add(calificacion);
    }
    //Setter and Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Double> calificaciones) {
        this.calificaciones = calificaciones;
    }
}
