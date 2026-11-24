/**
 * Prova IPOO: gestio d'estacions de recarrega.
 */
public class TestEx {
    public static void main(String[] args) {
        final double energia = 10.0;

        // Un objecte de cadascun dels quatre subtipus.
        EstacioRecarrega[] estacions = {
            new EstacioACconvencional("AC01", "AC convencional", "Terrassa", new PuntRecarrega[] { new PuntRecarrega("AC01-P1", 50, true), new PuntRecarrega("AC01-P2", 22, false) }, 0.20),
            new EstacioACsemirapida("AC02", "AC semirapida", "Sabadell", new PuntRecarrega[] { new PuntRecarrega("AC02-P1", 50, true), new PuntRecarrega("AC02-P2", 11, false) }, 0.20),
            new EstacioDCrapida("DC01", "DC rapida", "Barcelona", new PuntRecarrega[] { new PuntRecarrega("DC01-P1", 50, true), new PuntRecarrega("DC01-P2", 100, false) }, 0.20),
            new EstacioDCultrarapida("DC02", "DC ultrarapida", "Girona", new PuntRecarrega[] { new PuntRecarrega("DC02-P1", 50, true), new PuntRecarrega("DC02-P2", 150, false) }, 0.20)
        };

        System.out.println("========== PROBLEMA 1: ESTACIONS ==========");
        System.out.println("Energia sol.licitada: " + energia + " kWh");
        for (int i = 0; i < estacions.length; i++) {
            EstacioRecarrega estacio = estacions[i];
            System.out.println("\n-------------------------------------------");
            System.out.println("Subtipus: " + estacio.getClass().getSimpleName());
            System.out.println("toString(): " + estacio);
            System.out.println("getCodi(): " + estacio.getCodi());
            System.out.println("getNom(): " + estacio.getNom());
            System.out.println("getUbicacio(): " + estacio.getUbicacio());
            System.out.println("getPreuBaseKWh(): " + estacio.getPreuBaseKWh());
            System.out.println("getNombrePunts(): " + estacio.getNombrePunts());
            System.out.println("getNombrePuntsOperatius(): " + estacio.getNombrePuntsOperatius());
            System.out.println("getPunts():");
            for (PuntRecarrega punt : estacio.getPunts()) {
                System.out.println("  " + punt);
                System.out.println("    getIdentificador(): " + punt.getIdentificador());
                System.out.println("    getPotenciaKW(): " + punt.getPotenciaKW());
                System.out.println("    isOperatiu(): " + punt.isOperatiu());
            }

            String idOperatiu = estacio.getPunts()[0].getIdentificador();
            String idInoperatiu = estacio.getPunts()[1].getIdentificador();
            System.out.println("buscarPunt(existent): " + estacio.buscarPunt(idOperatiu));
            System.out.println("buscarPunt(inexistent): " + estacio.buscarPunt("NO_EXISTEIX"));
            System.out.printf("calcularTemps(%s, %.1f): %.3f min%n",
                    idOperatiu, energia, estacio.calcularTemps(idOperatiu, energia));
            System.out.printf("calcularCost(%s, %.1f): %.3f EUR%n",
                    idOperatiu, energia, estacio.calcularCost(idOperatiu, energia));
            System.out.println("calcularTemps(punt inoperatiu): "
                    + estacio.calcularTemps(idInoperatiu, energia));
            System.out.println("calcularCost(punt inoperatiu): "
                    + estacio.calcularCost(idInoperatiu, energia));
            System.out.println("calcularTemps(energia 0): "
                    + estacio.calcularTemps(idOperatiu, 0));
            System.out.println("calcularCost(punt inexistent): "
                    + estacio.calcularCost("NO_EXISTEIX", energia));
            System.out.println("ModificaEstat(inoperatiu, true): "
                    + estacio.modificaEstat(idInoperatiu, true));
            System.out.println("getNombrePuntsOperatius() despres: "
                    + estacio.getNombrePuntsOperatius());
            System.out.println("ModificaEstat(inexistent, true): "
                    + estacio.modificaEstat("NO_EXISTEIX", true));
            System.out.println("equals(mateixa referencia): " + estacio.equals(estacio));
            System.out.println("equals(estacio diferent): " + estacio.equals(estacions[(i + 1) % estacions.length]));

            estacio.setNom(estacio.getNom() + " (actualitzada)");
            estacio.setUbicacio(estacio.getUbicacio() + " - centre");
            estacio.setPreuBaseKWh(0.25);
            System.out.println("Despres dels setters -> nom: " + estacio.getNom()
                    + ", ubicacio: " + estacio.getUbicacio()
                    + ", preu: " + estacio.getPreuBaseKWh());
            // Restablim el valor per a les proves posteriors.
            estacio.setPreuBaseKWh(0.20);
            estacio.modificaEstat(idInoperatiu, false);
        }

        System.out.println("\n========== PROBLEMA 2: GESTOR ==========");
        GestorRecarrega gestor = new GestorRecarrega();
        System.out.println("getNombreEstacions() inicial: " + gestor.getNombreEstacions());
        for (EstacioRecarrega e : estacions) {
            System.out.println("afegirEstacio(" + e.getCodi() + "): " + gestor.afegirEstacio(e));
        }
        System.out.println("afegirEstacio(duplicada): " + gestor.afegirEstacio(estacions[0]));
        System.out.println("getNombreEstacions(): " + gestor.getNombreEstacions());
        System.out.println("buscarEstacio(DC01): " + gestor.buscarEstacio("DC01"));
        System.out.println("buscarEstacio(inexistent): " + gestor.buscarEstacio("X"));
        System.out.println("buscarEstacioPerPosicio(0): " + gestor.buscarEstacioPerPosicio(0));
        System.out.println("buscarEstacioPerPosicio(99): " + gestor.buscarEstacioPerPosicio(99));
        System.out.println("nombreTotalPuntsOperatius(): " + gestor.nombreTotalPuntsOperatius());
        System.out.printf("calcularCost(DC01, DC01-P1, %.1f): %.3f EUR%n",
                energia, gestor.calcularCost("DC01", "DC01-P1", energia));
        System.out.println("ModificaEstat(DC01, DC01-P1, false): "
                + gestor.modificaEstat("DC01", "DC01-P1", false));
        System.out.println("calcularCost(DC01, DC01-P1, 10) desactivat: "
                + gestor.calcularCost("DC01", "DC01-P1", energia));
        System.out.println("ModificaEstat(estacio inexistent): "
                + gestor.modificaEstat("X", "P", true));
        System.out.println("toString():\n" + gestor);
        gestor.modificaEstat("DC01", "DC01-P1", true);

        System.out.println("\n========== PROBLEMA 3: MOBILITAT ==========");

        NegociMobilitat negoci = new NegociMobilitat();
        VehicleLloguer vehicle = new VehicleLloguer("1234ABC", "Renault Zoe", 8, 30.0);
        estacions[0].setNumRecarreguesMensuals(12);
        estacions[0].setTotalIngressosMensuals(140.0);
        System.out.println("afegirNouServei(estacio): " + negoci.afegirNouServei(estacions[0]));
        System.out.println("afegirNouServei(vehicle): " + negoci.afegirNouServei(vehicle));
        System.out.println("total operacions: " + negoci.calcularTotalOperacionsMensualsRealitzades());
        System.out.println("total ingressos: " + negoci.calcularTotalIngressosMensuals());
        System.out.println("servei amb mes ingressos: " + negoci.obtenirMaxServeiIngressosMensuals());

       
    }
}
