/*
 * Created by_Andi Sultan Al Ayyubi 21343080
 */

public class ElevatorTest {
    public static void main (String[] args){
        Elevator myElevator = new Elevator();
        myElevator.openDoor(); //memerintahkan membuka pintu
        myElevator.closeDoor(); //memerintahkan menutup pintu
        myElevator.goUp(); // akan naik satu lantai
        myElevator.goUp();
        myElevator.goUp();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goDown(); //akan turun satu lantai
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goDown();
        myElevator.setFloor(myElevator.TOP_FLOOR);
        myElevator.openDoor();
    }
}
//elevator test ini merupakan program yang akan menjalankan class elevator