
package refugis;

import java.time.LocalDate;

public class ServeiPrivat extends RefugiClimatic {

    private double preuPerDia;
    private LocalDate dataInici;
    private LocalDate dataFi;

    public ServeiPrivat(String identificador, String titol,
            String municipi, String tipologiaRefugi,
            String adreca, String aiguaPotable,
            double preuPerDia, LocalDate dataInici, LocalDate dataFi) {

        super(identificador, titol, municipi,
                tipologiaRefugi, adreca, aiguaPotable);

        this.preuPerDia = preuPerDia;
        this.dataInici = dataInici;
        this.dataFi = dataFi;
    }

    public double getPreuPerDia() {
        return preuPerDia;
    }

    public void setPreuPerDia(double preuPerDia) {
        this.preuPerDia = preuPerDia;
    }

    public LocalDate getDataInici() {
        return dataInici;
    }

    public void setDataInici(LocalDate dataInici) {
        this.dataInici = dataInici;
    }

    public LocalDate getDataFi() {
        return dataFi;
    }

    public void setDataFi(LocalDate dataFi) {
        this.dataFi = dataFi;
    }
}
