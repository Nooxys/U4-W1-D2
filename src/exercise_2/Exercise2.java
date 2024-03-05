package exercise_2;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dammi int");
        int number = scanner.nextInt();
        System.out.println(toString(number));
        scanner.close();

    }

    public static String toString(int num) {
        return switch (num) {
            case 0 -> "Zero";
            case 1 -> "Uno";
            case 2 -> "Due";
            case 3 -> "Tre";
            default -> ("error");
        };
    }
}