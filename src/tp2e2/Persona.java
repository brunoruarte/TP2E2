package tp2e2;

public class Persona {
    
    private final String Nombre;
    private final String Apellido;
    private final Integer edad;
    private final Reloj reloj;
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
    public void comer() {
        System.out.println("Me estoy comiendo un sanguchito ");
    } // AGREGO METODO
    
    public void presentarse(){
        System.out.println("Hola a todos, soy " + getNombre() + " " + getApellido() + ", tengo " + getEdad() + " años y estoy usando" + reloj.consultarModelo());
        System.out.println("");
    }    
}
