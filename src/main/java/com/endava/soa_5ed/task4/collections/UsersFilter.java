package com.endava.soa_5ed.task4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UsersFilter {

    private UsersFilter(){};

    public static List<User> filterUsersByCity(List<User> usersList, String city) {
        List<User> filteredUsersList = new ArrayList<>();
        for (User user : usersList) {
            Map<String, Address> filteredAddressMap = filterUserAddressesByCity(user.getAddresses(), city);
            if (!filteredAddressMap.isEmpty()) {
                filteredUsersList.add(user);
            }
        }
        return filteredUsersList;
    }

    protected static Map<String, Address> filterUserAddressesByCity(Map<String, Address> addressMap,
                                                          String city) {
        Map<String, Address> filteredAddressMap = new HashMap<>();
        addressMap.forEach((addressType, address) -> {
            if (address.getCity().equals(city)) {
                filteredAddressMap.put(addressType, address);
            }
        });
        return filteredAddressMap;
    }
}
