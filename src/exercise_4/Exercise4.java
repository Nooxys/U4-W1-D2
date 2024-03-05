package exercise_4;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dammi int");
        int number = scanner.nextInt();
        for (int i = 0; i < number +1; i++) {
            System.out.println(number-i);
        }
    }
}
