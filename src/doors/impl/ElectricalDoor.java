package doors.impl;

import doors.Door;

public abstract class ElectricalDoor implements Door {
    protected void openDoor() {
        enableEngine();
        System.out.println("door is open");
    }

    protected void closeDoor() {
        enableEngine();
        System.out.println("door is closed");
    }

    void enableEngine() {
        System.out.println("Wwwwwzhzhzhzhz ");
    }
}
