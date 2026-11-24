public class Calculadora implements ModeloCalculadora {

    private double resultado;
    private OperadorBinario operacion;

    // Inicialitza el resultat a zero i sense cap operació pendent
    public Calculadora() {
        this.resultado = 0;
        this.operacion = null;
    }

    // Reinicia el resultat i elimina l'operació pendent
    @Override
    public void clear() {
        resultado = 0;
        operacion = null;
    }

    // Retorna el resultat actual de la calculadora
    @Override
    public double getResultado() {
        return resultado;
    }

    // Desa l'operació pendent d'executar
    @Override
    public void nuevaOperacion(OperadorBinario operacion) {
        this.operacion = operacion;
    }

    // Rep un operand i executa l'operació pendent si n'hi ha una
    @Override
    public void nuevoOperando(double operando) {
        if (operacion != null) {
            resultado = operacion.ejecutar(resultado, operando);
        } else {
            resultado = operando;
        }

        operacion = null;
    }
}
