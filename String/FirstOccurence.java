package String;

import java.util.Random;
import java.util.Scanner;

public class FirstOccurence {

	public static void main(String[] args) {

		// Array of words to be used in the game
        String[] words = {"EAT", "HELLO", "MONKEY", "APPLE", "UNDERSTANDING", "JAVAPROGRAMMING"};

        // Initialize total points
        int points = 0;

        // Create Random and Scanner objects
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Loop through each word in the words array
        for (String word : words) {
            // Convert the word to a char array to modify individual characters
            char[] wordArray = word.toCharArray();

            // Determine how many underscores should be placed based on word length
            int underscoresCount;
            if (word.length() <= 3) {
                underscoresCount = 1;  // 1 underscore for 3-letter words
            } else if (word.length() <= 6) {
                underscoresCount = 2;  // 2 underscores for 6-letter words
            } else if (word.length() <= 15) {
                underscoresCount = 3;  // 4 underscores for 15-letter words
            } else {
                underscoresCount = 4;  // Default for other lengths
            }

            // Randomly place underscores in the word
            int replaced = 0;
            while (replaced < underscoresCount) {
                int randomIndex = random.nextInt(word.length());  // Get a random index in the word

                // If the character at the randomIndex is not already an underscore, replace it
                if (wordArray[randomIndex] != '_') {
                    wordArray[randomIndex] = '_';  // Replace the letter with an underscore
                    replaced++;  // Increment the count of replaced letters
                }
            }

            // Display the word with blanks (underscores)
            System.out.println("Fill in the blanks: " + new String(wordArray));

            // Prompt the user to guess the correct word
            System.out.print("Enter the correct word: ");
            String userInput = scanner.nextLine().toUpperCase();  // Convert to uppercase for case-insensitive comparison

            // Check if the user entered the correct word
            if (userInput.equals(word)) {
                System.out.println("Correct! You get 1 point.");
                points++;  // Add 1 point for correct answer
            } else {
                System.out.println("Wrong! No points for this one.");
            }

            System.out.println();  // Add a blank line between rounds
        }

        // Close the scanner
        scanner.close();

        // Display final score
        System.out.println("You scored " + points + " out of " + words.length + ".");


	}

}
