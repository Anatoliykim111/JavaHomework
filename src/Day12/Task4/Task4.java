package Day12.Task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Mike Shinoda");
        members1.add("Brad Delson");
        members1.add("David Farrell");
        members1.add("Joe Han");
        members1.add("Robert Bourdon");

        List<String> members2 = new ArrayList<>();
        members2.add("Bryan May");
        members2.add("Roger Taylor");

        MusicBand musicBand1 = new MusicBand("Linkin Park", 1996, members1);
        MusicBand musicBand2 = new MusicBand("Queen", 1970, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();

    }
}
