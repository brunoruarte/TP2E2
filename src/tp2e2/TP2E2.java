package tp2e2;

public class TP2E2 {


    public static void main(String[] args) {
        
        Reloj reloj1 = new Reloj("Casio", "CA-53");
        Persona persona1 = new Persona("Juan", "Perez", 25, reloj1);
        
        persona1.getReloj().verHora();
        System.out.println("----------");
        persona1.getReloj().cambiarHora();
        System.out.println("----------");
        persona1.getReloj().cambiarMinutos();
        System.out.println("----------");
        
        persona1.presentarse();
        
        persona1.getReloj().consultarModelo();
        persona1.getReloj().cambiarFecha();

                
    }
    
}
