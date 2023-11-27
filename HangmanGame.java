//Logan Plesko and Owen Minami, Word Guesser Game, Chat GPT created
import java.util.Scanner;
import java.util.Random;

public class HangmanGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] easyWords = {"cat", "dog", "sun", "moon", "tree", "bird", "fish", "book", "rose", "cake",
                "rain", "door", "lamp", "star", "boat", "frog", "corn", "hat", "bell", "frog"};
        String[] intermediateWords = {"computer", "keyboard", "programming", "elephant", "mountain", "football", "guitar", "ocean", "rainbow", "butterfly",
                "chocolate", "jazz", "puzzle", "xylophone", "voyage", "quasar", "quarantine", "boulevard", "quintessence", "zoologist",
                "helicopter", "effervescent", "kaleidoscope", "labyrinth", "exquisite", "extraordinary", "symphony", "benevolent", "magnificent", "umbrella",
                "serendipity", "harmonious", "phenomenal", "eccentric", "capricious", "luminous", "surreptitious", "quizzical", "zephyr", "majestic"};
        String[] masterWords = {"elephantine", "programming", "encyclopedia", "communication", "perpendicular", "championship", "trigonometric", "acceleration", "unbelievable", "persistence",
                "antidisestablishmentarianism", "incomprehensibilities", "pneumonoultramicroscopicsilicovolcanoconiosis", "electroencephalographically", "floccinaucinihilipilification", "supercalifragilisticexpialidocious", "antiestablishmentarianism", "counterdemonstration", "oversophisticatedness", "phosphatidylethanolamine",
                "disproportionableness", "indistinguishableness", "otorhinolaryngological", "pseudopseudohypoparathyroidism", "transubstantiationalist", "uncharacteristically", "anagrammatistically", "antiestablishmentarian", "counterdemonstrations", "disproportionablenesses",
                "hippopotomonstrosesquippedaliophobia", "pseudopseudohypoparathyroidism", "uncharacteristically", "anticonstitutional", "establishmentarianism", "antiestablishmentarian", "antiestablishmentarianism", "antivivisectionistic", "counterdemonstration", "counterdemonstrations"};

        int currentStreak = 0;
        int highestStreak = 0;

        while (true) {
            System.out.println("Welcome to Hangman!");

            System.out.println("Select difficulty level:");
            System.out.println("1. Easy (4-8 letters)");
            System.out.println("2. Intermediate (8-12 letters)");
            System.out.println("3. Master (12+ letters)");

            int difficultyChoice = scanner.nextInt();

            String[] selectedWordArray;
            int maxAttempts = 6;

            switch (difficultyChoice) {
                case 1:
                    selectedWordArray = easyWords;
                    break;
                case 2:
                    selectedWordArray = intermediateWords;
                    break;
                case 3:
                    selectedWordArray = masterWords;
                    maxAttempts += 2; // Increase attempts for Master difficulty
                    break;
                default:
                    System.out.println("Invalid choice. Exiting the game.");
                    return;
            }

            String selectedWord = selectedWordArray[random.nextInt(selectedWordArray.length)];
            int attempts = maxAttempts;
            char[] guessedLetters = new char[selectedWord.length()];
            boolean wordGuessed = false;

            while (attempts > 0 && !wordGuessed) {
                System.out.println("\nWord: " + displayWord(selectedWord, guessedLetters));
                System.out.println("Attempts remaining: " + attempts);
                System.out.print("Enter a letter: ");
                char guess = scanner.next().charAt(0);

                if (!isLetterGuessed(guess, guessedLetters)) {
                    if (containsLetter(guess, selectedWord, guessedLetters)) {
                        updateGuessedLetters(guess, selectedWord, guessedLetters);
                    } else {
                        attempts--;
                        printHangman(attempts);
                    }
                } else {
                    System.out.println("You already guessed that letter. Try again.");
                }

                if (isWordGuessed(selectedWord, guessedLetters)) {
                    wordGuessed = true;
                }
            }

            if (wordGuessed) {
                System.out.println("Congratulations! You guessed the word: " + selectedWord);
                currentStreak++;
                if (currentStreak > highestStreak) {
                    highestStreak = currentStreak;
                }
            } else {
                System.out.println("Sorry, you ran out of attempts. The word was: " + selectedWord);
                System.out.println("Your streak has been reset.");
                currentStreak = 0; // Reset streak on loss
            }

            System.out.println("Current Streak: " + currentStreak);
            System.out.println("Highest Streak: " + highestStreak);

            // Ask the user if they want to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing! Goodbye!");
                break; // Exit the loop if the user does not want to play again
            }
        }
    }

    private static String displayWord(String word, char[] guessedLetters) {
        StringBuilder display = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (isLetterGuessed(letter, guessedLetters)) {
                display.append(letter).append(" ");
            } else {
                display.append("_ ");
            }
        }

        return display.toString();
    }

    private static boolean containsLetter(char guess, String word, char[] guessedLetters) {
        for (int i = 0; i < word.length(); i++) {
            if (guessedLetters[i] == guess || word.charAt(i) == guess) {
                return true;
            }
        }
        return false;
    }

    private static boolean isLetterGuessed(char letter, char[] guessedLetters) {
        for (char c : guessedLetters) {
            if (c == letter) {
                return true;
            }
        }
        return false;
    }

    private static void updateGuessedLetters(char guess, String word, char[] guessedLetters) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                guessedLetters[i] = guess;
            }
        }
    }

    private static boolean isWordGuessed(String word, char[] guessedLetters) {
        for (char letter : word.toCharArray()) {
            if (!isLetterGuessed(letter, guessedLetters)) {
                return false;
            }
        }
        return true;
    }

    private static void printHangman(int attempts) {
        switch (attempts) {
            case 6:
                break;
            case 5:
                System.out.println("   O");
                break;
            case 4:
                System.out.println("   O");
                System.out.println("   |");
                break;
            case 3:
                System.out.println("   O");
                System.out.println("  /|");
                break;
            case 2:
                System.out.println("   O");
                System.out.println("  /|\\");
                break;
            case 1:
                System.out.println("   O");
                System.out.println("  /|\\");
                System.out.println("  / ");
                break;
            case 0:
                System.out.println("   O");
                System.out.println("  /|\\");
                System.out.println("  / \\");
                break;
        }
    }
}