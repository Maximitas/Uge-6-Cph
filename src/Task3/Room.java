package Task3;

//Task 3.a
public class Room {
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    //Task 3.b
    public Room(int numberOfDoors, int numberOfLamps, int numberOfWindows){
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }
    //Task 3.c
    int getNumberOfDoors(){
        return numberOfDoors;
    }
    int getNumberOfLamps(){
        return numberOfLamps;
    }
    int getNumberOfWindows(){
        return numberOfWindows;
    }
    void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }
    void setNumberOfLamps(int numberOfLamps){
        this.numberOfLamps = numberOfLamps;
    }
    void setNumberOfWindows(int numberOfWindows){
        this.numberOfWindows = numberOfWindows;
    }




}