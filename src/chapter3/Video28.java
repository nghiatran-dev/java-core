package chapter3;

import java.util.Scanner;

public class Video28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your score: ");
        float score = sc.nextFloat();

        String ranking = "";
        if (score > 9) {
            ranking = "Excellent";
        } else if (score >= 8 && score < 9) {
            ranking = "Good";
        } else if (score >= 7 && score < 8) {
            ranking = "Quite";
        } else {
            ranking = "Medium";
        }

        // Muc dich xuong dong
        System.out.println();
        System.out.println("**********");
        System.out.printf("You are an %s student.", ranking);
        sc.close();
    }
}
