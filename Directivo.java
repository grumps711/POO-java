public class Directivo extends Empleado {


    private int complemento1;
    private int complemento2;


    public Directivo(int dni, String nom, String cognom1, String cognom2, int salari, int complemento1, int complemento2) {
        super(dni, nom, cognom1, cognom2, salari);
        this.complemento1 = complemento1;
        this.complemento2 = complemento2;
    }
    
}
