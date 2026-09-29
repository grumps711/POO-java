package ClassesObjectes5;

public class Dibuix {
    
    private int color;
    private Rectangle2D[] llistaRectangles2D;
    private int nombreRectangles;



    //constructor

    public Dibuix(Rectangle2D[] llista, int color){

        this.color= color;
        this.llistaRectangles2D = new Rectangle2D[100];        //crea un array en la memòria

        if (llista.length > 100) {
            nombreRectangles = 100;
        } else {
            nombreRectangles = llista.length;
        }

        //copia rectangles paràmetre a rectangles dibuix
        for (int i = 0; i < nombreRectangles; i++) {
            this.llistaRectangles2D[i] = new Rectangle2D(llista[i]);
        }
    }


    //getters i setters

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public Rectangle2D triaRectangle(int n){
        return this.llistaRectangles2D[n];
    }

    public int getNombreRectangles(){
        return nombreRectangles;
    }
}
