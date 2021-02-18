package GenericsAndCllections;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class User {
    public long userId;
    public String username;
    public Map<String, Address> addresses = new HashMap<String, Address>();

    public User(String username, Map<String, Address> addresses) {
        Random rand = new Random();
        this.userId = rand.nextInt(999);
        this.username = username;
        this.addresses = addresses;
    }

    public User(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User" +
                "username='" + username + '\'' +
                ", addresses=" + addresses.toString();
    }

    public void addAddress(String key, Address address) {
        this.addresses.put(key, address);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Map<String, Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<String, Address> addresses) {
        this.addresses = addresses;
    }

    public Address getAddress(String addressType) {
        return addresses.get(addressType);
    }
}
