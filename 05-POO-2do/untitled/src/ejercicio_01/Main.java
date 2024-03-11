package ejercicio_01;

/*
Ejercicio 1: Sistema de Control de Inventarios
Objetivo: Crear un sistema para manejar el inventario de un almacén, aplicando
encapsulamiento y herencia, y utilizando ArrayList para almacenar los productos.

Principios de POO aplicados: Encapsulamiento, Herencia.

Requisitos:

Clase Producto: Base para todos los productos, con propiedades como id, nombre, y
precio. Implementa getters y setters para aplicar el encapsulamiento.
Clase ProductoEspecifico: Hereda de Producto y añade propiedades específicas, como
categoria o marca.
Clase Inventario: Utiliza un ArrayList de objetos Producto para gestionar el inventario.
Implementa métodos para añadir, eliminar, y listar productos, además de buscar productos
por nombre o categoría.
 */

import java.util.Scanner;

public class Main {
    private Scanner objScanner = new Scanner(System.in);


    public static void main(String[] args) {
        Main main = new Main();
        Inventory inventory = new Inventory();

        int opc = 0;

        do{
            opc = main.mostrarMenu();

            switch (opc){
                case 1:
                    inventory.addProduct();
                    break;

                case 2:
                    inventory.deleteProducts();
                    break;

                case 3:
                    inventory.listAllProducts();
                    break;

                case 4:
                    inventory.findProductName();
                    break;
                case 5:
                    inventory.findProductCategory();
                    break;
            }
        }while (opc != 6);
    }

    public int mostrarMenu(){
        int opc = 0;

        System.out.println("Seleccione una opcion: \n" +
                "1.Añadir producto\n" +
                "2.Eliminar producto\n" +
                "3.Listar productos\n" +
                "4.Buscar producto por nombre\n" +
                "5.Buscar producto por categoria\n" +
                "6.Salir");

        try {
            opc = objScanner.nextInt();
            return opc;

        }catch (Exception e){
            System.err.println("Opcion invalida");
            objScanner.nextLine();
            return  -1;
        }
    }
}
