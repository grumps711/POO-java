package Herencia.Herencia1;
public class EmpleadoConComplementoCategoria extends Empleado {
    
    private int salari;
    private double complementCategoria;

    public EmpleadoConComplementoCategoria(int dni, String nom, String cognom1, String cognom2, int salari, int complemento) {
        super(dni, nom, cognom1, cognom2, salari);
        this.salari = salari;
        this.complementCategoria = complemento;
    }

    public double getComplementCategoria() {
        return complementCategoria;
    }

    // mira aixó! no ho vaig fer bé
    public double nominaMensual() {
        return super.nominaMensual() + getComplementCategoria();
    }
    
}