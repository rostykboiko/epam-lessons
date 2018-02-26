interface BuildingType {
    String getTypeLabel();

    int getElectricityCost();

    int getPrice(float consumedPower);
}

class Flat implements BuildingType {
    private String label = "Flat";
    private int pricePerKWatt = 168;

    @Override
    public String getTypeLabel() {
        return label;
    }

    @Override
    public int getElectricityCost() {
        return pricePerKWatt;
    }

    @Override
    public int getPrice(float consumedPower) {
        return (int) consumedPower * pricePerKWatt;

    }
}

class Cottage implements BuildingType {
    private String label = "Cottage";

    private int pricePerKWatt = 208;

    @Override
    public String getTypeLabel() {
        return label;
    }

    @Override
    public int getElectricityCost() {
        return pricePerKWatt;
    }

    @Override
    public int getPrice(float consumedPower) {
        return (int) consumedPower * pricePerKWatt;

    }
}

class BusinessPrice implements BuildingType {
    private String label = "BusinessPrice";

    private int pricePerKWatt = 425;

    @Override
    public String getTypeLabel() {
        return label;
    }

    @Override
    public int getElectricityCost() {
        return pricePerKWatt;
    }

    @Override
    public int getPrice(float consumedPower) {
        return (int) consumedPower * pricePerKWatt;

    }
}

