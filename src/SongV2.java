public class SongV2 implements Comparable<SongV2> {
    private String tittle;
    private String artist;
    private int bpm;

    public int compareTo(SongV2 o) {
        return tittle.compareTo(o.getTittle());
    }

    SongV2(String tittle, String artist, int bpm) {
        this.tittle = tittle;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTittle() {
        return tittle;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }

    public String toString() {
        return tittle;
    }
}
