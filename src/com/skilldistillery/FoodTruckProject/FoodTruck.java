package com.skilldistillery.FoodTruckProject;

public class FoodTruck {
	private String name;
	private String category;
	private int rating;
	private int uniqueID;
	
	
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
		return "FoodTruck " + uniqueID + ":  " + name + "\t\tServes:  " + category + "\t\tYou rated " + rating + " out of 10";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getHighRating() {
		return rating;
	}
	public void setHighRating(int rating) {
		this.rating = rating;
	}
	public int getAverage() {
		return rating;
	}
	public void setAverage(int rating) {
		this.rating = rating;
	}



}
