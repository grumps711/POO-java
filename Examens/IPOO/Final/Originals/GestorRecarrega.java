public class GestorRecarrega {
    
	//************************************* static tamany 
	//************************************* sense toString
	
    private EstacioRecarrega[] llistaEstacions;
    private int numeroEstacions;



    

    public GestorRecarrega(EstacioRecarrega[] llistaEstacions, int numeroEstacions) {
        this.llistaEstacions = llistaEstacions;//************************************* control tamany
        this.numeroEstacions = numeroEstacions;
    }


    public boolean afegirEstacio(EstacioRecarrega e){
        if(llistaEstacions[numeroEstacions++]==null){//************************************* cal comprovar tamany
            llistaEstacions[numeroEstacions++] = e;//************************************* compte amb els increments,deixa un buit
            return true;}
        return false;
    }


    public int getNombreEstacions(){//************************************* tens una variable amb la dada
        int numeroEstacions=0;
        for (int index = 0; index < llistaEstacions.length; index++) {
            numeroEstacions++;
        }
        return numeroEstacions;
    }

    
    public EstacioRecarrega buscarEstacio(String id){
        EstacioRecarrega estacioRecarrega = null;
        for (int i = 0; i < llistaEstacions.length; i++) {
            if(llistaEstacions[i].getId()==id){//************************************* equals i nulls
                estacioRecarrega= llistaEstacions[i];
            }
        }
        return estacioRecarrega;
    }


    public EstacioRecarrega buscarEstacioPerPosicio(int j){//************************************* comprova j
        return llistaEstacions[j];
    }


    public int nombreTotalPuntsOperatius(){
        int totalPuntsOperatius = 0;
        for (int i = 0; i < llistaEstacions.length; i++) {
        totalPuntsOperatius += llistaEstacions[i].calcularTotalPuntsOperatius();
        }
        return totalPuntsOperatius;
    }

    public boolean modificaEstat(String idpunt, String idestacio, boolean nouEstat){
        int totalPuntsOperatius = 0;
        for (int i = 0; i < llistaEstacions.length; i++) {
            if(llistaEstacions[i].getId()==idestacio){
               llistaEstacions[i].modificarEstatPuntRecarrega(idpunt, nouEstat);//*************** i si retorna fals?
               return true;
            }
        }
     return false;
    }

    //public calcularCost();



}
