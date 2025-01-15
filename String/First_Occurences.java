package String;

import java.util.Random;
import java.util.Scanner;

public class First_Occurences {

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
            if (word.length() <= 4) {
                underscoresCount = 1;  // At least 1 underscore for short words
            } else if (word.length() <= 6) {
                underscoresCount = 2;  // 2 underscores for words between 5-6 letters
            } else if (word.length() <= 10) {
                underscoresCount = 3;  // 3 underscores for words between 7-10 letters
            } else {
                underscoresCount = 4;  // 4 underscores for longer words
            }

            // Randomly place underscores in the word
            int replaced = 0;
            int[] underscoreIndices = new int[underscoresCount];  // Store the indices of underscores
            while (replaced < underscoresCount) {
                int randomIndex = random.nextInt(word.length());  // Get a random index in the word

                // If the character at the randomIndex is not already an underscore, replace it
                if (wordArray[randomIndex] != '_') {
                    wordArray[randomIndex] = '_';  // Replace the letter with an underscore
                    underscoreIndices[replaced] = randomIndex;  // Store the index of the replaced letter
                    replaced++;  // Increment the count of replaced letters
                }
            }

            // Display the word with blanks (underscores)
            System.out.println("Fill in the blanks: " + new String(wordArray));

            // Sort the underscoreIndices array to guess the missing letters sequentially
            java.util.Arrays.sort(underscoreIndices);

            // Prompt the user to guess each missing letter sequentially
            for (int i = 0; i < underscoresCount; i++) {
                int index = underscoreIndices[i];  // Get the index of the underscore

                // Ask the user for the letter at that specific index (index + 1 for human-readable position)
                System.out.print("Enter the correct letter for position " + (index + 1) + ": ");
                char userInput = scanner.nextLine().toUpperCase().charAt(0);  // Get the first character

                // Check if the user entered the correct letter
                if (userInput == word.charAt(index)) {
                    System.out.println("Correct!");
                    wordArray[index] = userInput;  // Replace the underscore with the correct letter
                } else {
                    System.out.println("Wrong! The correct letter was " + word.charAt(index) + ".");
                }

                // Display the updated word after each attempt
                System.out.println("Current word: " + new String(wordArray));
            }

            // Check if the word is fully correct
            if (new String(wordArray).equals(word)) {
                System.out.println("Well done! You guessed the word.");
                points++;  // Add 1 point for fully correct word
            } else {
                System.out.println("You didn't complete the word correctly.");
            }

            System.out.println();  // Add a blank line between rounds
        }

        // Close the scanner
        scanner.close();

        // Display final score
        System.out.println("You scored " + points + " out of " + words.length + ".");

    }

}


