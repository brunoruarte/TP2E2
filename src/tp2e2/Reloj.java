package tp2e2;

public class Reloj {
    private Integer hora;
    private String dia;
    private String marca;
    private Long numserie;

    public Reloj(String marca, Long numserie) {
        this.marca = marca;
        this.numserie = numserie;
    }

    
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

    public String getModelo() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.marca = modelo;
    }

    public Long getNumserie() {
        return numserie;
    }

    public void setNumserie(Long numserie) {
        this.numserie = numserie;
    }
    
    
    
}
