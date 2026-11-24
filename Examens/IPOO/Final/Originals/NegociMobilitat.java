import java.util.Arrays;

public class NegociMobilitat {
    

    private VehicleLloguer[] llistaServeisVehiclesLloguer;//************************************* no
    private double ingresMensual;//************************************* no
    private int numOperacionsRealitzades;//************************************* no



    public NegociMobilitat(VehicleLloguer[] llistaServeisVehiclesLloguer, double ingresMensual,
            int numOperacionsRealitzades) {
        this.ingresMensual = ingresMensual;
        this.numOperacionsRealitzades = numOperacionsRealitzades;
        if(numOperacionsRealitzades<=50){
            this.llistaServeisVehiclesLloguer = llistaServeisVehiclesLloguer;
        }
    }


    public boolean afegirNouServei(VehicleLloguer v){
        if( llistaServeisVehiclesLloguer[numOperacionsRealitzades++]==null){//**************************compte increment
            llistaServeisVehiclesLloguer[numOperacionsRealitzades++] = v;
            return true;
        }
        return false;
    }

    public int calcularTotalOperacionsMensualsRealitzades(){
        int totalOperacionsRealitzades = 0;
        for (int i = 0; i < llistaServeisVehiclesLloguer.length; i++) {//************************************* control nulls
            totalOperacionsRealitzades+=llistaServeisVehiclesLloguer[i].getNumOperacionsRealitzades();
        }
        return totalOperacionsRealitzades;
    }

    public double calcularTotalIngressosMensuals(){
        double totalIngressosMensuals = 0;
        for (int i = 0; i < llistaServeisVehiclesLloguer.length; i++) {//************************************* control nulls
            totalIngressosMensuals+=llistaServeisVehiclesLloguer[i].getNumLloguersMensuals();
        }
        return totalIngressosMensuals;
    }


    public VehicleLloguer obtenirMaxServeiIngressosMensuals(){
        VehicleLloguer vehicleMaxIngressos = null;
        for (int i = 0; i < llistaServeisVehiclesLloguer.length; i++) {//************************************* control nulls
            if(llistaServeisVehiclesLloguer[i].getIngresMensual() >= vehicleMaxIngressos.getIngresMensual()){
                vehicleMaxIngressos = llistaServeisVehiclesLloguer[i];
            }
        }
        return vehicleMaxIngressos;
    }


    @Override
    public String toString() {
        return "NegociMobilitat [llistaServeisVehiclesLloguer=" + Arrays.toString(llistaServeisVehiclesLloguer)
                + ", ingresMensual=" + ingresMensual + ", numOperacionsRealitzades=" + numOperacionsRealitzades + "]";
    }

}
