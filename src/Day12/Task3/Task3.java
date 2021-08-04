package Day12.Task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Linkin Park", 1996);
        MusicBand musicBand2 = new MusicBand("Imagine Dragons", 2008);
        MusicBand musicBand3 = new MusicBand("Beatles", 1960);
        MusicBand musicBand4 = new MusicBand("Wardruna", 2003);
        MusicBand musicBand5 = new MusicBand("Infected Mushroom", 1998);
        MusicBand musicBand6 = new MusicBand("Queen", 1970);
        MusicBand musicBand7 = new MusicBand("Muse", 1994);
        MusicBand musicBand8 = new MusicBand("Maroon 5", 1994);
        MusicBand musicBand9 = new MusicBand("Fall Out Boy", 2001);
        MusicBand musicBand10 = new MusicBand("My Chemical Romance", 2001);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(musicBand1);
        musicBands.add(musicBand2);
        musicBands.add(musicBand3);
        musicBands.add(musicBand4);
        musicBands.add(musicBand5);
        musicBands.add(musicBand6);
        musicBands.add(musicBand7);
        musicBands.add(musicBand8);
        musicBands.add(musicBand9);
        musicBands.add(musicBand10);

        System.out.println(groupsAfter2000(musicBands));
    }

    public static List <MusicBand> groupsAfter2000 (List<MusicBand> bands){
        List <MusicBand> bandsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands){
            if (band.getYear() >= 2000){
                bandsAfter2000.add(band);
            }
        }
        return bandsAfter2000;
    }
}
