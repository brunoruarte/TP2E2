package tp2e2;

import java.util.Random;

public class RelojFit extends Reloj{
    
    private int pasos= 0;
    private int frecuencia;

    public RelojFit(String marca, String modelo) {
        super(marca, modelo);
    }     
    public int cuentaPasos(int x){ // AGREGO METODO         ;
        pasos = (int) (x*1.3);//1.3 pasos por metro avanzado
        return pasos;
       
    }
    public void frecuenciaAleatoria(){ // AGREGO METODO
        Random random = new Random();
        frecuencia= random.nextInt(140 - 60 + 1) + 60; 
        System.out.println("Frecuencia por minuto:  "+ frecuencia);   
    }
}
