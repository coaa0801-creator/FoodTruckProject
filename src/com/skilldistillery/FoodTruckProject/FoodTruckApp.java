package com.skilldistillery.FoodTruckProject;

import java.util.Scanner;

public class FoodTruckApp {
	Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
		FoodTruckApp runSys = new FoodTruckApp();
		runSys.Run();
		runSys.PrintMenu();
	}
	
	private void Run() {
		System.out.print("Hello welcome to the My Favorite Food Truck App. "
				+ "\n\nWhere you can log and recall your favorite Food Trucks based on your own ratings and the menu provided."
				+ "\n\nTo get started today. Please enter up to 5 new Food Trucks into the database."
				+ "\n\nAt the beginning of any entry you may enter \"QUIT\" to exit");//Opening Statement "Welcome"
	
		FoodTruck[] allTrucks = new FoodTruck[5];
		for (int numTrucks = 0; numTrucks < allTrucks.length; numTrucks++  ){
		System.out.println("\n\n------" + "ENTRY " + (numTrucks + 1) + "------");
		System.out.print("What was the name of the Food Truck?   ");
		String truckName = kb.nextLine();
		if (truckName.equalsIgnoreCase("QUIT")) {
			break;
		}
		System.out.print("\nWhat type of food was on the menu?   ");
		String menuType = kb.nextLine();
		System.out.print("\nHow would you rate your experience? (Scale 1-10)   ");
		int userRating = kb.nextInt();
		
		FoodTruck truck = new FoodTruck(truckName, menuType, userRating);
		allTrucks[numTrucks] = truck;
		kb.nextLine();
		
		
		
		
		
	

		}
		
		// TODO Auto-generated method stub
	}
	
	
	private void PrintMenu () {
		System.out.println("<================================>");
		System.out.println("|            MAIN MENU           |");
		System.out.println("|                                |");
		System.out.println("|   1: List All Trucks           |");
		System.out.println("|   2: See Average Rating        |");
		System.out.println("|   3: See Highest Rated Truck   |");
		System.out.println("|   4: QUIT                      |");
		System.out.println("|                                |");
		System.out.println("<================================>");
		
	}

}
