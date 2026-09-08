package Chapter8.Lab06;

public interface Trainable {
    void attendTraining(String _topic);
    default void feedback() {
        System.out.println("Thanks for the training session!");
    }
}
