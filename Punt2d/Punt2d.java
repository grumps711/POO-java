package Punt2d;


public class Punt2d {
    
    double x,y;




    //constructor
    public Punt2d(){
        this.x = 0;
        this.y = 0;
    }

    public Punt2d(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Punt2d(Punt2d p){
        this.x = p.x;
        this.y = p.y;
    }


    //getters and setters

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }


    //metodes

    //distancia x entre punt del objecte amb punt del paràmetre
    public double distanciaX(Punt2d punt){

        return Math.abs(this.x - punt.x);

    }

    //distancia y entre punt del objecte amb punt del paràmetre
    public double distanciaY(Punt2d punt){

        return Math.abs(this.y - punt.y);

    }

    //distancia entre punt del objecte amb punt del paràmetre
    public double distancia2punts(Punt2d punt){

        double distanciaX = this.distanciaX(punt);
        double distanciaY = this.distanciaY(punt);

        //teorema de Pitàgores
        double suma = distanciaX * distanciaX + distanciaY * distanciaY;

        return Math.sqrt(suma);
    
    }



//distancia x entre punt del objecte amb punt del paràmetre
    public double distanciaX2(double x){

        return Math.abs(this.x - x);

    }

    //distancia y entre punt del objecte amb punt del paràmetre
    public double distanciaY2(double y){

        return Math.abs(this.y - y);

    }

    //distancia entre punt del objecte amb punt del paràmetre
    public double distancia2punts2(double x, double y){

        double distanciaX = Math.abs(this.x - x);
        double distanciaY = Math.abs(this.y - y);

        //teorema de Pitàgores
        double suma = distanciaX * distanciaX + distanciaY * distanciaY;

        return Math.sqrt(suma);
    
    }





    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }



}
