public class Dibuix {
    
    private int color;

    private Rectangle2D[] llistaRectangle2ds;

    //constructor

    public Dibuix(Rectangle2D[] llista, int color){
        //copia rectangles a dibuix
        this.color= color;
        this.llistaRectangle2ds = new Rectangle2D[];
    }


    //getters i setters

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public Rectangle2D triaRectangle(Rectangle2D[] llista,int n){
        return llista[n];
    }

    public int nombreRectangles(Dibuix d){
        return d.llistaRectangle2ds.length;
    }

}
