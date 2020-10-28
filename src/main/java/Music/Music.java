package Music;

abstract public class Music {
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
