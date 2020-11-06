package Music;

import GenreEnumTypes.AccompanimentType;

abstract public class VocalClassicalMusic extends ClassicalMusic{
    private final AccompanimentType accompanimentType;

    public VocalClassicalMusic(String songTitle, String composerName, String performerName, int durationInMinutes, int yearOfPublishing, String tonalityOfThePiece, AccompanimentType accompanimentType) {
        super(songTitle, composerName, performerName, durationInMinutes, yearOfPublishing, tonalityOfThePiece);
        this.accompanimentType = accompanimentType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", accompanimentType=" + accompanimentType +
                '}');
    }
}
