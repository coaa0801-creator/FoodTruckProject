package com.skilldistillery.FoodTruckProject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FoodTruckApp {
	Scanner kb = new Scanner(System.in);
	FoodTruck[] allTrucks = new FoodTruck[5];
	static FoodTruckApp runSys = new FoodTruckApp();
	FoodTruck runApp = new FoodTruck();
	DecimalFormat round = new DecimalFormat("#.0");

	public static void main(String[] args) {
//		FoodTruckApp runSys = new FoodTruckApp();
		runSys.createTrucks();
		runSys.runApp();
		runSys.Goodbye();
	}

	private void runApp() {
		boolean keepGoing = true;
		while (keepGoing) {
			runSys.PrintMenu();
			String choice = kb.nextLine();
			choice = choice.toUpperCase();
			switch (choice) {
			case "LIST":
			case "LIST ALL":
			case "LIST ALL TRUCKS":
			case "1":
				for (int numTrucks = 0; numTrucks < allTrucks.length; numTrucks++) {
					if (allTrucks[numTrucks] == null) {
						break;
					}
					System.out.println(allTrucks[numTrucks].toString());
				}
				break;
			case "AVERAGE":
			case "AVG":
			case "SEE AVERAGE":
			case "AVERAGE RATING":
			case "SEE AVERAGE RATING":
			case "2":
				double average = runApp.getAverage();
				System.out
						.println("The average rating of the Food Trucks you have logged is: " + round.format(average));
				break;
			case "SEE HIGHEST RATED TRUCK":
			case "HIGHEST":
			case "SEE HIGHEST":
			case "HIGHEST RATED":
			case "SEE HIGHEST RATED":
			case "HIGHEST RATED TRUCK":
			case "3":
				int highRateTruck = runApp.getHighRating();
				System.out.println("Your highest rated truck is " + allTrucks[highRateTruck].toString());
				break;
			case "SEARCH":
			case "4":
				boolean search = true;
				while (search) {
					runSys.searchMenu();
					String searchChoice = kb.nextLine();
					searchChoice = searchChoice.toUpperCase();
					switch (searchChoice) {
					case "NAME":
					case "SEARCH BY NAME":
					case "SEARCH NAME":
					case "BY NAME":
					case "1":
						System.out.print("What is the name of the truck?   ");
						String searchTruck = kb.nextLine();
						for (int i = 0; i < allTrucks.length; i++) {
							String test = allTrucks[i].toString();
							if (test == null) {
								
							}
							if (test.contains(searchTruck)) {
								System.out.println(allTrucks[i].toString());
							}
							if (!test.contains(searchTruck)) {
							continue;
							}  
						}
						break;		
							
						
					case "RATING":
					case "BY RATING":
					case "2":
						System.out.print("What is the rating you gave the truck?   ");
						String searchRating = kb.nextLine();
						for (int i = 0; i < allTrucks.length; i++) {
							String test = allTrucks[i].toString(); 
							if (test.contains(searchRating)) {
								System.out.println(allTrucks[i].toString());
								
							}
							if (!test.contains(searchRating)) {
								continue;
							}  
						}
						break;
					case "3":
					case "BY CATEGORY":
					case "CATEGORY":
						System.out.print("What is the rating you gave the truck?   ");
						String searchMenuCategory = kb.nextLine();
						for (int i = 0; i < allTrucks.length; i++) {
							String test = allTrucks[i].toString(); 
							if (test.contains(searchMenuCategory)) {
								System.out.println(allTrucks[i].toString());
							} 
							if (!test.contains(searchMenuCategory)) {
								continue;
							}  
						}
						break;
					case "4":
					case "MAIN MENU":
					case "MENU":
					case "MAIN":
						search = false;
						break;
					case "5": case "QUIT":
						search = false;
						keepGoing = false;
					default: 	
					System.out.println("Please enter a valid search option");
					}
				}
				break;
			case "QUIT":
			case "5":
				keepGoing = false;
				break;
			default:
				System.out.println("Please enter a valid menu option");
			}
		}
	}

	private void searchMenu() {
		System.out.println("\n\n\n<================================>");
		System.out.println("|           SEARCH MENU          |");
		System.out.println("|                                |");
		System.out.println("|   1: By Name                   |");
		System.out.println("|   2: By Rating                 |");
		System.out.println("|   3: By Category               |");
		System.out.println("|   4: MAIN MENU                 |");
		System.out.println("|                                |");
		System.out.println("<================================>");

		// TODO Auto-generated method stub

	}

	private void createTrucks() {
		System.out.print("Hello welcome to the My Favorite Food Truck App. "
				+ "\n\nWhere you can log and recall your favorite Food Trucks based on your own ratings and the menu provided."
				+ "\n\nTo get started today. Please enter up to 5 new Food Trucks into the database."
				+ "\n\nAt the beginning of any entry you may enter \"QUIT\" to exit");// Opening Statement "Welcome"

		for (int numTrucks = 0; numTrucks < allTrucks.length; numTrucks++) {

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
			runApp.setAverage((double) userRating);
			runApp.setHighRating(userRating);

			FoodTruck truck = new FoodTruck(truckName, menuType, userRating, numTrucks);
			allTrucks[numTrucks] = truck;
			kb.nextLine();

		}

		// TODO Auto-generated method stub
	}

	private void PrintMenu() {
		System.out.println("\n\n\n<================================>");
		System.out.println("|            MAIN MENU           |");
		System.out.println("|                                |");
		System.out.println("|   1: List All Trucks           |");
		System.out.println("|   2: See Average Rating        |");
		System.out.println("|   3: See Highest Rated Truck   |");
		System.out.println("|   4: Search                    |");
		System.out.println("|   5: QUIT                      |");
		System.out.println("|                                |");
		System.out.println("<================================>");

	}

	private void Goodbye() {
		System.out.println("\n\n\n<================================>");
		System.out.println("|                                |");
		System.out.println("|                                |");
		System.out.println("|                                |");
		System.out.println("|            GOODBYE             |");
		System.out.println("|                                |");
		System.out.println("|                                |");
		System.out.println("|                                |");
		System.out.println("<================================>");
		// TODO Auto-generated method stub

	}

}
