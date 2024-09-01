package tp2e2;

public class Persona {
    
    private final String nombre;
    private final String apellido;
    private Reloj reloj;
    private Integer distancia = 0;

    public Persona(String nombre, String apellido, Reloj reloj) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.reloj = reloj;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
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
         
    public void verHora(){        
        reloj.verHora();
    }
    
    public void verFecha(){
        reloj.verFecha();
    }
    
    public void cambiarHora(){        
        reloj.cambiarHora();
    }
    
    public void cabiarFecha(){
        reloj.cambiarFecha();
    }
    
    public int caminar(int metros){
        distancia = metros;
        return distancia;
    }
    
    public void verPasos(){//puede consultar con cualquier reloj
        if (reloj instanceof RelojFit) {//si el reloj que uso es fit...
            RelojFit relojfit = (RelojFit) reloj;//casteo a RelojFit...
            System.out.println("Usted dió " + relojfit.cuentaPasos(distancia) + " pasos");//y muestro los pasos            
        } else {
            System.out.println("EL reloj actual no soporta la funcion de ver la cantidad de pasos");//si no es fit, no puedo mostrar pasos
        }
    }
    
    public void verFrecuencia(){
        if (reloj instanceof RelojFit) {//si el reloj que uso es fit...
            RelojFit relojfit = (RelojFit) reloj;//casteo a RelojFit...
            System.out.println("Su frecuencia cardíaca es: " + relojfit.frecuenciaAleatoria() + " PPM.");//y muestro la frecuencia            
        } else {
            System.out.println("EL reloj actual no soporta la funcion de ver la frecuencia cardíaca.");//si no es fit, no puedo mostrar pasos
        }
    }
    
    public void comer() {
        System.out.println("Me estoy comiendo un sanguchito ");//ñam ñam ñam
    } // AGREGO METODO
    
    public void presentarse(){
        System.out.println("Hola a todos, soy " + getNombre() + " " + getApellido() + " y estoy usando" + reloj.consultarModelo());
    }    
}