package Chapter9.Video89;

public enum Level {
    LOW("Low Level", 5),
    MEDIUM("Medium Level", 7),
    HIGH("Hight Level", 9);

    private final String description;
    private final double score;

    private Level(String _description, double _score) {
        this.description = _description;
        this.score = _score;
    }

    public String getDescription() {
        return this.description;
    }

    public double getScore() {
        return this.score;
    }
}
