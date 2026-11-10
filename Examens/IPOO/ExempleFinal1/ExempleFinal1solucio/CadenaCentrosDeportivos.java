package Examens.ExempleFinal1.ExempleFinal1solucio;

public class CadenaCentrosDeportivos {
    private InstalacionDeportiva[] instalaciones;  // Array para almacenar las instalaciones
    private int maxInstalaciones;  // L�mite de instalaciones 
    private int numInstalaciones;  // N�mero de instalaciones actualmente gestionadas

    // Constructor que recibe un array inicial de instalaciones y el m�ximo permitido
    public CadenaCentrosDeportivos(InstalacionDeportiva[] instalacionesIniciales, int maxInstalaciones) {
        this.maxInstalaciones = maxInstalaciones;
        this.instalaciones = new InstalacionDeportiva[maxInstalaciones];
        this.numInstalaciones = instalacionesIniciales.length;

        // Copiar las instalaciones iniciales al array de la cadena
        for (int i = 0; i < instalacionesIniciales.length; i++) {
            instalaciones[i] = instalacionesIniciales[i];
        }
    }

    // M�todo para dar de alta una nueva instalaci�n deportiva
    public boolean darAltaInstalacion(InstalacionDeportiva nuevaInstalacion) {
        if (numInstalaciones >= maxInstalaciones) {
            return false;  // No se puede dar de alta, se ha alcanzado el l�mite de instalaciones
        }
        instalaciones[numInstalaciones++] = nuevaInstalacion;  // A�adir la instalaci�n
        return true;
    }

    // M�todo para contar el n�mero de instalaciones deportivas gestionadas
    public int contarInstalaciones() {
        return numInstalaciones;
    }

    // M�todo para buscar una instalaci�n deportiva por su ID
    public InstalacionDeportiva buscarInstalacionPorId(String id) {
        for (int i = 0; i < numInstalaciones; i++) {
            if (instalaciones[i].getId().equals(id)) {
                return instalaciones[i];
            }
        }
        return null;  // Si no se encuentra la instalaci�n
    }

    // M�todo para calcular la superficie total practicable de todas las instalaciones
    /*public double calcularSuperficieTotalPracticable() {
        double superficieTotal = 0;
        for (int i = 0; i < numInstalaciones; i++) {
            superficieTotal += instalaciones[i].calcularAreaTotalPracticable();
        }
        return superficieTotal;
    }*/

    // M�todo para contar cu�ntas instalaciones proporcionan servicio de entrenadores personales
    public int contarInstalacionesConEntrenadoresPersonales() {
        int contador = 0;
        for (int i = 0; i < numInstalaciones; i++) {
            if (instalaciones[i].hayEntrenadoresPersonales()) {
                contador++;
            }
        }
        return contador;
    }

    // M�todo toString que devuelve la informaci�n de todas las instalaciones
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cadena de Centros Deportivos MIR:\n");
        for (int i = 0; i < numInstalaciones; i++) {
            InstalacionDeportiva instalacion = instalaciones[i];
            sb.append(instalacion.toString());
            sb.append("\nTipo de instalaci�n: ").append(instalacion.getClass().getSimpleName());
            sb.append("\nSuperficie total practicable: ").append(instalacion.calcularAreaTotalPracticable());
            sb.append("\nEntrenadores personales disponibles: ").append(instalacion.hayEntrenadoresPersonales());
            sb.append("\nIngresos extras diarios (si aplica): ").append(instalacion.calcularIngresosExtrasDiarios());
            sb.append("\n");
        }
        sb.append("N�mero total de instalaciones gestionadas: ").append(numInstalaciones);
        return sb.toString();
    }
}
