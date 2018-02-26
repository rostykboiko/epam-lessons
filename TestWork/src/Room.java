import java.util.ArrayList;
import java.util.List;

public class Room {
    private String Label;
    private List<Device> deviceList;

    Room() {
        this.deviceList = new ArrayList<>();
    }

    Room(String label, List<Device> deviceList) {
        Label = label;
        this.deviceList = deviceList;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public List<Device> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(List<Device> deviceList) {
        this.deviceList = deviceList;
    }

    public void addDevice(Device device) {
        deviceList.add(device);
    }

    public int numDevice() {
        return deviceList.size();
    }

    public float getRoomWattagePerHour() {
        float totalConsumption = 0;
        if (deviceList != null) {
            for (Device device : deviceList) {
                totalConsumption += device.getWattage();
            }
        }
        return totalConsumption;
    }

    public float getRoomTotal() {
        float totalConsumption = 0;
        if (deviceList != null) {
            for (Device device : deviceList) {
                totalConsumption += device.getWattage() * device.getUpTime();
            }
        }
        return totalConsumption;
    }
}
