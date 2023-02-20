package org.extendedComposition;

import java.util.ArrayList;
import java.util.List;

public class Car {
    Manufacturer manufacturer;
    boolean isAutomatedGear;
    Market market;
    String segment;
    ArrayList<Dimension> dimensions;

    public Car(Manufacturer manufacturer, boolean isAutomatedGear, Market market, String segment,
               ArrayList<Dimension> dimensions) {
        this.manufacturer = manufacturer;
        this.isAutomatedGear = isAutomatedGear;
        this.market = market;
        this.segment = segment;
        this.dimensions = dimensions;
    }

    public static void getRequiredCountriesWitCountryCode(List<Car> carList, Manufacturer manufacturer,
                                                          boolean isAutomatedGear, int trunkCapacity) {
        List<Car> collect = carList.stream().filter(x -> x.manufacturer.getModel().equals(manufacturer.getModel()))
                .filter(x -> x.isAutomatedGear == isAutomatedGear)
                .filter(x -> x.dimensions.stream()
                        .anyMatch(y -> y.getTrunkCapacity() > trunkCapacity)).toList();
        collect.forEach(x -> x.market.countries
                .forEach(y -> System.out.printf("%s - %s%n", y.countryName, y.countrySign)));
    }
}