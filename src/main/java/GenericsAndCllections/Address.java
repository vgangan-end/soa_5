package GenericsAndCllections;

public class Address {
    public String country;
    public String city;
    public String street;

    public Address(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getFullAddress() {
        return "Country:  " + getCountry() + ", city: " + getCity() + ", street: " + getStreet() + "\n";
    }

    @Override
    public String toString() {
        return getFullAddress();
    }
}
