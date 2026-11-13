
import com.google.gson.annotations.SerializedName;

public class RefugiClimatic {

    @SerializedName("nom")
    private String titol;

    private String municipi;

    @SerializedName("tipologia")
    private String tipologiaRefugi;

    private String adreca;

    @SerializedName("aigua")
    private String aiguaPotable;

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
            "\n   Aigua potable: " + aiguaPotable + "\n";
    }

}
