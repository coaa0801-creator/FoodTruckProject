package com.skilldistillery.FoodTruckProject;

public class FoodTruck {
	private String name;
	private String category;
	private int rating;
	private int assignID = 0;
	private int uniqueID;
	
	
	public FoodTruck(String truckName, String menuType, int userRating) {
		name = truckName;
		category = menuType;
		rating = userRating;
		++assignID;
		uniqueID = assignID;
		
	}
	@Override
	public String toString() {
		return "FoodTruck " + uniqueID + ":  " + name + "\tServes:  " + category + "\tYou rated " + rating + " out of 10";
	}
	


}
