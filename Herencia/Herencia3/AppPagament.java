public class AppPagament extends App{

    private double cost;

    //constructor

    public AppPagament(String nom, String descripcio, String nomDesenvolupador, int versio, double cost) {
        super(nom, descripcio, nomDesenvolupador, versio);
        this.cost = cost;
    }



    @Override
    public double calcularCost() {
        return cost;
    }


    //Getters i setters

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    //ToString

    @Override
    public String toString() {
        return "AppPagament [cost=" + cost + ", toString()=" + super.toString() + "]";
    }

  

  

    

    
}
