package ex_InstalacionesDeportivas;

public class CadenaNegocio {

	    private Negocio[] negocios;  // Array que almacena todos los negocios (instalaciones, plataformas, tiendas)
	    private int numNegocios;  // N�mero actual de negocios gestionados
	    private int maxNegocios;

	    public CadenaNegocio(int maxNegocios) {
	        this.negocios = new Negocio[maxNegocios];
	        this.numNegocios = 0;
	        this.maxNegocios = maxNegocios;
	    }

	    // M�todo para a�adir un negocio
	    public boolean agregarNegocio(Negocio negocio) {
	        if (numNegocios < maxNegocios) {
	            negocios[numNegocios++] = negocio;
	            return true;
	        }
	        return false;
	    }

	    // M�todo para calcular el total de p�blico atendido por todos los negocios
	    public int calcularTotalPublico() {
	        int totalPublico = 0;
	        for (int i = 0; i < numNegocios; i++) {
	            totalPublico += negocios[i].calcularTotalPublico();
	        }
	        return totalPublico;
	    }

	    // M�todo para calcular la facturaci�n mensual total de todos los negocios
	    public double calcularFacturacionMensual() {
	        double facturacionTotal = 0;
	        for (int i = 0; i < numNegocios; i++) {
	            facturacionTotal += negocios[i].calcularFacturacionMensual();
	        }
	        return facturacionTotal;
	    }
}
