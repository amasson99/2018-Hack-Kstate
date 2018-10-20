package model;

import java.util.HashMap;
import java.util.Map;

class City {
    private final String cityName;
    private final Map<String, Building> built;
    private final Map<String, Building> unbuilt;

    City(String cityName) {
        this.cityName = cityName;
        this.built = new HashMap<>();
        this.unbuilt = new HashMap<>();
    }
}
