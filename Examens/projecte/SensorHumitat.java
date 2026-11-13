package projecte;

/** Sensor d'humitat relativa amb interval [0, 100] %HR. */
public class SensorHumitat extends Sensor {

    public SensorHumitat(int id) {
        this(id, UnitatMesura.HUMITAT_RELATIVA);
    }

    public SensorHumitat(int id, UnitatMesura unitatMesura) {
        super(id, 0.0, 100.0, unitatMesura);
    }

    @Override
    public boolean foraLlindars(double valor) {
        return valor > 0.80 * getLimMax();
    }
}
