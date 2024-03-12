package ejercicios_03;

import javax.swing.*;
import java.util.ArrayList;

/*
Clase Curso: Con propiedades como codigo, nombre, y listaEstudiantes, donde
listaEstudiantes es un ArrayList de objetos Estudiante.
 */
public class Course {

    //Attributes
    private String code;
    private String name;
    private ArrayList<Student> listEstudents  = new ArrayList<>();

    public static int idStudent = 0;

    //Contructors
    public Course(){

    }
    public Course(String code, String name, ArrayList<Student> listEstudents) {
        this.code = code;
        this.name = name;
        this.listEstudents = listEstudents;
    }

    //Methods
    public void registerStudentCourse(){
        String name = JOptionPane.showInputDialog(null, "Enter the name of the student: ");
        String email = JOptionPane.showInputDialog(null, "Enter the email of the student: ");

        Student objStudent = new Student(Course.idStudent,name,email);
        Course.idStudent++;

        if (this.listEstudents.add(objStudent)){
            JOptionPane.showMessageDialog(null, "El estudiante fue agregado correctamente!!");
        }else {
            JOptionPane.showMessageDialog(null, "El estudiante no fue agregado");
        }
    }

    public void listAllStudents(){
        String strListStudents = this.listStudents();
        if(strListStudents == null){
            return;
        }

        JOptionPane.showMessageDialog(null, "List of student\n"+ strListStudents);
    }

    public void deleteStudent(){
        String strListStudents = this.listStudents();

        if(strListStudents == null){
            return;
        }

        int indexStudent = Integer.parseInt(JOptionPane.showInputDialog(null, "Select a student: " + strListStudents)) ;
        if (this.listEstudents.remove(indexStudent-1) != null) {
            JOptionPane.showMessageDialog(null, "Student deleted with successful");
        }else {
            JOptionPane.showMessageDialog(null, "Error to deleted the student");
        }
    }

    private String listStudents(){

        if(this.listEstudents.isEmpty()){
            JOptionPane.showMessageDialog(null,"Not found students");
            return null;
        }

        String strListStudents = "";
        for (int i = 0; i < this.listEstudents.size(); i++) {
            Student objStudent = this.listEstudents.get(i);
            strListStudents += (i+1)  + "."  + objStudent.toString();
        }

        return strListStudents;
    }

    //Setters and Getters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getListEstudents() {
        return listEstudents;
    }

    public void setListEstudents(ArrayList<Student> listEstudents) {
        this.listEstudents = listEstudents;
    }

    //ToString
    @Override
    public String toString() {
        return "Course{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", listEstudents=" + listEstudents +
                '}';
    }
}
