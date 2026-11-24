public class Calculadora implements ModeloCalculadora {

    private double resultado;
    private OperadorBinario operacion;

    public Calculadora() {
        this.resultado = 0;
        this.operacion = null;
    }

    @Override
    public void clear() {
        resultado = 0;
        operacion = null;
    }

    @Override
    public double getResultado() {
        return resultado;
    }

    @Override
    public void nuevaOperacion(OperadorBinario operacion) {
        this.operacion = operacion;

    }

    @Override
    public void nuevoOperando(double operando) {
        if(operacion != null){
            resultado = operacion.ejecutar(resultado, operando);
        }
        else{
            resultado = operando;
        }

        operacion = null;
    }
    
}
