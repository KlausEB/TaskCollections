package Music;

import java.util.Comparator;

abstract public class Music implements Comparable<Music>{
    private final String songTitle;
    private final String composerName;
    private final String performerName;
    private final int durationInMinutes;
    private final int yearOfPublishing;

    public Music(String songTitle, String composerName, String performerName, int durationInMinutes, int yearOfPublishing) {
        this.songTitle = songTitle;
        this.composerName = composerName;
        this.performerName = performerName;
        this.durationInMinutes = durationInMinutes;
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "songTitle='" + songTitle + '\'' +
                ", composerName='" + composerName + '\'' +
                ", performerName='" + performerName + '\'' +
                ", durationInMinutes=" + durationInMinutes +
                ", yearOfPublishing=" + yearOfPublishing +
                '}';
    }

    @Override
    public int compareTo(Music o) {
        return this.getClass().getName().length() - o.getClass().getName().length();
    }

    public static Comparator<Music> getMusicStyle(){
        return new Comparator<Music>() {
            @Override
            public int compare(Music o1, Music o2) {
                return o1.compareTo(o2);
            }
        };
    }

}
