//Logan Plesko, APCS, Fall 2023, Math.random() vs. Random Objects
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Math();
        Math();
        Math();
        Random();
        Random();
        Random();
       
        // Generate and print the first three numbers using Math.random()(ChatGPT inspired)
        for (int i = 0; i < 3; i++) {
            int randomNum = Math();
            System.out.println(randomNum);
        }

        // Generate and print the bottom three numbers using Random object(ChatGPT inspired)
        for (int i = 0; i < 3; i++) {
            int randomNum = Random();
            System.out.println(randomNum);
        }
    }

    //  Generates a random number between 0 and 50 (inclusive) using Math.random()(ChatGPT inspired)
    public static int Math() {
        return (int) (Math.random() * 51); // Generates a random integer between 0 and 50 (inclusive)
    }

    // Generates a random number between 0 and 50 (inclusive) using Random object (ChatGPT inspired)
    public static int Random() {
        Random random = new Random();
        return random.nextInt(51); // Generates a random integer between 0 (inclusive) and 50 (inclusive)
    }
}