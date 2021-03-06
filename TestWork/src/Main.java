import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        House house = new House(new Flat());
        Room room = new Room();
        room.setLabel("Kitchen");
        Device device = new Device("Fridge", 260,true, 3606);
        room.addDevice(device);
        device = new Device("Microwave", 130, true, 15);
        room.addDevice(device);
        device = new Device("DishWasher", 170, false, 120);
        room.addDevice(device);
        house.addRoom(room);

        room.setLabel("BedRoom");
        device = new Device("TV", 60,true, 606);
        room.addDevice(device);
        device = new Device("PC", 130, true, 150);
        room.addDevice(device);
        device = new Device("Laptop", 30, false, 120);
        room.addDevice(device);
        house.addRoom(room);


        printRoomPower(room);
        printRoomWattPerHour(room);
        printHouseTotalCost(house);
        }

    private static void printRoomPower(Room room){
        System.out.print("Room: "
                + room.getLabel()
                + "\nConsumed Power: "
                + room.getRoomTotal()
                + "\n");

    }

    private static void printRoomWattPerHour(Room room){
        System.out.print("Room: "
                + room.getLabel()
                + "\nConsumed Power: "
                + room.getRoomWattagePerHour()
                + "\n");

//        Thread tr = new Thread(new Callable<>() {
//            @Override
//            public V call() throws Exception {
//                return null;
//            }
//        });
    }

    private static void printHouseTotalCost(House house){
        System.out.print("House Total: "
                + house.getBuildingType().getTypeLabel()
                + "\nConsumed Power: "
                + house.getTotalConsumedPower()
                + "\nTotal Price: "
                + house.getPrice(house.getTotalConsumedPower())
                + "\n");
    }





}
