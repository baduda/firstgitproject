package simple;

class Player {
    static double DEFAULT_INITIAL_TRACKING_NUMBER = 10;

    int trackNumber;
    String[] playList = new String[]{
            "Song 1",
            "Song 2",
            "Song 3",
            "Song 4",
            "Song 5",
            "Song 6",
            "Song 7"
    };

    public Player(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    void playSong() {
        System.out.println("Play track number: " + playList[trackNumber]);
    }

    void next() {
        if (trackNumber < playList.length - 1) {
            trackNumber++;
        } else {
            trackNumber = 0;
        }
    }

    void previous() {
        if (trackNumber > 0) {
            trackNumber--;
        } else {
            trackNumber = playList.length - 1;
        }
    }

    static String getLatestPlatformVersion() {
        return "1.5";
    }
}

public class Main {
    public static void main(String[] args) {
        String platformVersion = Player.getLatestPlatformVersion();
        double d = Player.DEFAULT_INITIAL_TRACKING_NUMBER;

        System.out.println("platformVersion = " + platformVersion);
        System.out.println("d = " + d);
    }
}
