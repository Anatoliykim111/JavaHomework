package Day12.Task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Mike Shinoda", 44));
        members1.add(new MusicArtist("Brad Delson", 43));
        members1.add(new MusicArtist("David Farrell", 44));
        members1.add(new MusicArtist("Joe Han", 44));
        members1.add(new MusicArtist("Robert Bourdon", 42));


        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Bryan May", 74));
        members2.add(new MusicArtist("Roger Taylor", 72));

        MusicBand musicBand1 = new MusicBand("Linkin Park", 1996, members1);
        MusicBand musicBand2 = new MusicBand("Queen", 1970, members2);


        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
