


public class Punt2d {
    
    private double x;
    private double y;


    //constructor sense paràmetres
    public Punt2d(){
        this.x = 0;
        this.y = 0;
    }

    //constructor amb coordenades com a paràmetres
    public Punt2d(double x, double y){
        this.x = x;
        this.y = y;
    }

    //constructor de copia
    public Punt2d(Punt2d p){

        this(p.getX(),p.getY());
        //this.x = p.x;
        //this.y = p.y;
    }


    //getters i setters

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    //distancia X amb un Punt2d com a paràmetre
    public double distanciaX(Punt2d punt){
        return Math.abs(this.x - punt.x);
    }

    //distancia X amb una coordenada
    public double distanciaX(double x){
        return Math.abs(this.x - x);
    }


    //distancia Y amb un Punt2d com a paràmetre
    public double distanciaY(Punt2d punt){
        return Math.abs(this.y - punt.y);
    }

    //distancia Y amb una coordenada
    public double distanciaY(double y){
        return Math.abs(this.y - y);
    }

    //distancia entre 2 punts amb un Punt2d com a paràmetre
    public double distanciaDosPunts(Punt2d punt){

        double distanciaX = this.distanciaX(punt);
        double distanciaY = this.distanciaY(punt);

        double suma = distanciaX * distanciaX + distanciaY * distanciaY;

        return Math.sqrt(suma);
    }


    //distancia entre 2 punts sobrecarregat amb coordenades com a paràmetres
    public double distanciaDosPunts(double x, double y){

        double distanciaX = this.distanciaX(x);
        double distanciaY = this.distanciaY(y);
        
        double suma = distanciaX * distanciaX + distanciaY * distanciaY;

        return Math.sqrt(suma);
    }

    
    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }

}
