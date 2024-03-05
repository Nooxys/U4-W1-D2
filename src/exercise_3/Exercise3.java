package exercise_3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi una parola");
        String word = scanner.nextLine();

//

        while (!word.equals("g")) {
           String[] wordRope = word.split("");
            System.out.println(Arrays.toString(wordRope));
             word = scanner.nextLine();
        };
        scanner.close();
    }
}
