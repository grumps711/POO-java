package refugis;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class RefugiClimatic implements Serializable{

    // Correspondencia entre los camps del JSON i els atributs Java
    @SerializedName("nom")
    private String titol;
    private String municipi;
    @SerializedName("tipologia")
    private String tipologiaRefugi;
    private String adreca;
    @SerializedName("aigua")
    private String aiguaPotable;

    private static final long serialVersionUID = 1L;

    public RefugiClimatic(String titol, String municipi, String tipologiaRefugi, String adreca, String aiguaPotable) {

        this.titol = titol;
        this.municipi = municipi;
        this.tipologiaRefugi = tipologiaRefugi;
        this.adreca = adreca;
        this.aiguaPotable = aiguaPotable;
    }

    public String getTitol() {
        return titol;
    }

    public String getMunicipi() {
        return municipi;
    }

    public String getTipologiaRefugi() {
        return tipologiaRefugi;
    }

    public String getAdreca() {
        return adreca;
    }

    public String getAiguaPotable() {
        return aiguaPotable;
    }


    @Override
    public String toString() {
        return titol + " [" + tipologiaRefugi + "]" +
            "\n   " + municipi + " · " + adreca +
            "\n   Aigua potable: " + aiguaPotable;
    }

}
