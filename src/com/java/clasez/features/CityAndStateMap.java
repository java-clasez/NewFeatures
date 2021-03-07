package com.java.clasez.features;

import java.util.HashMap;
import java.util.Map;

public class CityAndStateMap {
    public static void main(String[] args) {
        // City and State map
        HashMap<String, String> cityMap = new HashMap<>();

        // Populate the map
        cityMap.put("Fremont","CA");
        cityMap.put("San Jose", "CA");
        cityMap.put("Dallas", "TX");
        cityMap.put("Austin", "TX");
        cityMap.put("Phoenix", "AZ");
        cityMap.put("Las Vegas", "NV");
        cityMap.put("Chicago", "IL");

        System.out.println(cityMap);

        // For each 'city Entry' in map
        // - print the city (key)
        // - print the state (value)
        for(Map.Entry<String, String> entry: cityMap.entrySet()){
            System.out.println(entry.getKey() + " is in " + entry.getValue());
        }

    }
}
