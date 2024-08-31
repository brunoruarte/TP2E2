package tp2e2;

import java.util.Scanner;

public class TP2E2 {


    public static void main(String[] args) {
        
        Reloj reloj1 = new Reloj("Casio", "CA-53");
        RelojFit reloj2 = new RelojFit("Samsung", "Fit3");
        Persona persona1 = new Persona("Juan", "Perez", reloj1);
        Scanner leer = new Scanner(System.in);
        
        //Test con reloj1 clase Reloj
        persona1.presentarse();
        persona1.verHora();
        persona1.cambiarHora();
        persona1.verFecha();
        persona1.cabiarFecha();
        System.out.println("Ingrese una cantidad de metros para que la persona camine: ");
        int distancia = leer.nextInt();        
        persona1.caminar(distancia);
        System.out.println(persona1.getNombre() + " caminó " + distancia + " metros.");
        persona1.verPasos();  
        persona1.verFrecuencia();
        System.out.println("-----");

        //Test con reloj2 clase RelojFit       
        persona1.setReloj(reloj2);
        persona1.presentarse();
        System.out.println("Ingrese una cantidad de metros para que la persona camine: ");
        distancia = leer.nextInt();        
        persona1.caminar(distancia);
        System.out.println(persona1.getNombre() + " caminó " + distancia + " metros.");
        persona1.verPasos();
        persona1.verFrecuencia();
        System.out.println("-----");
    }    
}