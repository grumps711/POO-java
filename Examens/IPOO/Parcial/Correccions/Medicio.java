package ParcialMillorat.Correccions;
import java.time.LocalDateTime;

public class Medicio {//**************************************** toString
    
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

    public void setValor(double valor) {//**************************************** no
        this.valor = valor;
    }

    public LocalDateTime getDataMedicio() {
        return dataMedicio;
    }

    public void setDataMedicio(LocalDateTime dataMedicio) {//**************************************** no
        this.dataMedicio = dataMedicio;
    }


}
