import java.util.Comparator;

public class TittleCompare implements Comparator<SongV2> {

    public int compare(SongV2 o1, SongV2 o2) {
        return o1.getTittle().compareTo(o2.getTittle());
    }
}
