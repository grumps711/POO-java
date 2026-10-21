public class NegocioDeportivo {

    private Negocio[] listaNegocios;

    // Constructor
    public NegocioDeportivo(Negocio[] negocios) {
        this.listaNegocios = negocios;
    }

    // Calcular total de publico
    public int calcularTotalPublico() {
        int total = 0;

        for (int i = 0; i < listaNegocios.length; i++) {
            total += listaNegocios[i].calcularTotalPublico();
        }

        return total;
    }

    // Calcular facturacion mensual
    public double calcularFacturacionMensual() {
        double total = 0;
        for (int i = 0; i < listaNegocios.length; i++) {
            total += listaNegocios[i].calcularFacturacionMensual();
        }
        return total;
    }
}