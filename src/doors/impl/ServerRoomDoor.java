package doors.impl;

public class ServerRoomDoor extends ElectricalDoor {
    @Override
    public void lock() {
        System.out.println("Access is allowed");
        closeDoor();
    }

    @Override
    public void unlock() {
        System.out.println("Access is allowed");
        openDoor();
    }
}
