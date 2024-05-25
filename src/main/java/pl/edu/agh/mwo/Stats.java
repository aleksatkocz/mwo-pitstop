package pl.edu.agh.mwo;

import java.util.List;

public class Stats {

    public static int countPits (List<PitStopEntry> pitStopData) {
        return pitStopData.size();
    }

    public static String longestPitStop (List<PitStopEntry> pitStopData) {
        double maxPitStopTime = 0;
        int personNumber = 0;

        for (PitStopEntry person : pitStopData) {
            if (person.getPit_duration() > maxPitStopTime) {
                maxPitStopTime = person.getPit_duration();
                personNumber = person.getDriver_number();
            }
        }

        return "Najdłuższy czas pit stopu wynosił: " + maxPitStopTime + " i należał do kierowcy o numerze: " + personNumber;

    }

}
