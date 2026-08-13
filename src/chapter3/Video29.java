package chapter3;

import java.util.Scanner;

public class Video29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your average score: ");
        float average = sc.nextFloat();
        boolean isInvalid = false;

        String ranking = "";
        if (average >= 9 && average <= 10) {
            ranking = "Excellent";
        } else if (average >= 8 && average < 9) {
            ranking = "Good";
        } else if (average >= 6.5 && average < 8) {
            ranking = "Quite";
        }  else if (average >= 0 && average < 6.5) {
            ranking = "Medium";
        } else {
            ranking = "Not invalid";
            isInvalid = true;
        }

        // Muc dich xuong dong
        System.out.println();
        System.out.println("---------------------------------------");
        if (isInvalid) {
            System.out.printf(ranking);
        } else {
            System.out.printf("Academic performance rating: %s", ranking);
        }
        sc.close();
    }
}
