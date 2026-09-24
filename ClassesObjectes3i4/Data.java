

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

    public Data(int dia, int mes, int any){
        this.dia = dia;
        this.mes = mes;
        this.any = any;
    }

    //getters i setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia>=1 && dia<=31){
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes>=1 && mes<=12){
            this.mes = mes;
        }
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }


    //metode que compara dates amb Data com a parametre

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



    //mateix mètode però sobrecarregat amb dia mes i any com a paràmetres

    public int anteriorPosteriorIgual(int dia, int mes, int any){

        Data d = new Data(dia,mes,any);
        return this.anteriorPosteriorIgual(d);
    }


    public String toString() {
        return dia + "/" + mes + "/" + any;
    }


}

