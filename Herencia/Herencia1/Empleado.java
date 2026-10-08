package Herencia.Herencia1;
public class Empleado extends Persona {
    
    private int salari;

    Empleado(int dni, String nom, String cognom1, String cognom2, int salari) {
        super(dni, nom, cognom1, cognom2);
        this.salari = salari;
    }

    public int getSalari() {
        return salari;
    }

    public void setSalari(int salari) {
        this.salari = salari;
    }

    public double nominaMensual() {
        return salari;
    }
}
