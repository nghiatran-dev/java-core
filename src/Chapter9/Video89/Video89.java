package Chapter9.Video89;

public class Video89 {
    public static void main(String[] args) {
        System.out.println("=== Video 89 ===");
        System.out.printf("My level: [%s] with score: [%.2f]\n", Level.HIGH.getDescription(), Level.HIGH.getScore());

        for (Level myLevel: Level.values()) {
            System.out.printf("%s : %s\n", myLevel, myLevel.getDescription());
        }
    }
}
