package tp2e2;

import java.util.Scanner;
import java.time.LocalTime;

public class Reloj {
    private final LocalTime ahora = LocalTime.now(); 
    private Integer horas = ahora.getHour();
    private Integer minutos = ahora.getMinute();
    private String dia;
    private final String marca;
    private final String modelo;
    
    public Reloj(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }   
    Scanner leer = new Scanner(System.in);    

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMarca() {
        return marca;
    }
  

    public String getModelo() {
        return modelo;
    }
  
    public void verHora(){
        System.out.print("La hora actual es: " + horas + ":" + minutos );
        System.out.println("");
    }
    
    public void cambiarHora(){
        System.out.println("Si apreta el botón, la hora se incrementará en 1 unidad.");       
        System.out.print("La hora actual es: " + horas + ":" + minutos);
        System.out.println(". ¿Cuantas veces oprimirá el botón?");
        int cantidad = leer.nextInt();
        horas = horas + cantidad;
        if (horas < 23) {
            System.out.print("La hora actual es: " + horas + ":" + minutos);
        } else {
            horas = horas%24;
            System.out.print("La hora actual es: " + horas + ":" + minutos);
        }
        System.out.println("");         
    }
    
    public void cambiarminutos(){
        System.out.println("Si apreta el botón, los minutos se incrementarán en 1 unidad.");       
        System.out.print("La hora actual es: " + horas + ":" + minutos);
        System.out.println(". ¿Cuantas veces oprimirá el botón?");
        int cantidad = leer.nextInt();
        minutos = minutos + cantidad;
        if (minutos < 60) {
            System.out.print("La hora actual es: " + horas + ":" + minutos);
        } else {
            minutos = minutos%60;
            System.out.print("La hora actual es: " + horas + ":" + minutos);
        }
        System.out.println("");         
    }
    
    public String verFecha(){
        System.out.print("La fecha es");
        return getDia();
    }
    
    public void consultarModelo(){
        System.out.print("El reloj es marca " + getMarca() + " y el modelo es " + getModelo());
        System.out.println("");
    }    
}
