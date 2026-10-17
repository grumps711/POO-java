
import java.time.LocalDateTime;

public class Medicio {

    private final double valor;
    private final LocalDateTime dataMedicio;

    public Medicio(double valor) {
        this.valor = valor;
        this.dataMedicio = LocalDateTime.now();
    }

    public double getValor() {
        return valor;
    }

    public LocalDateTime getDataMedicio() {
        return dataMedicio;
    }

    @Override
    public String toString() {
        return "Medicio{valor=" + valor + ", dataMedicio=" + dataMedicio + "}";
    }
}
