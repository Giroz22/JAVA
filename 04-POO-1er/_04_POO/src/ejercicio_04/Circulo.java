package ejercicio_04;

public class Circulo  extends Figura{
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio,2);
    }
}
