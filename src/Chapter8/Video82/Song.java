package Chapter8.Video82;

public class Song implements Playable {
    private String title;
    private String artist;

    public Song(String _title, String _artist) {
        this.title = _title;
        this.artist = _artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public void Play() {
        System.out.printf("Playing song: %s by %s\n", this.title, this.artist);
    }

    @Override
    public void Pause() {
        System.out.printf("Pausing song: %s\n", this.title);
    }
}
