package ClassesObjectes5;

public class TestDibuix {

    public static void main(String[] args) {

        // Creem punts
        Punt2d p1 = new Punt2d(0, 0);
        Punt2d p2 = new Punt2d(4, 3);

        Punt2d p3 = new Punt2d(2, 2);
        Punt2d p4 = new Punt2d(7, 5);

        // Creem rectangles
        Rectangle2D r1 = new Rectangle2D(p1, p2);
        Rectangle2D r2 = new Rectangle2D(p3, p4);

        // Creem una taula de rectangles
        Rectangle2D[] llista = new Rectangle2D[2];

        llista[0] = r1;
        llista[1] = r2;

        // Creem el dibuix
        Dibuix d = new Dibuix(llista, 3);

        // Provem el color
        System.out.println("Color: " + d.getColor());

        d.setColor(7);

        System.out.println("Nou color: " + d.getColor());


        // Provem el nombre de rectangles
        System.out.println("Nombre de rectangles: "+ d.getNombreRectangles());


        // Provem triaRectangle
        System.out.println("Rectangle 0:");
        System.out.println(d.triaRectangle(0));

        System.out.println("Rectangle 1:");
        System.out.println(d.triaRectangle(1));


        // Modifiquem un rectangle de la llista original
        System.out.println("\nAbans de modificar:");
        System.out.println("Original: " + llista[0]);
        System.out.println("Dibuix:   " + d.triaRectangle(0));

        llista[0].setPunt1(new Punt2d(100, 100));

        System.out.println("\nDespres de modificar:");
        System.out.println("Original: " + llista[0]);
        System.out.println("Dibuix:   " + d.triaRectangle(0));
    }
}