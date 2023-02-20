package org.extendedComposition;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountriesProvider {

    public static List<Country> getCountriesByEnums(Countries... expectedCountries) {
        return Arrays.stream(expectedCountries)
                .map(x -> new Country(x.getLabel(), x.getCountryCode())).collect(Collectors.toList());
    }
}
