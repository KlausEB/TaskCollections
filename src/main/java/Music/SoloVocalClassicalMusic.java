package Music;

import GenreEnumTypes.AccompanimentType;
import GenreEnumTypes.SingingVoiceTypes;
import GenreEnumTypes.SoloVocalClassicalMusicType;

public class SoloVocalClassicalMusic extends VocalClassicalMusic{
    private final String vocalistName;
    private final SingingVoiceTypes singingVoiceTypes;
    private final SoloVocalClassicalMusicType soloVocalClassicalMusicType;

    public SoloVocalClassicalMusic(String songTitle, String composerName, String performerName, int durationInMinutes, int yearOfPublishing, String tonalityOfThePiece, AccompanimentType accompanimentType, String vocalistName, SingingVoiceTypes singingVoiceTypes, SoloVocalClassicalMusicType soloVocalClassicalMusicType) {
        super(songTitle, composerName, performerName, durationInMinutes, yearOfPublishing, tonalityOfThePiece, accompanimentType);
        this.vocalistName = vocalistName;
        this.singingVoiceTypes = singingVoiceTypes;
        this.soloVocalClassicalMusicType = soloVocalClassicalMusicType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                "vocalistName='" + vocalistName + '\'' +
                ", singingVoiceTypes=" + singingVoiceTypes +
                ", soloVocalClassicalMusicType=" + soloVocalClassicalMusicType +
                '}');
    }
}
