package Chapter5;

public class Video45 {
    public static void main(String[] args) {
        String text1 = "hello";
        String text2 = new String("hello");
        System.out.println("So sanh == : " + (text1 == text2));
        System.out.println("So sanh voi equals : " + (text1.equals(text2)));
    }
}
