import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(10);
        list.add(20);
        list.removeLast();
        LinkedListM mList = new LinkedListM();
        mList.addLast(1);
        mList.addLast(2);
        mList.addFirst(3);
        mList.removeLast();
        System.out.println(mList.contains(2));

        new Main().go();
    }

    public void go() {

        List<SongV2> songList = MockSongs.getSongsV2();
        System.out.println(songList);

        songList.sort((one , two ) -> one.getTittle().compareTo(two.getTittle()));
        System.out.println(songList);
//        Collections.sort(songList);

        songList.sort((one , two ) -> two.getTittle().compareTo(one.getTittle()));
        System.out.println(songList);
//        songList.sort(Comparator.reverseOrder());


        songList.sort((one , two ) -> one.getBpm() - (two.getBpm()));

//        TittleCompare tittleCompare = new TittleCompare();
//        songList.sort(tittleCompare);
//        System.out.println(songList);

//        ArtistCompare artistCompare = new ArtistCompare();
//        songList.sort(artistCompare);
//        System.out.println(songList);

//        songList.sort(new Comparator<SongV2>() {
//            public int compare(SongV2 one, SongV2 two) {
//                return String.valueOf(one.getBpm()).compareTo(String.valueOf(two.getBpm()));
//            }
//        });
        System.out.println(songList);
    }
}