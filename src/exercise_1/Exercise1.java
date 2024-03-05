package exercise_1;

public class Exercise1 {
    public static void main(String[] args) {

        System.out.println(stringaPariDispari("ciao"));
        System.out.println(annoBisestile(2024));
    }

    public static boolean stringaPariDispari(String word) {
        if ( word.length() % 2 == 0 ) {return true ;}
        else { return  false ;}
    }

    public static boolean annoBisestile(int num) {
        if ( num % 4 == 0 ) {
            return true;}
        else { return false;}
        }
    }

