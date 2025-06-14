package OOP.Interfaces;

// library for randomize the words
import java.util.Random;
import java.util.Scanner;

public class WordGuessGame {
  private static final String[] WordsList = { "bright", "champs", "coding", "python", "student" };
  private String Word;
  private String guessedLetters;
  private int chances;

  // Construrcor to initialize the game
  public WordGuessGame() {
    Random random = new Random();
    Word = WordsList[random.nextInt(WordsList.length)];
    guessedLetters = "";
    chances = 10;
  }

  // Method to display the current state of the word
  private void displayWord() {
    System.out.println("--------------------------------");
    for (char letter : Word.toCharArray()) {
      if (guessedLetters.contains(String.valueOf(letter))) {
        System.out.print(letter + " ");
      } else {
        System.out.print("_ ");
      }
    }
    System.err.println();
  }

  private static Scanner scanner;

  // method to play the game
  public void play() {
    scanner = new Scanner(System.in);
    System.out.print("Please enter the player's name: ");
    String playerName = scanner.nextLine();

    System.out.println("--------------------------------");
    System.err.println("Okay! " + playerName + ", let's start guessing.");

    while (chances > 0) {
      System.out.print("\nGuess a letter of the word: ");
      String guess = scanner.nextLine().toLowerCase();

      if (guessedLetters.contains(guess)) {
        System.out.println("You already guessed that letter. Try another one.");
        continue;
      }

      guessedLetters += guess;
      displayWord();

      // Method to display the current state of the word
      if (Word.chars().allMatch(c -> guessedLetters.contains(String.valueOf((char) c)))) {
        System.out.println("--------------------------------");
        System.out.println("Congratulations! " + playerName + ", you guessed all the letters correctly.\n");
        System.out.println("The current word is: " + Word);
        break;
      }

      if (!Word.contains(guess)) {

        chances--;
        System.out.println("--------------------------------");
        System.out.println("Wrong guess. This letter is not in the word.");
        System.out.println("You have " + chances + " more guess chances.");
      }

      if (chances == 0) {
        System.out.println("--------------------------------");
        System.out.println("Sorry! Your number of chances are over. You lose!");
        System.out.println("The correct word was: " + Word);
      }
    }

  }

  public static void main(String[] args) {
    WordGuessGame game = new WordGuessGame();
    game.play();
  }
}
