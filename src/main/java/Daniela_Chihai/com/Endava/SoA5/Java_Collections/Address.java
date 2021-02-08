package Daniela_Chihai.com.Endava.SoA5.Java_Collections;

public class Address {
    private String country;
    private String city;
    private String street;

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
        return ("Country: " + getCountry() + ", City: " + getCity() + ", Street: " + getStreet());
    }

    public Address(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
