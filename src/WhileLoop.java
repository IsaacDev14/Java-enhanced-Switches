import java.util.Random;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Guess your LUCKY number (choose 1-100)");

        int guesses;
        int attempts= 0;
        int min = 1;
        int max = 100;
        int randomNUmber = random.nextInt(min, max + 1);

        do {
            System.out.print("Enter your Lucky number: ");
            guesses = scanner.nextInt();
            attempts ++;

            if (guesses < randomNUmber){
                System.out.println("Your Guess was too LOW! try a higher number.");
            } else if (guesses > randomNUmber) {
                System.out.println("Your Guess was too HIGH! try a lower number.");

            }

        } while (guesses != randomNUmber);

        System.out.println("You Won🎉! the lucky number is: " + randomNUmber );
        System.out.println("You made " + attempts + " attempts");



        scanner.close();

    }
}
