package projecte;

/** Sensor de CO2 amb interval [0, 10000] ppmCO2. */
public class SensorCO2 extends Sensor {

    // El PDF no concreta la xifra del llindar de CO2.
    // S'escull 1000 ppm com a valor CONFIGURABLE des d'aquesta constant.
    public static final double LLINDAR_CO2 = 1000.0;

    public SensorCO2(int id) {
        this(id, UnitatMesura.PPM_CO2);
    }

    public SensorCO2(int id, UnitatMesura unitatMesura) {
        super(id, 0.0, 10000.0, unitatMesura);
    }

    @Override
    public boolean foraLlindars(double valor) {
        return valor > LLINDAR_CO2;
    }
}
