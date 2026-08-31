package Chapter6.Video59;

public class Video59 {
    public static void main(String[] args) {
        Student sv = new Student("Victor", "A");
        System.out.println("Info before update: " + sv.getName());
        sv.setName("Victor Tran");
        System.out.println("Info after update: " + sv.getName());
    }
}
