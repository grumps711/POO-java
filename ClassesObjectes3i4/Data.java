package ClassesObjectes3i4;

public class Data {
    
    //atributs
    private int dia;
    private int mes;
    private int any;


    //constructor sense paràmetres
    public Data(){
    }

    //constructor de copia
    public Data(Data d){
        this.dia = d.dia;
        this.mes = d.mes;
        this.any = d.any;
    }

    

    //getters i setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }


    //mètodes

    public int anteriorPosteriorIgual(Data d) {

        if (this.any < d.any) {
            return -1;
        }

        if (this.any > d.any) {
            return 1;
        }

        if (this.mes < d.mes) {
            return -1;
        }

        if (this.mes > d.mes) {
            return 1;
        }

        if (this.dia < d.dia) {
            return -1;
        }

        if (this.dia > d.dia) {
            return 1;
        }

        return 0;
    }



    //mateix mètode però sobrecarregat

    public int anteriorPosteriorIgual(int dia, int mes, int any){

        if (this.any < any) {
            return -1;
        }

        if (this.any > any) {
            return 1;
        }

        if (this.mes < mes) {
            return -1;
        }

        if (this.mes > mes) {
            return 1;
        }

        if (this.dia < dia) {
            return -1;
        }

        if (this.dia > dia) {
            return 1;
        }

        return 0;
    }


    public String toString() {
        return dia + "/" + mes + "/" + any;
    }


}

