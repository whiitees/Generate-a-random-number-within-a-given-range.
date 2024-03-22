import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Podaj dolny zakres: ");
        int minimum = scanner.nextInt();

        System.out.print("Podaj górny zakres: ");
        int maksimum = scanner.nextInt();

        int wylosowana = losowaLiczba(minimum, maksimum, random);
        System.out.println("Wylosowana liczba: " + wylosowana);
    }

    public static int losowaLiczba(int minimum, int maksimum, Random random) {
        return random.nextInt(maksimum - minimum + 1) + minimum;
    }
}
