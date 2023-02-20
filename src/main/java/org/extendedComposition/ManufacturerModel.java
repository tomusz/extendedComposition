package org.extendedComposition;

public enum ManufacturerModel {
    PEUGEOT("Peugeot"), BMV("Bmv"), FIAT("Fiat"), HYUNDAI("Hyundai"), RENAULT("Renault"), DACIA("Dacia"), KIA("Kia"),
    VOLKSWAGEN("Volkswagen"), FORD("Ford"), OPEL("Opel");
    private String model;

    ManufacturerModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
