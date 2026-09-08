package Chapter8.Video82;

public class Video implements Playable {
    private String title;
    private int duration;

    public Video(String _title, int _duration) {
        this.title = _title;
        this.duration = _duration;
    }

    @Override
    public void Play() {
        System.out.printf("Playing video: %s (%d) mins\n", this.title, this.duration);
    }

    @Override
    public void Pause() {
        System.out.printf("Pausing video: %s\n", this.title);
    }
}
