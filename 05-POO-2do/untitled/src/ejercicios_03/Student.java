package ejercicios_03;

/*
Clase Estudiante: Con propiedades como id, name, y email.
 */

public class Student {
    //Attributes
    private int id;
    private String name; 
    private String email;
    
    //Contructors
    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    //Methods
    
    //Setters and Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //ToString
    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
