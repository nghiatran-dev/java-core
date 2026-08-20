package chapter4;

public class Video32 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("For i = " + i);
        }

        int j = 1;
        while (j <= 5) {
            System.out.println("While lần thứ " + j);
            j++;
        }

        int k = 1;
        do {
            System.out.println("Do while lần thứ " + k);
            k++;
        } while (k <= 0);
    }
}
