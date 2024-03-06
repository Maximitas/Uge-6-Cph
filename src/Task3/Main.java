package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //Task 3.g, 3.h
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new Room(2, 3, 6));
        rooms.add(new Room(1,12,3));
        rooms.add(new Room(4, 2, 1));
        //Task 3.i
        Building building = new Building(rooms, 4,2,false);

        int total = countLampsBuilding(building);
        System.out.println(total);

        isNormal(building);

    }

    //Task 3.j
    private static int countLampsBuilding(Building building){
        int total = 0;
        for (Room room : building.getRooms()){
            total += room.getNumberOfLamps();

        }


        return total;
    }

    //Task 3.k
    private static boolean isNormal(Building building){
        if(building.getRooms().size() >= building.getNumberOfFloors()){
            System.out.println("This is an odd building");
            return false;
        } else {
            System.out.println("This building is normal");
            return true;
        }
    }
}