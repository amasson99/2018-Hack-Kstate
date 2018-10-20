package model;

public class World {
    private final City userCity;

    public World(String cityName) {
        this.userCity = new City(cityName);
    }

    public City getUserCity() {
        return userCity;
    }
}
