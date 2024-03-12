package ejercicios_03;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/*
Clase GestionCursos: Encargada de administrar los cursos, incluyendo métodos para
agregar cursos, inscribir estudiantes en cursos y listar estudiantes inscritos en un curso
específico.
 */
public class ManagerCourses {
    //Constructor


    //Attributes
    ArrayList<Course> listCourses = new ArrayList<>();

    //Methods
    public void addCourse(){
        String code = "CS" + Math.random();
        String name = JOptionPane.showInputDialog(null,"Enter the name of the course");
        ArrayList<Student> listEstudents = new ArrayList<>();

        Course objCourse = new Course(code,name,listEstudents);
        listCourses.add(objCourse);
    }

    public void listAllCourses(){
        JOptionPane.showMessageDialog(null, listCourses());
    }

    public Course SelectCourse(){
        int idCourse = Integer.parseInt(JOptionPane.showInputDialog(null, "Select a course: \n" + listCourses()));
        return listCourses.get(idCourse-1);
    }

    private String listCourses(){
        String msj = "";

        for (int i = 0; i < this.listCourses.size(); i++) {
            Course objCourse = this.listCourses.get(i);
            msj += (i+1) + "." + objCourse.toString();
        }

        return msj;
    }
}
