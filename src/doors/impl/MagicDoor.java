package doors.impl;

enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY
}

public class MagicDoor extends MechanicalDoor {

    @Override
    public void lock() {
        switch (getDayOfWeek()) {
            case MONDAY -> {
                System.out.println("Lock door");
            }
            case TUESDAY -> {
                System.out.println("Kill visitor");
            }
            default -> {
                System.out.println("Keep silence");
            }
        }
    }

    @Override
    public void unlock() {
        if (getDayOfWeek() == DayOfWeek.WEDNESDAY) {
            System.out.println("lock door");
        }
    }

    private DayOfWeek getDayOfWeek() {
        return DayOfWeek.TUESDAY;
    }
}
