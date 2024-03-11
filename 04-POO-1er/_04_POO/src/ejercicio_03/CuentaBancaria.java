package ejercicio_03;

/*
3. Cuenta Bancaria: Implementa una clase CuentaBancaria con los atributos
titular y balance. Añade métodos para depositar dinero, retirar dinero (no
permitas que el balance se vuelva negativo) y mostrar el balance actual.
 */
public class CuentaBancaria {
    //Atributos
    private double balance;
    private String titular;
    //Constructores
    public CuentaBancaria(){

    }
    
    public CuentaBancaria(double balance, String titular) {
        this.balance = balance;
        this.titular = titular;
    }
    //Metodos
    public void depositarDinero(double dineroIngresado){
        this.balance += dineroIngresado;
    }
    public void retirarDinero(double retirarDinero){

        if(retirarDinero > this.balance){
            System.err.println("No cuenta con esa cantidad de dinero");
            return;
        }
        this.balance -= retirarDinero;
    }
    public void mostrarBalance(){
        System.out.println("Balance actual: " + this.balance);
    }

    //Setter and Getters
    public double getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
