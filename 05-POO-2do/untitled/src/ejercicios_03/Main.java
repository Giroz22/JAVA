package ejercicios_03;

import javax.swing.*;

/*
Ejercicio 3: Sistema de Gestión de Cursos
Objetivo: Implementar un sistema para gestionar cursos y estudiantes, aplicando
abstracción y polimorfismo, y utilizando ArrayList para manejar las inscripciones.
Principios de POO aplicados: Abstracción, Polimorfismo.
Requisitos:

Clase Curso: Con propiedades como codigo, nombre, y listaEstudiantes, donde
listaEstudiantes es un ArrayList de objetos Estudiante.
Clase Estudiante: Con propiedades como id, nombre, y email.
Clase GestionCursos: Encargada de administrar los cursos, incluyendo métodos para
agregar cursos, inscribir estudiantes en cursos y listar estudiantes inscritos en un curso
específico.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        ManagerCourses managerCourses =  new ManagerCourses();
       int opc = 0;

        do{
            opc = main.showMenu();

            switch (opc){
                case 1:
                    managerCourses.addCourse();
                    break;
                case 2:
                    Course objCourse1 = managerCourses.SelectCourse();
                    objCourse1.registerStudentCourse();
                    break;
                case 3:
                    Course ObjCourse2 = managerCourses.SelectCourse();
                    ObjCourse2.listAllStudents();
                    break;
                case 4:
                    Course ObjCourse3 = managerCourses.SelectCourse();
                    ObjCourse3.deleteStudent();
                    break;
            }
        }while (opc != 5);
    }

    public int showMenu(){
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a option: \n" +
                "1. Add new course\n" +
                "2. Register student\n" +
                "3. List students\n" +
                "4. Delete Student\n" +
                "5. Exit"));
    }
}
