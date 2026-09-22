package Punt2d;


public class Punt2d {
    
    double x,y;



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


    public String toString(Punt2d coordenadaX, Punt2d coordenadaY){

        return "(" + coordenadaX + "," + coordenadaY + ")";

    }


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


}
