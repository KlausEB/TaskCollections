package Music;

import GenreEnumTypes.JazzMusicTypes;

public class JazzMusic extends Music{
    private final JazzMusicTypes jazzMusicTypes;

    public JazzMusic(String songTitle, String composerName, String performerName, int durationInMinutes, int yearOfPublishing, JazzMusicTypes jazzMusicTypes) {
        super(songTitle, composerName, performerName, durationInMinutes, yearOfPublishing);
        this.jazzMusicTypes = jazzMusicTypes;
    }

    @Override
    public int compareTo(Music o) {
        if (o instanceof JazzMusic){
            if (this.equals(o)){
                return 0;
            }
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                "jazzMusicTypes=" + jazzMusicTypes +
                '}');
    }
}
