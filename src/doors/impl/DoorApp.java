package doors.impl;

import doors.impl.SpaceShuttleDoor;

public class DoorApp {
    public static void main(String[] args) {
        SpaceShuttleDoor spaceShuttleDoor = new SpaceShuttleDoor();
        spaceShuttleDoor.unlock();
        spaceShuttleDoor.lock();
    }
}
