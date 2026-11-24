import java.util.Arrays;
import java.util.Objects;

public abstract class EstacioRecarrega implements ServeiMobilitat {

    // Atributs originals. Els punts no es poden substituir despres del constructor.
    private final String id;
    private String nom;
    private String descripcio;
    private int numRecarreguesMensuals;
    private double totalIngressosMensuals;
    private final PuntRecarrega[] punts;
    private double preuBase;

    // Constructor compatible amb el TestEx de la professora.
    public EstacioRecarrega(String id, String nom, String descripcio,
            PuntRecarrega[] punts, double preuBase) {
        this(id, nom, descripcio, 0, 0.0, punts, preuBase);
    }

    // Conservo el constructor original per als comptadors mensuals del problema 3.
    public EstacioRecarrega(String id, String nom, String descripcio, int numRecarreguesMensuals, double totalIngressosMensuals, PuntRecarrega[] punts, double preuBase) {
        if (punts == null || punts.length == 0) {
            throw new IllegalArgumentException("Una estacio ha de tenir almenys un punt");
        }
        for (PuntRecarrega punt : punts) {
            if (punt == null) {
                throw new IllegalArgumentException("Els punts de recarrega no poden ser null");
            }
        }
        this.id = id;
        this.nom = nom;
        this.descripcio = descripcio;
        this.numRecarreguesMensuals = numRecarreguesMensuals;
        this.totalIngressosMensuals = totalIngressosMensuals;
        this.punts = punts.clone();
        this.preuBase = preuBase;
    }

    public String getId() {
        return id;
    }

    public String getCodi() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getUbicacio() {
        return descripcio;
    }

    public void setUbicacio(String ubicacio) {
        this.descripcio = ubicacio;
    }

    public int getNumRecarreguesMensuals() {
        return numRecarreguesMensuals;
    }

    public void setNumRecarreguesMensuals(int numRecarreguesMensuals) {
        this.numRecarreguesMensuals = numRecarreguesMensuals;
    }

    public double getTotalIngressosMensuals() {
        return totalIngressosMensuals;
    }

    public void setTotalIngressosMensuals(double totalIngressosMensuals) {
        this.totalIngressosMensuals = totalIngressosMensuals;
    }

    public PuntRecarrega[] getPunts() {
        return punts.clone(); // El contingut de la llista no es pot substituir des de fora.
    }

    public double getPreuBase() {
        return preuBase;
    }

    public void setPreuBase(double preuBase) {
        this.preuBase = preuBase;
    }

    public double getPreuBaseKWh() {
        return preuBase;
    }

    public void setPreuBaseKWh(double preuBase) {
        this.preuBase = preuBase;
    }

    public int calcularTotalPuntsRecarrega() {
        return punts.length; // Correccio: n'hi ha prou amb length.
    }

    public int getNombrePunts() {
        return calcularTotalPuntsRecarrega();
    }

    public int calcularTotalPuntsOperatius() {
        int totalPuntsOperatius = 0;
        for (int i = 0; i < punts.length; i++) {
            if (punts[i] != null && punts[i].isOperatiu()) {
                totalPuntsOperatius++;
            }
        }
        return totalPuntsOperatius;
    }

    public int getNombrePuntsOperatius() {
        return calcularTotalPuntsOperatius();
    }

    public PuntRecarrega buscarPuntRecarregaPerId(String id) {
        for (int i = 0; i < punts.length; i++) {
            if (punts[i] != null && Objects.equals(punts[i].getId(), id)) {
                return punts[i]; // Correccio: equals(), no ==.
            }
        }
        return null;
    }

    public PuntRecarrega buscarPunt(String id) {
        return buscarPuntRecarregaPerId(id);
    }

    public boolean modificarEstatPuntRecarrega(String id, boolean nouEstat) {
        PuntRecarrega punt = buscarPunt(id); // Correccio: reutilitzar la cerca.
        if (punt == null) return false;
        punt.setOperatiu(nouEstat);
        return true;
    }

    public boolean modificaEstat(String id, boolean nouEstat) {
        return modificarEstatPuntRecarrega(id, nouEstat);
    }

    // El factor diferent es decideix a EstacioAC / EstacioDC.
    protected abstract double getFactorEficiencia();

    public double calcularTemps(String id, double energiaSolicitada) {
        PuntRecarrega punt = buscarPunt(id);
        if (punt == null || !punt.isOperatiu() || energiaSolicitada <= 0
                || punt.getPotenciaKW() <= 0) {
            return -1.0;
        }
        double tempsBase = energiaSolicitada / punt.getPotenciaKW() * 60;
        return tempsBase * getFactorEficiencia();
    }

    public double calcularTempsEstimatUnaRecarrega(String id, double energiaSolicitada) {
        return calcularTemps(id, energiaSolicitada);
    }

    // Cada subtipus te una formula de cost diferent.
    public abstract double calcularCost(String id, double energiaSolicitada);

    // Problema 3: l'estacio tambe es un servei de mobilitat.
    @Override
    public int getOperacionsMensuals() {
        return numRecarreguesMensuals;
    }

    @Override
    public double getIngressosMensuals() {
        return totalIngressosMensuals;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{codi='" + id + "', nom='" + nom
                + "', ubicacio='" + descripcio + "', punts=" + Arrays.toString(punts)
                + ", preuBaseKWh=" + preuBase + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof EstacioRecarrega)) return false;
        EstacioRecarrega other = (EstacioRecarrega) obj;
        return Objects.equals(id, other.id); // Mateix codi, encara que sigui un altre subtipus.
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
