
import java.util.List;

public class Jardi {

    private String name;
    private List<Address> addresses;
    private List<Servei> from_relationships;

    public Jardi(String name, List<Address> addresses, List<Servei> from_relationships) {
        this.name = name;
        this.addresses = addresses;
        this.from_relationships = from_relationships;
    }

    @Override
    public String toString() {
        return "Jardi: " + name +
               "\nAdreces: " + addresses.get(0) +
               "\nServeis: " + from_relationships + "\n";
    }
}
