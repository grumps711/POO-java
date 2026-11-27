
package refugis;

public class ServeiPublic extends RefugiClimatic {

    private String fontDades;

    public ServeiPublic(String identificador, String titol, String municipi, String tipologiaRefugi, String adreca, String aiguaPotable, String fontDades) {

        super(identificador, titol, municipi,tipologiaRefugi, adreca, aiguaPotable);

        this.fontDades = fontDades;
    }

    public String getFontDades() {
        return fontDades;
    }

    public void setFontDades(String fontDades) {
        this.fontDades = fontDades;
    }
}
