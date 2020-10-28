package Music;

import GenreEnumTypes.AccompanimentType;
import GenreEnumTypes.OperaMusicTypes;

import java.util.Arrays;

public class OperaMusic extends VocalClassicalMusic{
    private final OperaMusicTypes operaMusicTypes;
    private final String[] leadVocalistsNames;

    public OperaMusic(String songTitle, String composerName, String performerName, int durationInMinutes, int yearOfPublishing, String tonalityOfThePiece, AccompanimentType accompanimentType, OperaMusicTypes operaMusicTypes, String ... leadVocalistsNames) {
        super(songTitle, composerName, performerName, durationInMinutes, yearOfPublishing, tonalityOfThePiece, accompanimentType);
        this.operaMusicTypes = operaMusicTypes;
        this.leadVocalistsNames = leadVocalistsNames;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                "operaTypes=" + operaMusicTypes +
                ", leadVocalistsNames=" + Arrays.toString(leadVocalistsNames) +
                '}');
    }
}
