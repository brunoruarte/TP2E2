package tp2e2;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;

public class Reloj {
    private final LocalTime ahora = LocalTime.now(); 
    private final LocalDate hoy = LocalDate.now(); 
    private Integer horas = ahora.getHour();
    private Integer minutos = ahora.getMinute();
    private Integer dia = hoy.getDayOfMonth();
    private Integer mes = hoy.getMonthValue();
    private Integer año = hoy.getYear();
    private final String marca;
    private final String modelo;
    
    public Reloj(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }   
    Scanner leer = new Scanner(System.in);    

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
        System.out.println("Cada vez que apreta el botón, la hora se incrementará en 1 unidad.");       
        verHora();
        System.out.println("¿Cuantas veces oprimirá el botón?");
        int cantidad = leer.nextInt();
        horas = horas + cantidad;
        if (horas > 24) {
            horas = horas%24;
        } 
        verHora();
    }
    
    public void cambiarMinutos(){
        System.out.println("Cada vez que apreta el botón, los minutos se incrementarán en 1 unidad.");       
        verHora();
        System.out.println("¿Cuantas veces oprimirá el botón?");
        int cantidad = leer.nextInt();
        minutos = minutos + cantidad;
        if (minutos > 60) {
            minutos = minutos%60;
        } 
        verHora();
    }
    
    public void verFecha(){
        System.out.println("La fecha actual es: " + dia + "/" + mes + "/" + año);
    }
    
    public void cambiarFecha(){
        verFecha();
        int min = 1900;
        int max = 2100;
        
        System.out.println("-----");
        System.out.println("El año actual es:" + año);
        System.out.println("Oprima para incrementa el año.");
        System.out.println("Año minimo: " + min);
        System.out.println("Año máximo: " + max);   
        System.out.println("¿Cuantas veces oprimirá el botón?");

        int cantidad = leer.nextInt();
        año = año + cantidad;
        if (año>max) {
            año = año-200;                       
        }
        System.out.println("El nuevo año es:" + año);
        System.out.println("-----");
        
        min = 1;
        max = 12;
        System.out.println("-----");
        System.out.println("El mes actual es:" + mes);  
        System.out.println("Oprima para incrementa el mes.");
        System.out.println("Mes minimo: " + min);
        System.out.println("Mes máximo: " + max);   
        System.out.println("¿Cuantas veces oprimirá el botón?");

        cantidad = leer.nextInt();
        mes = mes + cantidad;
        if (mes>max) {
            mes = mes%max;                       
        }
        System.out.println("El nuevo mes es:" + mes);
        System.out.println("-----");
        
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> max = 31;
            case 2 -> max = 28;
            case 4, 6, 9, 11 -> max = 30;
        }            
        System.out.println("-----");
        System.out.println("El día actual es:" + dia);        
        System.out.println("Oprima para incrementa el día.");
        System.out.println("Dia máximo para el mes: " + max);  
        System.out.println("¿Cuantas veces oprimirá el botón?");

        cantidad = leer.nextInt();
        dia = dia + cantidad;
        if (dia>max) {
            dia = dia%max;                       
        }
        System.out.println("El nuevo dia es:" + dia);
        System.out.println("-----");
        System.out.println("-----");
        verFecha();
        System.out.println("-----");
        System.out.println("-----");
        }     
        
    public String consultarModelo(){
        return " un reloj marca " + getMarca() + " modelo " + getModelo();        
    }     
}