import java.util.Random;
import java.util.Scanner;
public class guessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the guess game!");
        System.out.println("May I have your name: ");
        String name = scanner.next();
        System.out.println("Hello " + name);
        System.out.println("Shall we start?");
        System.out.println("\t1.yes");
        System.out.println("\t2.no");
        int response = scanner.nextInt();
        while (response != 1) {
            System.out.println("Shall we start?");
            System.out.println("\t1.yes");
            System.out.println("\t2.no");
            response = scanner.nextInt();
        }

        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;
        int count = 0;
        while (count < 5) {
            System.out.println("Please guess number between 0 and 20");
            int guess = scanner.nextInt();
            if (guess == randomNumber) {
                System.out.println("You Win!");
                System.exit(0);
            } else if (guess > randomNumber) {
                System.out.println("Guess lower");

            } else {
                System.out.println("Guess higher");
            }
            count++;
        }
        System.out.println("You Loss");

    }
        }

