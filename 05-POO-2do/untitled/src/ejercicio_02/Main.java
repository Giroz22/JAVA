package ejercicio_02;

import ejercicio_01.Inventory;

import javax.swing.*;

/*
Ejercicio 2: Sistema de Registro de Empleados
Objetivo: Desarrollar un sistema para manejar los empleados de una empresa, aplicando
encapsulamiento, herencia y polimorfismo, y utilizando ArrayList para almacenar los
empleados.
Principios de POO aplicados: Encapsulamiento, Herencia, Polimorfismo.
Requisitos:

Clase Persona: Con propiedades básicas como nombre y edad.

Clase Empleado: Hereda de Persona y añade propiedades como idEmpleado y salario. Usa
encapsulamiento adecuadamente.

Clase EmpleadoTemporal y Clase EmpleadoPermanente: Heredan de Empleado y
representan diferentes tipos de empleados.

Clase GestionEmpleados: Utiliza un ArrayList para gestionar objetos del tipo Empleado.
Implementa métodos para añadir, eliminar y mostrar empleados. Utiliza polimorfismo para
manejar diferentes tipos de empleados.
 */
public  class Main {

    public static void main(String[] args) {
        Main main = new Main();
        ManagementEmployees managementEmployees = new ManagementEmployees();

        int opc = 0;

        do{
            opc = main.mostrarMenu();

            switch (opc){
                case 1:
                    managementEmployees.addEmploy();
                    break;

                case 2:
                    managementEmployees.deleteEmploy();
                    break;

                case 3:
                    managementEmployees.listAllEmploys();
                    break;
            }
        }while (opc != 4);
    }

    public int mostrarMenu(){
        int opc = 0;

        try {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion: \n" +
                    "1.Add employ\n" +
                    "2.Delete employ\n" +
                    "3.List employ\n" +
                    "4.Salir\n"));
            return opc;

        }catch (Exception e){
            JOptionPane.showInputDialog(null,"Opcion invalida");
            return  -1;
        }
    }
}
