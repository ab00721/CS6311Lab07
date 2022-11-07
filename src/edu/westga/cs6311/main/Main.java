package edu.westga.cs6311.main;

import edu.westga.cs6311.managers.RentalManager;
import edu.westga.cs6311.managers.StringManager;

/**
 * Main class to call info from rental and string managers 
 * @author Anna Blood
 * @version  10/07/22
 */
public class Main {

	/**
	 * Application Entry
	 * @param args not used
	 */
	public static void main(String[] args) {
		RentalManager myRentalManager = new RentalManager();
		StringManager myStringManager = new StringManager();
		
		System.out.println(myRentalManager.geTotalNumberDaysRental());
		System.out.println(myRentalManager.getTotalAmountForRental());
		System.out.println(myRentalManager.getTotalRentalSummary());
		
		System.out.println(myStringManager.getNumberWithoutComma());
		System.out.println(myStringManager.getNumberWithComma());
		System.out.println(myStringManager.getSentenceWithReplacedLetters());
		System.out.println(myStringManager.calculateCollatzConjecture());
	}
}
