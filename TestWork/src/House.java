import java.util.ArrayList;

public class House {
    private BuildingType buildingType;
    private ArrayList<Room> roomList;

    House(BuildingType buildingType) {
        this.buildingType = buildingType;
        this.roomList = new ArrayList<Room>();
    }

    public House(BuildingType buildingType, ArrayList<Room> roomList) {
        this.buildingType = buildingType;
        this.roomList = roomList;
    }

    public float getTotalConsumedPower(){
        float totalConsumption = 0;
        if (roomList != null) {
            for (Room room : roomList) {

                totalConsumption += room.getRoomTotal();
            }
        }
        return totalConsumption;
    }

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public int numRooms() {
        return roomList.size();
    }

    public Room getRoom(int roomNumber) {
        return roomList.get(roomNumber);
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(BuildingType buildingType) {
        this.buildingType = buildingType;
    }

    public int getPrice(float consumedPower){
        return buildingType.getPrice(consumedPower);
    }
}
