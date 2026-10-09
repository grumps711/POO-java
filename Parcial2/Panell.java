package Parcial2;

//Es vol desenvolupar una aplicació per gestionar un panell marcador pels resultats de les travesses. 

//marcador  disposa  de  25  mòduls  led  disposats  en  5  files  de  5 columnes (5x5).

//El marcador haurà de mostrar el resultat de la travessa per un partit, és a dir, haurà de mostrar un dels valors vàlids en una travessa: 1, X o 2.  

public class Panell {
    

    //contindrà  informació  per  mostrar  el resultat en un panell marcador.

    private int[][] panell = new int[5][5];

    //implementar un constructor sense paràmetres per  tal  de  crear  un  panell  buit

    public Panell(){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                panell[i][j] = 0;
            }
        }
    }

    //També s’ha d’implementar  un  constructor  que  rebi  un valor enter de 0 a 2 que permetrà construir el panell pels resultats X, 1 o 2 respectivament. 

   // Constructor segons resultat
    public Panell(int n){

        if(n == 0){

            // construir X

        }
        else if(n == 1){

            // construir 1

        }
        else if(n == 2){

            // construir 2

        }
    }


    //Finalment heu d’implementar el constructor de còpia. 

    public Panell(Panell p){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                this.panell[i][j] = p.panell[i][j];
            }
        }
    }


    public canvi(int n){


    }


    //També  es  demana  fer  un  mètode  que  permeti  canviar  el  resultat  a  visualitzar.  Aquest 
    //mètode  es  dirà  canvi  i  rebrà  per  paràmetre  un  valor  numèric  amb  el  nou  resultat  a 
    //visualitzar. El numèric rebut serà un enter de 0 a 2 que indicarà que el nou panell contindrà 
    //el resultat X, 1 o 2 respectivament. A més de canviar el valor del panell, el mètode haurà 
    //de  retornar  una  matriu  de  caràcters  de  tamany  5x5  indicant  quins  mòduls  led  s’han 
    //d’encendre o apagar per tal de que el panell canviï de valor. Els valors de la matriu de 
    //retorn seran:  
    //A: si el mòdul s’ha d’Apagar 
    //E: si s’ha d’Encendre 
    //- : si no canvia 
    //Exemple: Suposem que el panell passa de tenir el valor X al valor 2. La taula de caràcters 
    //amb els canvis a realitzar en el panell marcador seria: 
    //AEEEA 
    //-A--- 
    //-E-E- 
    //---A- 
    //AEEEA 
    public char[][] canvi(int n){

        char[][] canvi = new char[5][5];

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){

                if(panell[i][j] == 1 && n == 0){
                    canvi[i][j] = 'A';
                }
                else if(panell[i][j] == 1 && n == 2){
                    canvi[i][j] = 'A';
                }
                else if(panell[i][j] == 0 && n == 1){
                    canvi[i][j] = 'E';
                }
                else if(panell[i][j] == 0 && n == 2){
                    canvi[i][j] = 'E';
                }
                else if(panell[i][j] == 2 && n == 0){
                    canvi[i][j] = 'A';
                }
                else if(panell[i][j] == 2 && n == 1){
                    canvi[i][j] = 'A';
                }
                else{
                    canvi[i][j] = '-';
                }

            }
        }

        return canvi;
    }




}
