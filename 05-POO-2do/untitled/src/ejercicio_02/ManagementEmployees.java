package ejercicio_02;

import javax.swing.*;
import java.util.ArrayList;

/*
Clase GestionEmpleados: Utiliza un ArrayList para gestionar objetos del tipo Empleado.
Implementa métodos para añadir, eliminar y mostrar empleados. Utiliza polimorfismo para
manejar diferentes tipos de empleados.
 */
public class ManagementEmployees {
    //Atributes
    ArrayList<Employ> employees = new ArrayList<>();

    //Methods
    public void addEmploy(){
        this.employees.add(requestEmployData());
    }
    public void deleteEmploy(){
        String msj = listEmploys(this.employees);

        int idEmploy = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione el empleado a eliminar: " + msj));

        employees.remove(idEmploy-1);
    }

    public void listAllEmploys(){
        String msj =listEmploys(this.employees);
        JOptionPane.showMessageDialog(null, "List of employes" + msj);
    }
    private String listEmploys(ArrayList<Employ> listEmployees){
        String msj = "";

        for (Employ employ : listEmployees){
            msj += (employ.toString());
        }

        return msj;
    }

    private Employ requestEmployData(){
        Employ newEmploy;

        int idEmploy = employees.size()+1;
        String name = JOptionPane.showInputDialog(null, "Write the name of the employ");
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Write the age of the employ"));
        double salary = Double.parseDouble(JOptionPane.showInputDialog(null, "Write salary the of the employ"));
        int isPermanent = JOptionPane.showConfirmDialog(null, "The employ is permanent?");
        
        if (isPermanent == 1){
            newEmploy = new PermanentEmploy(name,age,idEmploy,salary);

        }else {
            newEmploy = new TemporalEmploy(name,age,idEmploy,salary);
        }

        return newEmploy;
    }
}
