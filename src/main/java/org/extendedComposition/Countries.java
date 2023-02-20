package org.extendedComposition;

public enum Countries {
    POLAND('P', "Poland"), CHINA('C', "China"),
    UNITED_STATES('U', "United States"), NETHERLANDS('N', "Netherlands"),
    FRANCE('F', "France");

    private final char countryCode;
    private final String label;

    Countries(char countryCode, String label) {
        this.countryCode = countryCode;
        this.label = label;
    }

    public char getCountryCode() {
        return countryCode;
    }

    public String getLabel() {
        return label;
    }
}
