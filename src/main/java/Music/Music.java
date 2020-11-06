package Music;

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

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    @Override
    public int compareTo(Music o) {
        return getClass().getName().equals(o.getClass().getName()) ? 0 : this.getYearOfPublishing() - o.getYearOfPublishing();
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
}
