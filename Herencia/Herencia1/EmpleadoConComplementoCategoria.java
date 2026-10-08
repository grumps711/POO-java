package Herencia.Herencia1;
public class EmpleadoConComplementoCategoria extends Empleado {
    
    private int salari;
    private int complemento;

    public EmpleadoConComplementoCategoria(int dni, String nom, String cognom1, String cognom2, int salari, int complemento) {
        super(dni, nom, cognom1, cognom2, salari);
        this.salari = salari;
        this.complemento = complemento;
    }

    
}