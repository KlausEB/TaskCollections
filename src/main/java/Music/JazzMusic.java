package Music;

import GenreEnumTypes.JazzMusicTypes;

public class JazzMusic extends Music{
    private final JazzMusicTypes jazzMusicTypes;

    public JazzMusic(String songTitle, String composerName, String performerName, int durationInMinutes, int yearOfPublishing, JazzMusicTypes jazzMusicTypes) {
        super(songTitle, composerName, performerName, durationInMinutes, yearOfPublishing);
        this.jazzMusicTypes = jazzMusicTypes;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                "jazzMusicTypes=" + jazzMusicTypes +
                '}');
    }
}
