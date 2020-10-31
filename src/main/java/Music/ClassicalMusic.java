package Music;

abstract public class ClassicalMusic extends Music{
    private final String tonalityOfThePiece;

    public ClassicalMusic(String songTitle, String composerName, String performerName, int durationInMinutes, int yearOfPublishing, String tonalityOfThePiece) {
        super(songTitle, composerName, performerName, durationInMinutes, yearOfPublishing);
        this.tonalityOfThePiece = tonalityOfThePiece;
    }

    @Override
    public int compareTo(Music o) {
        if (o instanceof ClassicalMusic){
            return this.getClass().getName().compareTo(o.getClass().getName());
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                "tonalityOfThePiece='" + tonalityOfThePiece + '\'' +
                '}');
    }
}
