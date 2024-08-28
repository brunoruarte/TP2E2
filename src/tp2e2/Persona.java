package tp2e2;

public class Persona {
    
    private String Nombre;
    private String Apellido;
    private Integer edad;
    private Reloj reloj;
    private Integer distancia = 0;

    public Persona(String Nombre, String Apellido, Integer edad, Reloj reloj) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.reloj = reloj;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }
  
    public Integer getEdad() {
        return edad;
    }    

    public Reloj getReloj() {
        return reloj;
    }

    public void setReloj(Reloj reloj) {
        this.reloj = reloj;
    }

   
    public Integer getDistancia() {
        return distancia;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }
    
    public int caminar(int metros){
        distancia = metros;
        return distancia;
    }    
    
    public void presentarse(){
        System.out.println("Hola a todos, soy " + getNombre() + " " + getApellido() + ", tengo " + getEdad() + " y estoy usando un reloj " + getReloj());
    }    
}
