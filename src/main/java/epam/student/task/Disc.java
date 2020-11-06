package epam.student.task;

import Music.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Disc {
    private final List<? extends Music> musicDisc;

    public Disc(List<? extends Music> musicDisc) {
        this.musicDisc = musicDisc;
    }

    public int getTotalDurationInMinutes(){
        int totalDurationInMinutes = 0;
        for(Music music : musicDisc){
            totalDurationInMinutes += music.getDurationInMinutes();
        }
        return totalDurationInMinutes;
    }

    public <C extends Music> List<C> getCompositionsInRangeOfDuration(int minimumDuration, int maximumDuration){
        List<C> compositionsInRangeOfDuration = new ArrayList<>();
        for (Music music : musicDisc) {
            if(music.getDurationInMinutes() >= minimumDuration && music.getDurationInMinutes() <= maximumDuration){
                compositionsInRangeOfDuration.add((C)music);
            }
        }
        return compositionsInRangeOfDuration;
    }

    public void SortByMusicStyle(){
        musicDisc.sort(Comparator.comparing(o -> (o instanceof ClassicalMusic)).thenComparing(o -> o.getClass().getName()));
    }

    @Override
    public String toString() {
        return "musicDisc = " + musicDisc +
                '}';
    }
}
