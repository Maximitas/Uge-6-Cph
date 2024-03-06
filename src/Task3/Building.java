package Task3;

import java.util.ArrayList;
//Task 3.d, 3.e, 3.f
public class Building {
    private ArrayList<Room> rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    Building(ArrayList<Room> rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding){
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }
    public ArrayList<Room> getRooms(){
        return rooms;
    }
    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }
    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }
}