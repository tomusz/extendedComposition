package org.extendedComposition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Car peugeot207RC = new Car(
                new Manufacturer(ManufacturerModel.PEUGEOT.getModel(), "207RC"), false,
                new Market(MarketName.TRANSPORT.name(), CountriesProvider.getCountriesByEnums(
                        Countries.CHINA, Countries.FRANCE, Countries.POLAND)),
                CarSegment.STANDARD.name(), Stream.of(new Dimension(404, 147, 600),
                        new Dimension(300, 150, 300), new Dimension(250, 100, 120))
                .collect(Collectors.toCollection(ArrayList::new)));

        Car bmvRoadster = new Car(
                new Manufacturer(ManufacturerModel.BMV.getModel(), "Z4 G29"), true,
                new Market(MarketName.TAXI.name(), CountriesProvider.getCountriesByEnums(
                        Countries.POLAND, Countries.UNITED_STATES, Countries.NETHERLANDS)),
                CarSegment.PREMIUM.name(), Stream.of(new Dimension(432, 180, 500),
                        new Dimension(100, 120, 100), new Dimension(542, 300, 700))
                .collect(Collectors.toCollection(ArrayList::new)));

        Car bmvI4 = new Car(
                new Manufacturer(ManufacturerModel.BMV.getModel(), "I4"), false,
                new Market(MarketName.TRANSPORT.name(), CountriesProvider.getCountriesByEnums(
                        Countries.NETHERLANDS, Countries.FRANCE, Countries.CHINA)),
                CarSegment.MEDIUM.name(), Stream.of(new Dimension(542, 300, 700),
                        new Dimension(562, 300, 800), new Dimension(602, 300, 700))
                .collect(Collectors.toCollection(ArrayList::new)));

        Car bmvBus = new Car(
                new Manufacturer(ManufacturerModel.BMV.getModel(), "Serii 3"), false,
                new Market(MarketName.BUS.name(), CountriesProvider.getCountriesByEnums(
                        Countries.FRANCE, Countries.NETHERLANDS, Countries.POLAND)),
                CarSegment.PREMIUM.name(), Stream.of(new Dimension(802, 400, 1000),
                        new Dimension(602, 300, 700))
                .collect(Collectors.toCollection(ArrayList::new)));

        Car fiat500 = new Car(
                new Manufacturer(ManufacturerModel.FIAT.getModel(), "500"), true,
                new Market(MarketName.TAXI.name(), CountriesProvider.getCountriesByEnums(
                        Countries.POLAND, Countries.CHINA, Countries.UNITED_STATES)),
                CarSegment.STANDARD.name(), Stream.of(new Dimension(404, 147, 600),
                        new Dimension(300, 150, 300), new Dimension(250, 100, 120))
                .collect(Collectors.toCollection(ArrayList::new)));

        Car fiatDucato = new Car(
                new Manufacturer(ManufacturerModel.FIAT.getModel(), "IV"), false,
                new Market(MarketName.TRANSPORT.name(), CountriesProvider.getCountriesByEnums(
                        Countries.CHINA, Countries.FRANCE, Countries.NETHERLANDS)),
                CarSegment.STANDARD.name(), Stream.of(new Dimension(432, 180, 500),
                        new Dimension(542, 300, 700), new Dimension(404, 147, 600))
                .collect(Collectors.toCollection(ArrayList::new)));

        Car hyundaiKona = new Car(
                new Manufacturer(ManufacturerModel.HYUNDAI.getModel(), "Kona"), true,
                new Market(MarketName.TRANSPORT.name(), CountriesProvider.getCountriesByEnums(
                        Countries.POLAND, Countries.UNITED_STATES, Countries.NETHERLANDS)),
                CarSegment.MEDIUM.name(), Stream.of(new Dimension(562, 300, 800),
                        new Dimension(602, 300, 700), new Dimension(542, 300, 700))
                .collect(Collectors.toCollection(ArrayList::new)));

        Car renaultAres = new Car(
                new Manufacturer(ManufacturerModel.RENAULT.getModel(), "Ares"), false,
                new Market(MarketName.BUS.name(), CountriesProvider.getCountriesByEnums(
                        Countries.CHINA, Countries.POLAND, Countries.UNITED_STATES)),
                CarSegment.STANDARD.name(), Stream.of(new Dimension(562, 300, 800),
                        new Dimension(602, 300, 700), new Dimension(802, 400, 1000))
                .collect(Collectors.toCollection(ArrayList::new)));

        Car daciaSpring = new Car(
                new Manufacturer(ManufacturerModel.DACIA.getModel(), "Spring"), true,
                new Market(MarketName.CARGO.name(), CountriesProvider.getCountriesByEnums(
                        Countries.CHINA, Countries.UNITED_STATES, Countries.FRANCE)),
                CarSegment.MEDIUM.name(), Stream.of(new Dimension(432, 180, 500),
                        new Dimension(542, 300, 700), new Dimension(404, 147, 600))
                .collect(Collectors.toCollection(ArrayList::new)));

        Car kiaXCeed = new Car(
                new Manufacturer(ManufacturerModel.KIA.getModel(), "XCeed"), true,
                new Market(MarketName.CARGO.name(), CountriesProvider.getCountriesByEnums(
                        Countries.FRANCE, Countries.POLAND, Countries.NETHERLANDS)),
                CarSegment.PREMIUM.name(), Stream.of(new Dimension(432, 180, 500),
                        new Dimension(562, 300, 800), new Dimension(404, 147, 600))
                .collect(Collectors.toCollection(ArrayList::new)));

        Car volkswagenPolo = new Car(
                new Manufacturer(ManufacturerModel.VOLKSWAGEN.getModel(), "Polo"), false,
                new Market(MarketName.BUSINESS.name(), CountriesProvider.getCountriesByEnums(
                        Countries.UNITED_STATES, Countries.POLAND, Countries.CHINA)),
                CarSegment.PREMIUM.name(), Stream.of(new Dimension(300, 150, 300),
                        new Dimension(250, 100, 120), new Dimension(100, 120, 100))
                .collect(Collectors.toCollection(ArrayList::new)));

        Car fordMustang = new Car(
                new Manufacturer(ManufacturerModel.FORD.getModel(), "Mustang II"), false,
                new Market(MarketName.BUSINESS.name(), CountriesProvider.getCountriesByEnums(
                        Countries.FRANCE, Countries.NETHERLANDS, Countries.UNITED_STATES)),
                CarSegment.PREMIUM.name(), Stream.of(new Dimension(300, 150, 300),
                        new Dimension(250, 100, 120), new Dimension(404, 147, 600))
                .collect(Collectors.toCollection(ArrayList::new)));

        Car opelMovano = new Car(
                new Manufacturer(ManufacturerModel.OPEL.getModel(), "Movano II"), true,
                new Market(MarketName.CARGO.name(), CountriesProvider.getCountriesByEnums(
                        Countries.POLAND, Countries.CHINA, Countries.NETHERLANDS)),
                CarSegment.STANDARD.name(), Stream.of(new Dimension(602, 300, 700),
                        new Dimension(562, 300, 800), new Dimension(1100, 450, 2000))
                .collect(Collectors.toCollection(ArrayList::new)));

        Car opelZafira = new Car(
                new Manufacturer(ManufacturerModel.OPEL.getModel(), "Zafira C"), false,
                new Market(MarketName.BUS.name(), CountriesProvider.getCountriesByEnums(
                        Countries.NETHERLANDS, Countries.CHINA, Countries.UNITED_STATES)),
                CarSegment.STANDARD.name(), Stream.of(new Dimension(602, 300, 700),
                        new Dimension(802, 400, 1000), new Dimension(542, 300, 700))
                .collect(Collectors.toCollection(ArrayList::new)));

        Car opelAstra = new Car(
                new Manufacturer((ManufacturerModel.OPEL.getModel()), "Astra L"), true,
                new Market(MarketName.BUSINESS.name(), CountriesProvider.getCountriesByEnums(
                        Countries.UNITED_STATES, Countries.POLAND, Countries.NETHERLANDS)),
                CarSegment.STANDARD.name(), Stream.of(new Dimension(404, 147, 600),
                        new Dimension(432, 180, 500), new Dimension(542, 300, 700))
                .collect(Collectors.toCollection(ArrayList::new)));

        List<Car> cars = Arrays.asList(peugeot207RC, bmvRoadster, bmvI4, bmvBus, fiat500, fiatDucato, hyundaiKona, renaultAres,
                daciaSpring, kiaXCeed, volkswagenPolo, fordMustang, opelAstra, opelMovano, opelZafira);

        Car.getRequiredCountriesWitCountryCode(cars, new Manufacturer(ManufacturerModel.BMV.getModel(), "Z4 G29"),
                true, 300);
    }
}