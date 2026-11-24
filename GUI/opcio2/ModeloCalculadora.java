public interface ModeloCalculadora {

    // Reinicia l'estat de la calculadora
    public void clear();

    // Retorna el resultat actual
    public double getResultado();

    // Estableix una nova operació pendent
    public void nuevaOperacion(OperadorBinario operacion);

    // Introdueix un operand al model
    public void nuevoOperando(double operando);
}
