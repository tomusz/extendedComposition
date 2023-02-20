package org.extendedComposition;

import java.util.List;

public class Market {
    String name;
    List<Country> countries; // min 3 each
    public Market(String name, List<Country> countries) {
        this.name = name;
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
