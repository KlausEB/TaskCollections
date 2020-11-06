package Music;

import GenreEnumTypes.InstrumentalClassicalMusicTypes;

public class InstrumentalClassicalMusic extends ClassicalMusic{
    private final InstrumentalClassicalMusicTypes instrumentalClassicalMusicTypes;

    public InstrumentalClassicalMusic(String songTitle, String composerName, String performerName, int durationInMinutes, int yearOfPublishing, String tonalityOfThePiece, InstrumentalClassicalMusicTypes instrumentalClassicalMusicTypes) {
        super(songTitle, composerName, performerName, durationInMinutes, yearOfPublishing, tonalityOfThePiece);
        this.instrumentalClassicalMusicTypes = instrumentalClassicalMusicTypes;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", instrumentalClassicalMusicTypes=" + instrumentalClassicalMusicTypes +
                '}');
    }
}
