package tp2e2;

import java.util.Random;

public class RelojFit extends Reloj{
    
    private Integer pasos= 0;
    private Boolean frecuencia = false;

    public RelojFit(String marca, String modelo) {
        super(marca, modelo);
    }     
    public void cuentaPasos(int x,int y){ // AGREGO METODO
       int r=x+y;
        System.out.println("Pasos realizados:  "+ r);
       
    }
    public void frecuenciaAleatoria(){ // AGREGO METODO
    Random random = new Random();
    int latidos= random.nextInt(140 - 60 + 1) + 60; 
        System.out.println("Frecuencia por minuto:  "+ latidos);
    
    }
}
