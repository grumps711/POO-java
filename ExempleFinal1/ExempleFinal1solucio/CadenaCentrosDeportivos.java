package ex_InstalacionesDeportivas;

public class CadenaCentrosDeportivos {
    private InstalacionDeportiva[] instalaciones;  // Array para almacenar las instalaciones
    private int maxInstalaciones;  // Límite de instalaciones 
    private int numInstalaciones;  // Número de instalaciones actualmente gestionadas

    // Constructor que recibe un array inicial de instalaciones y el máximo permitido
    public CadenaCentrosDeportivos(InstalacionDeportiva[] instalacionesIniciales, int maxInstalaciones) {
        this.maxInstalaciones = maxInstalaciones;
        this.instalaciones = new InstalacionDeportiva[maxInstalaciones];
        this.numInstalaciones = instalacionesIniciales.length;

        // Copiar las instalaciones iniciales al array de la cadena
        for (int i = 0; i < instalacionesIniciales.length; i++) {
            instalaciones[i] = instalacionesIniciales[i];
        }
    }

    // Método para dar de alta una nueva instalación deportiva
    public boolean darAltaInstalacion(InstalacionDeportiva nuevaInstalacion) {
        if (numInstalaciones >= maxInstalaciones) {
            return false;  // No se puede dar de alta, se ha alcanzado el límite de instalaciones
        }
        instalaciones[numInstalaciones++] = nuevaInstalacion;  // Añadir la instalación
        return true;
    }

    // Método para contar el número de instalaciones deportivas gestionadas
    public int contarInstalaciones() {
        return numInstalaciones;
    }

    // Método para buscar una instalación deportiva por su ID
    public InstalacionDeportiva buscarInstalacionPorId(String id) {
        for (int i = 0; i < numInstalaciones; i++) {
            if (instalaciones[i].getId().equals(id)) {
                return instalaciones[i];
            }
        }
        return null;  // Si no se encuentra la instalación
    }

    // Método para calcular la superficie total practicable de todas las instalaciones
    /*public double calcularSuperficieTotalPracticable() {
        double superficieTotal = 0;
        for (int i = 0; i < numInstalaciones; i++) {
            superficieTotal += instalaciones[i].calcularAreaTotalPracticable();
        }
        return superficieTotal;
    }*/

    // Método para contar cuántas instalaciones proporcionan servicio de entrenadores personales
    public int contarInstalacionesConEntrenadoresPersonales() {
        int contador = 0;
        for (int i = 0; i < numInstalaciones; i++) {
            if (instalaciones[i].hayEntrenadoresPersonales()) {
                contador++;
            }
        }
        return contador;
    }

    // Método toString que devuelve la información de todas las instalaciones
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cadena de Centros Deportivos MIR:\n");
        for (int i = 0; i < numInstalaciones; i++) {
            InstalacionDeportiva instalacion = instalaciones[i];
            sb.append(instalacion.toString());
            sb.append("\nTipo de instalación: ").append(instalacion.getClass().getSimpleName());
            sb.append("\nSuperficie total practicable: ").append(instalacion.calcularAreaTotalPracticable());
            sb.append("\nEntrenadores personales disponibles: ").append(instalacion.hayEntrenadoresPersonales());
            sb.append("\nIngresos extras diarios (si aplica): ").append(instalacion.calcularIngresosExtrasDiarios());
            sb.append("\n");
        }
        sb.append("Número total de instalaciones gestionadas: ").append(numInstalaciones);
        return sb.toString();
    }
}
