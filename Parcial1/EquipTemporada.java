package Parcial;


public class EquipTemporada {
    

    private Jugador[] llistaJugadors;

    private int anyInicial;

    private static final int maxJugadors = 20;

    //constructor

    public EquipTemporada(String[] nomsJugadors, int anyIni ){

        this.anyInicial = anyIni;
        
        int numJugadors;

        if(nomsJugadors.length > maxJugadors){
            numJugadors = maxJugadors;
        }
        else{
            numJugadors = nomsJugadors.length;
        }

        //this.llistaJugadors = new Jugador[numJugadors];

        for(int i=0; i<numJugadors; i++){
        this.llistaJugadors[i] = new Jugador(i+1,nomsJugadors[i]);
        }
    }


    public Jugador obtenirJugador(int dorsal){

        if(dorsal < 1 || dorsal > llistaJugadors.length){
            return null;
        }

        return llistaJugadors[dorsal-1];
    }


    // dorsals que han jugat un partit [1,3,4,6,7,8,9,10,11,23,24]

    public void actualitzarPartitsJugats(int[] llistaDorsalsJugat){

        for(int i=0 ; i < llistaDorsalsJugat.length;i++){
            llistaJugadors[llistaDorsalsJugat[i]-1].unPartitJugatMes();
        }
    }



    // dorsals que han marcat en el partit [1,3,3,3]

    public void actualitzarGolsMarcats(int[] llistaDorsalsMarcat){

        for(int i=0 ; i < llistaDorsalsMarcat.length ;i++){
            llistaJugadors[llistaDorsalsMarcat[i]-1].unGolMarcatMes();
        }
    }


    public int getNumJugadors(){
        return llistaJugadors.length;
    }


    public Jugador maximGolejadorEquip(){
        
        Jugador maxGolejador = llistaJugadors[0];
        
        for(int i=1 ; i < llistaJugadors.length ; i++){

            if(llistaJugadors[i].getGolsMarcats() > maxGolejador.getGolsMarcats()){
                maxGolejador=llistaJugadors[i];
            }

            else if(llistaJugadors[i].getGolsMarcats() == maxGolejador.getGolsMarcats()){  

                if(llistaJugadors[i].mitjanaAritmeticaGolsPerPartit() > maxGolejador.mitjanaAritmeticaGolsPerPartit()){
                    maxGolejador = llistaJugadors[i];
                }

                else if(llistaJugadors[i].mitjanaAritmeticaGolsPerPartit() == maxGolejador.mitjanaAritmeticaGolsPerPartit()){

                    if(llistaJugadors[i].getDorsal() < maxGolejador.getDorsal()){
                        maxGolejador = llistaJugadors[i];
                    }
                }
            }
        }
        
        return maxGolejador; 
    }
}
