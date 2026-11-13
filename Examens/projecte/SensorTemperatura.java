package projecte;

/** Sensor de temperatura amb interval [-25, 100] graus Celsius. */
public class SensorTemperatura extends Sensor {

    public SensorTemperatura(int id) {
        this(id, UnitatMesura.CELSIUS);
    }

    public SensorTemperatura(int id, UnitatMesura unitatMesura) {
        super(id, -25.0, 100.0, unitatMesura);
    }

    @Override
    public boolean foraLlindars(double valor) {
        // 90% de 100 = 90; 90% de -25 = -22.5.
        return valor > 0.90 * getLimMax() || valor < 0.90 * getLimMin();
    }
}
