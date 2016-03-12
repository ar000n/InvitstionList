
public class Address {
    private String country;
    private String state;
    private String city;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return city+","+state+","+country;
    }
}
