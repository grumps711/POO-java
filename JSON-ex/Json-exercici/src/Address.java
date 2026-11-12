import java.util.List;

public class Address {
    private String address_name;
    private String start_street_number;
    private String district_name;
    private String neighborhood_name;


    public Address(String address_name, String start_street_number, String district_name, String neighborhood_name) {
        this.address_name = address_name;
        this.start_street_number = start_street_number;
        this.district_name = district_name;
        this.neighborhood_name = neighborhood_name;
    }


    @Override
    public String toString() {
        return "address_name=" + address_name + ", start_street_number=" + start_street_number
                + ", district_name=" + district_name + ", neighborhood_name=" + neighborhood_name ;
    }
    
    

}
