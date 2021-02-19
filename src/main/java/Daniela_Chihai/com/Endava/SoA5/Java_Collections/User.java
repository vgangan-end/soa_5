package Daniela_Chihai.com.Endava.SoA5.Java_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class User {
    private long id;
    private String username;
    private Map<String, Address> addresses;

    public User(long id, String username, Map<String, Address> addresses) {
        this.id = id;
        this.username = username;
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", addresses=" + addresses +
                '}';
    }

    public List<User> filterUserByCity(List<User> users, String city) {
        List<User> listOfUsers = new ArrayList<User>(); //- e goala
        for (User user : users) {
            ArrayList<Address> addressList = new ArrayList<Address>(user.addresses.values());
            for (Address address : addressList) {
                if (address.getCity().equals(city)) { // daca adresa userului nostru e egala cu variabila city
                    listOfUsers.add(user); // la lista ii adaugam userul care vede orasul nostru
                }
            }
        }
        return listOfUsers;
    }
}
