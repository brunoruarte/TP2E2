package tp2e2;

public class Persona {
    
    private String Nombre;
    private String Apellido;
    private Integer edad;
    private Reloj reloj;

    public Persona(String Nombre, String Apellido, Integer edad, Reloj reloj) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.reloj = reloj;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Reloj getReloj() {
        return reloj;
    }

    public void setReloj(Reloj reloj) {
        this.reloj = reloj;
    }
    
    
    
}
