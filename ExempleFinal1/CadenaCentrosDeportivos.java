import java.util.Arrays;

public class CadenaCentrosDeportivos {
    
    private InstalacionDeportiva[] listaInstalacionDeportivas;
    private int maxInstalaciones;
    private int numInstalaciones;

    public CadenaCentrosDeportivos(InstalacionDeportiva[] lista, int maxInstalaciones){

        this.maxInstalaciones = maxInstalaciones;
        this.listaInstalacionDeportivas = new InstalacionDeportiva[maxInstalaciones];
        this.numInstalaciones = lista.length;

        for (int i = 0; i < lista.length; i++) {
            this.listaInstalacionDeportivas[i] = lista[i];
        }
    }


    public boolean darAltaInstalacion(InstalacionDeportiva instalacion){
        if(this.numInstalaciones >= this.maxInstalaciones){
            return false;
        }
        this.listaInstalacionDeportivas[numInstalaciones++] = instalacion;
        return true;
    }


    public int contarInstalaciones(){
        return this.numInstalaciones;
    }

    public InstalacionDeportiva buscarInstalacionPorId(String id){
        for (int i = 0; i < listaInstalacionDeportivas.length; i++) {
            if(listaInstalacionDeportivas[i].getId().equals(id)){
                return listaInstalacionDeportivas[i];
            }
        }
        return null;
    }

    public int contarInstalacionesConEntrenadoresPersonales(){
        int numInstalacionesOfrecenEntrenador=0;
        for (int i = 0; i < listaInstalacionDeportivas.length; i++) {
            if(listaInstalacionDeportivas[i].hayEntrenadoresPersonales()==true){
                numInstalacionesOfrecenEntrenador++;
            }
        }
        return numInstalacionesOfrecenEntrenador;
    }

    public void altaSocioInstalacion(String idInstalacion){
        for (int i = 0; i < listaInstalacionDeportivas.length; i++) {
            if(listaInstalacionDeportivas[i].getId().equals(idInstalacion)){
                listaInstalacionDeportivas[i].altaMiembro();
            }
        }
    }


    @Override
    public String toString() {
        return "CadenaCentrosDeportivos [listaInstalacionDeportivas=" + Arrays.toString(listaInstalacionDeportivas)
                + ", numInstalaciones=" + numInstalaciones + "]";
    }


}
