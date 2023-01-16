package doors.impl;

public class SpaceShuttleDoor extends ElectricalDoor {
    @Override
    public void lock() {
        closeDoor();
        System.out.println("BlackBox: door is closed");
    }

    @Override
    public void unlock() {
        openDoor();
        System.out.println("BlackBox: door is open");
    }
}
