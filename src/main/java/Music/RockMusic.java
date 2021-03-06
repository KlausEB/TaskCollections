package Music;

import GenreEnumTypes.RockMusicTypes;

public class RockMusic extends Music{
    private final RockMusicTypes rockMusicTypes;
    private final String frontmanName;
    private final String albumTitle;

    public RockMusic(String songTitle, String composerName, String performerName, int durationInMinutes, int yearOfPublishing, RockMusicTypes rockMusicTypes, String frontmanName, String albumTitle) {
        super(songTitle, composerName, performerName, durationInMinutes, yearOfPublishing);
        this.rockMusicTypes = rockMusicTypes;
        this.frontmanName = frontmanName;
        this.albumTitle = albumTitle;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", rockMusicTypes=" + rockMusicTypes +
                ", frontmanName='" + frontmanName + '\'' +
                ", albumTitle='" + albumTitle + '\'' +
                '}');
    }
}
