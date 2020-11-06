package Music;

import GenreEnumTypes.AccompanimentType;
import GenreEnumTypes.ChoirCompositionType;
import GenreEnumTypes.ChoirMusicType;
import GenreEnumTypes.SingingVoiceTypes;

public class ChoirMusic extends VocalClassicalMusic{
    private final ChoirMusicType choirMusicType;
    private final ChoirCompositionType choirCompositionType;
    private final String conductorName;
    private final SingingVoiceTypes soloistSingingVoiceTypes;

    public ChoirMusic(String songTitle, String composerName, String performerName, int durationInMinutes, int yearOfPublishing, String tonalityOfThePiece, AccompanimentType accompanimentType, ChoirMusicType choirMusicType, ChoirCompositionType choirCompositionType, String conductorName, SingingVoiceTypes soloistSingingVoiceTypes) {
        super(songTitle, composerName, performerName, durationInMinutes, yearOfPublishing, tonalityOfThePiece, accompanimentType);
        this.choirMusicType = choirMusicType;
        this.choirCompositionType = choirCompositionType;
        this.conductorName = conductorName;
        this.soloistSingingVoiceTypes = soloistSingingVoiceTypes;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", choirMusicType=" + choirMusicType +
                ", choirCompositionType=" + choirCompositionType +
                ", soloistName='" + conductorName + '\'' +
                ", soloistSingingVoiceTypes=" + soloistSingingVoiceTypes +
                '}');
    }
}
