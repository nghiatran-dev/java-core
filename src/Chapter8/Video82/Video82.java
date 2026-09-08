package Chapter8.Video82;

public class Video82 {
    public static void main(String[] args) {
        Video video1 = new Video("Inception", 148);
        Song song1 = new Song("Shape Of You", "Ed Sheeran");
        Playable[] listMedia = {song1, video1};
        for (Playable media: listMedia) {
            media.Play();
            media.Pause();
        }
    }
}
