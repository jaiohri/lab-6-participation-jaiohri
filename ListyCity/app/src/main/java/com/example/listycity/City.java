package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable {
    private String city;
    private String province;

    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    String getCityName() {
        return this.city;
    }

    String getProvinceName() {
        return this.province;
    }

    /**
     * Compares this City object to another based on city name lexicographically.
     *
     * @param o the object to compare to
     * @return a negative integer, zero, or a positive integer as this city name
     *         is less than, equal to, or greater than the specified city's name
     * @throws ClassCastException if the specified object is not a City
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }
}