public class Device implements Powered {
    private String label;
    private float wattage;
    private boolean poweredOn;
    private int upTime;

    public Device(String lable, float wattage, boolean poweredOn, int upTime) {
        this.label = lable;
        this.wattage = wattage;
        this.poweredOn = poweredOn;
        this.upTime = upTime;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public float getWattage() {
        return wattage;
    }

    public void setWattage(float wattage) {
        this.wattage = wattage;
    }

    public int getUpTime() {
        return upTime;
    }

    public void setUpTime(int upTime) {
        this.upTime = upTime;
    }

    @Override
    public boolean isTurnedOn() {
        return poweredOn;
    }

    @Override
    public void powerOn() {
        this.poweredOn = true;
    }

    @Override
    public void turnOff() {
        this.poweredOn = false;
    }
}
