package ejercicio_02;
/*
Con propiedades básicas como nombre y edad.
 */
public abstract class Person {
    //Atributes
    private String name;
    private int age;

    //Constructors
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Methods

    //Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //ToString

    @Override
    public String toString() {
        return  "\nname= " + name +
                "\nage= " + age;
    }
}
