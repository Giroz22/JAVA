package ejercicio_01;

import java.util.ArrayList;
import java.util.Scanner;

/*
Clase Inventario: Utiliza un ArrayList de objetos Producto para gestionar el inventario.
Implementa métodos para añadir, eliminar, y listar productos, además de buscar productos
por nombre o categoría.
 */
public class Inventory {
    //Atributes
    private ArrayList<SpecificProduct> products = new ArrayList<>();
    private Scanner objScanner = new Scanner(System.in);

    //Constructors
    public Inventory(){
        products.add(new SpecificProduct(1,"Lapiz",2000,"papeleria","Prisma"));
        products.add(new SpecificProduct(2,"Panela",2000,"Comida","panela"));
    }

    public Inventory(ArrayList<SpecificProduct> products) {
        this.products = products;
    }

    //Methods
    public void addProduct(){
        SpecificProduct newProduct = this.getProduct();

        if (products.add(newProduct)){
            System.out.println("Producto agregado correctamente!!");
            System.out.println("Enter para continuar...");
            objScanner.nextLine();
        }
    }
    public void deleteProducts(){
        int idProduct =  0;

        System.out.println("Seleccione el producto a eliminar: ");
        listProducts(this.products);

        try{
            idProduct = objScanner.nextInt();
        }catch (Exception e){
            System.err.println("Error al pedir datos");
            System.out.println("Enter para continuar...");
            objScanner.nextLine();
        }

        System.out.println(this.products.remove(idProduct-1));
        System.out.println("Producto eliminado correctamente!!");
        System.out.println("Enter para continuar...");
        objScanner.nextLine();
    }

    public void listAllProducts(){
        listProducts(this.products);
        System.out.println("Enter para continuar...");
        objScanner.nextLine();
    }

    private void listProducts(ArrayList<SpecificProduct> listProducts){
        for (int i = 0; i < listProducts.size(); i++) {
            System.out.println((i+1) + "." + "Name: " + listProducts.get(i).getName() +  " Categoria: " + listProducts.get(i).getcategory());
        }
    }

    public void findProductName(){
        System.out.println("Ingrese el nombre a buscar:");
        String strName = objScanner.next();

        ArrayList<SpecificProduct> listProductsName = new ArrayList<>();

        for( SpecificProduct product : this.products){
            System.out.println(product.getName().toLowerCase().contains(strName.toLowerCase()));
            boolean isEqual = product.getName().toLowerCase().contains(strName.toLowerCase());
            if (isEqual){
                listProductsName.add(product);
            }
        }

        if(listProductsName.isEmpty()){
            System.out.println("No se encontraron productos con ese nombre");
            return;
        }

        //List all products with name specify
        System.out.println("Productos filtrados por categoria");
        listProducts(listProductsName);
        System.out.println("Enter para continuar...");
        objScanner.nextLine();
    }

    public void findProductCategory(){
        System.out.println("Ingrese la categoria a buscar:");
        String strCategory = objScanner.next();

        ArrayList<SpecificProduct> listProductsCategory = new ArrayList<>();

        for( SpecificProduct product : this.products){
            if (product.getcategory().toLowerCase().contains(strCategory.toLowerCase())){
                listProductsCategory.add(product);
            }
        }

        if(listProductsCategory.isEmpty()){
            System.out.println("No se encontraron productos con este ID");
            return;
        }

        //List all products with name specify
        System.out.println("Productos filtrados por categoria");
        listProducts(listProductsCategory);
        System.out.println("Enter para continuar...");
        objScanner.nextLine();
    }

    private SpecificProduct getProduct(){
        try{
            int id = products.size() + 1;

            System.out.println("Ingrese el nombre del producto:");
            String name =  objScanner.next();

            System.out.println("Ingrese el precio: ");
            double price = objScanner.nextDouble();

            System.out.println("Ingrese la categoria");
            String category = objScanner.next();

            System.out.println("Ingrese la marca");
            String brand = objScanner.next();

            return new SpecificProduct(id,name,price,category,brand);
        }catch (Exception e){
            System.err.println("Datos invalidos");
            System.out.println("Enter para continuar...");
            objScanner.nextLine();
            return null;
        }
    }

}
