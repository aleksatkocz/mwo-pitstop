package pl.edu.agh.mwo;

public class PitStopEntry {

    private int session_key;
    private int meeting_key;
    private String date;
    private int driver_number;
    private double pit_duration;
    private int lap_number;

    public int getSession_key() {
        return session_key;
    }

    public int getMeeting_key() {
        return meeting_key;
    }

    public String getDate() {
        return date;
    }

    public int getDriver_number() {
        return driver_number;
    }

    public double getPit_duration() {
        return pit_duration;
    }

    public int getLap_number() {
        return lap_number;
    }
}
