package edu.westga.cs6311.managers;

import java.util.Scanner;

/**
 * Create variables, constructors, methods, getters, and setters for StringManager
 * @author Anna Blood
 * @version  10/07/22
 *
 */
public class StringManager {
	
	private Scanner inputScanner;
		
	/**
	 * Explicit implementation of the 0 parameter constructor
	 */
	public StringManager() {
		this.inputScanner = new Scanner(System.in);
	}
	
	/**
	 * Get number with comma removed, comma entered by user
	 * @return String with the comma removed
	 */
	public String getNumberWithoutComma() {
		System.out.println("Enter a number between 1,000 and 299,999 - please include the comma.");
		String userNumber = this.inputScanner.nextLine();
		return String.format("User entered number without the comma: %s", userNumber.replaceAll(",", ""));	
	}
	
	/**
	 * Get number with comma added in, no comma entered by user
	 * @return String with the comma added
	 */
	public String getNumberWithComma() {
		
		System.out.println("Enter a number between 1,000 and 299,999 - numbers only, no comma");
		String userNumber = this.inputScanner.nextLine();
		
		while (userNumber.contains(",")) {
			System.out.println("The number entered has a comma in it. Please try again.");
			System.out.println("Enter a number between 1,000 and 299,999 - numbers only, no comma");
			userNumber = this.inputScanner.nextLine();
		}
		
		return String.format("User entered number without the comma: %,.0f", Double.parseDouble(userNumber));	
	}
	
	/**
	 * Get the sentence with replaced letters
	 * @return A phrase with the replaced letter String
	 */
	public String getSentenceWithReplacedLetters() {
		
		System.out.println("Enter a saying or sentence: ");
		String userSentence = this.inputScanner.nextLine();
		
		while (userSentence.length() == 0) {
			System.out.println("User input is blank. Please try again. \nEnter a saying or sentence: ");
			userSentence = this.inputScanner.nextLine();
		}

		System.out.println("Enter a letter to be replaced:");
		String userReplaceLetter = this.inputScanner.nextLine();
		
		while (userReplaceLetter.length() != 1) {
			System.out.println("Please try again. \nEnter one single letter to be replaced: ");
			userReplaceLetter = this.inputScanner.nextLine();
		}

		System.out.println("Enter a letter you want " + userReplaceLetter + " replaced by:");
		String userReplacementLetter = this.inputScanner.nextLine();
		
		while (userReplacementLetter.length() != 1) {
			System.out.println("Please try again. \nEnter a letter you want " + userReplaceLetter + " replaced by:");
			userReplacementLetter = this.inputScanner.nextLine();
		}

		return String.format("The new phrase is: %s",
				this.replaceLettersInSentence(userSentence, userReplaceLetter, userReplacementLetter));
	}
	
	/**
	 * Replaces the letter(s) in a String
	 * @param userSentence Sentence to use
	 * @param userReplaceLetter Letter to replace
	 * @param userReplacementLetter Letter to replace with
	 * @return Sentence with replacements
	 */
	private String replaceLettersInSentence(String userSentence, String userReplaceLetter, String userReplacementLetter) {
		return userSentence.replaceAll(userReplaceLetter, userReplacementLetter);
	}
	
	/**
	 * Gets integer between 10 and 299,000, calculates the Collatz Conjecture, and number of iterations
	 * @return number of iterations for the conjecture 
	 */
	public String calculateCollatzConjecture() {
				
		System.out.println("Please enter a number between 10 and 299,999, with no commas");
		String inputNumber = this.inputScanner.nextLine();
		int number = Integer.valueOf(inputNumber);
		
		if (number < 10 || number >= 300000) {
			System.out.println("Invalid number. Please try again. \nPlease enter a number between 10 and 299,999, with no commas");
			inputNumber = this.inputScanner.nextLine();
			number = Integer.valueOf(inputNumber);
		}
		
		int numberOfIterations = 0;
		
		while (number != 1) {
			
			if (number != 1 && number % 2 == 0) {
				number /= 2;
				numberOfIterations++;
			}
			
			if (number != 1 && number % 2 != 0) {
				number = (number * 3) + 1;
				numberOfIterations++;
			}
		}
			
		return "The conjecture for the number " + inputNumber + " took " + numberOfIterations + " iterations to return 1";
	
	}
}