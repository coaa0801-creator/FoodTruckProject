package com.skilldistillery.FoodTruckProject;



public class FoodTruck {
	private static int MAX_TRUCKS = 5;
	private double [] trucks = new double [MAX_TRUCKS];
	private String name;
	private String category;
	private int rating;
	private int uniqueID;
	private int numTrucks = 0;
	private int highRateTruck = 0; 
	
	
	public FoodTruck(String truckName, String menuType, int userRating, int truckNumber) {
		name = truckName;
		category = menuType;
		rating = userRating;
		uniqueID = truckNumber + 1;
	 
	     
		
	}
	public FoodTruck() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return String.format("FoodTruck " + uniqueID + ":   %-15s  Serves: %-15s  You rated " + rating + " out of 10", name, category );
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getCategory() {
//		return category;
//	}
//	public void setCategory(String category) {
//		this.category = category;
//	}
	public int getHighRating() {
		return highRateTruck;
	}
	public void setHighRating(int rating) {
		int newHighRate = 0;
		int highRate = rating;
		for(int i=0; i < trucks.length; i++) {
			if (newHighRate < highRate) {
				newHighRate = highRate;
			if (trucks[i] > newHighRate) {
				highRateTruck = i;
			}
		}
		}
	}
	public double getAverage() {
	   double [] avgCopy = new double[trucks.length];
		double sum = 0;
	   for (int i=0; i < avgCopy.length; i++) {
		   sum = sum + trucks[i];
	   }
		 double average = sum / avgCopy.length;  
		return average;
	}
	public void setAverage(double rating) {
		 trucks[numTrucks] = rating;
		    numTrucks++;   
		
		
	}



}
