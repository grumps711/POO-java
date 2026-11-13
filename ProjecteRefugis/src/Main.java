
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        LlistaRefugis refugis = new LlistaRefugis();
        refugis.llegir();
        refugis.mostrarPrimers(5);
    }
}
