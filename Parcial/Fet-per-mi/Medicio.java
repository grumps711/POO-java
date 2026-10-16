import java.time.LocalDateTime;

public class Medicio {
    
    //atributs

    private double valor;
    private LocalDateTime dataMedicio;


    //constructor

    public Medicio(double valor){
        this.valor = valor;
        this.dataMedicio = LocalDateTime.now();
    }


    //getters i setters

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataMedicio() {
        return dataMedicio;
    }

    public void setDataMedicio(LocalDateTime dataMedicio) {
        this.dataMedicio = dataMedicio;
    }


}
