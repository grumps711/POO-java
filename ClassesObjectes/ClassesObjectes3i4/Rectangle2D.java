

public class Rectangle2D {
    
    private Punt2d punt1;
    private Punt2d punt2;

    //constructor amb dos punts com a paràmetres
    public Rectangle2D(Punt2d p1, Punt2d p2) {
        this.punt1 = new Punt2d(p1);
        this.punt2 = new Punt2d(p2);
    }

    //constructor de copia
    public Rectangle2D(Rectangle2D r) {
        this.punt1 = new Punt2d(r.punt1);
        this.punt2 = new Punt2d(r.punt2);
    }



    //getters i setters

    public Punt2d getPunt1() {
        return new Punt2d(this.punt1);
    }

    public void setPunt1(Punt2d punt1) {
        this.punt1 = new Punt2d(punt1);
    }

    public Punt2d getPunt2() {
        return new Punt2d(this.punt2);
    }

    public void setPunt2(Punt2d punt2) {
        this.punt2 = new Punt2d(punt2);
    }




    //area = costatX * costatY
    public double area(){
        
        double costatX = punt1.distanciaX(punt2);
        double costatY = punt1.distanciaY(punt2);
        
        return costatX * costatY;
    }

    //perimetre = costatX*2 + costatY*2
    public double perimetre(){
        
        double costatX = punt1.distanciaX(punt2);
        double costatY = punt1.distanciaY(punt2);
        
        return costatX*2 + costatY*2;
    }




    public String toString() {
        return punt1 + " - " + punt2;
    }
}
