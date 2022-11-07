package edu.westga.cs6311.managers;

/**
 * Create variables, constructors, methods, getters, and setters for Rentals 
 * @author Anna Blood
 * @version  10/07/22
 *
 */
public class RentalManager {
	private int numberOfDays;
	private double pricePerDay;
	
	/**
	 * Explicit implementation of the 0 parameter constructor
	 */
	public RentalManager() {
		this.numberOfDays = this.generateRandomDays();
		this.pricePerDay = this.generateAmountPerDay();
	}
	
	/**
	 * Get a String message for number of days Rental
	 * @return the message for the number of days a rental is for
	 */
	public String geTotalNumberDaysRental() {
		return String.format("Total number of days for this rental: %s",
				this.getNumberOfDays());
	}
	
	/**
	 * Get String message for cost of the rental per day
	 * @return the message for the rental per day
	 */
	public String getTotalAmountForRental() {
		return String.format("Total amount per day for this rental: $%.2f",
				this.getPricePerDay());
	}
	
	/**
	 * Generate a random number of days
	 * @return return a number of days between 3 - 10
	 */
	private int generateRandomDays() {
		int days = 0;
		while (days < 3) {
			days = (int) Math.ceil(Math.random() * 10);
		}
		return days;
	}
	
	/**
	 * Generate a random cost per day
	 * @return random cost between 15.00 and 100.00 with 10% off more than 6 days
	 */
	private double generateAmountPerDay() {
		double cost = 0;
		
		while (cost < 15) {
			 cost = Math.random() * 100;
		}	 
		
		if (Integer.compare(this.getNumberOfDays(), 6) > 0) {
			cost = cost - (cost * 0.1);
		}
		
		return cost;	
	}	
	
	/**
	 * Calculates total cost of rental
	 * @return total cost of rental 
	 */
	private double getTotalCostforRental() {
		double total = (this.getNumberOfDays() * this.getPricePerDay());
		return total;
	}
	
	/**
	 * Get string message for number of days and total cost for the rental
	 * @return the message for rental days and cost total
	 */
	public String getTotalRentalSummary() {
		return String.format("Total number of days for this rental: " + this.getNumberOfDays() + " with a total cost of: $%.2f", 
				this.getTotalCostforRental());
	}
	
	/**
	 * Getter for numberOfDays
	 * @return the numberOfDays
	 */
	public int getNumberOfDays() {
		return this.numberOfDays;
	}
	
	/**
	 * Setter for numberOfDays
	 * @param nNumberOfDays to set new numberOfDays
	 */
	public void setNumberOfDays(int nNumberOfDays) {
		this.numberOfDays = nNumberOfDays;
	}
	
	/**
	 * Getter for pricePerDay
	 * @return the pricePerDay
	 */
	public double getPricePerDay() {
		return this.pricePerDay;
	}
	
	/**
	 * Setter for pricePerDay
	 * @param nPricePerDay to set new pricePerDay
	 */
	public void setPricePerDay(double nPricePerDay) {
		this.pricePerDay = nPricePerDay;
	}
}