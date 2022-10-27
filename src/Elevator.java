/*
 * Created by_Andi Sultan Al Ayyubi 21343080
 */

public class Elevator {
    public boolean doorOpen = false; //menunjukan boolean pintu tidak terbuka
    public int currentFloor = 5; //menunjukan sedang di lantai 5
    public final int TOP_FLOOR = 5; //lantai paling atas yaitu lantai 5
    public final int BOTTOM_FLOOR = 1; //lantai paling bawah yaiut lantai 1

    public void openDoor(){
        System.out.println("Opening door.");
        doorOpen = true;
        System.out.println("Door is.");
    } //method untuk pintu terbuka

    public void closeDoor() {
        System.out.println("Closing door.");
        doorOpen = false;
        System.out.println("Door is close.");
    } //method untuk pintu tertutup

    public void goUp() {
        System.out.println("Going up one floor");
        currentFloor++;
        System.out.println("Floor : " + currentFloor);
    } //method untuk naik satu lantai

    public void goDown() {
        System.out.println("Going down one floor");
        currentFloor--;
        System.out.println("Floor : " + currentFloor);
    } //method untuk turun satu lanti

    public void setFloor (int desiredFloor) {
        while(currentFloor != desiredFloor) {
            if(currentFloor < desiredFloor) {
                goUp();
            }
            else {
                goDown();
            }
        }
    }

    public int getFloor(){
        return currentFloor;
    }

    public boolean checkDoorStatus() {
        return doorOpen;
    }
}
//program elevator ini akan jalan dengan program elevator test