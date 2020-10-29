package epam.student.task;

import Music.Music;

import java.util.ArrayList;
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
        musicDisc.sort(Music.getMusicStyle());
    }

    @Override
    public String toString() {
        return "musicDisc=" + musicDisc +
                '}';
    }
}
