## ![Logo](http://skilldistillery.com/downloads/sd_logo.jpg) Aaron Cottrell
## Food Truck Project

## Overview
The purpose of this program is to open by taking user input about Food Trucks to store for later recall by the user. Entries will be stored and are recalled by the user using the menu function. Options include; Seeing all trucks at the same time (Name, rating and menu category) finding the average of all Truck ratings and finding the highest rated truck. We also recently added search functionality where the user may search a specific truck or trucks based on name, rating or menu category.

## Step by Step (Short Version)
1. Welcome ->
2. Choose to create a Food Truck entry or choose to QUIT

  2a. Repeat until 5 trucks entered or QUIT to Main menu

3. Choose a data recall preference from the menu

  3a If you choose to search (4) -> Choose search type and enter search
  
4. Navigate and choose recall data as long as you desire
5. QUIT to exit the Programs

## Walkthrough (Long Version)

Upon program launch, the user is prompted to create, at most, 5 Food Truck ratings. As the user is entering their data, the entries are creating FoodTruck objects to be stored in multiple arrays. The ratings are also being "Set" for calculations to be returned by the FoodTruck class. The user may QUIT the creation of a Food Truck entry at the beginning of an entry by typing the word "QUIT". This action is not case sensitive. If a user chooses to quit creating Food Truck entries before they reach the maximum amount, each of the Main Menu features is adjusted to account for how many entries the user actually created rather than solely based of the maximum number they could have created.

Once a user has entered the number of Food Trucks they desired, the main program function begins. The user can interact with the Main Menu by choosing the number assigned to the Menu item or by typing a select number of variations on the Menu items alpha-name. Once again the user does not need to worry about case sensitive entries. This is where the program does the heavier lifting already placed in the setters during the createTrucks method. The user is typing single requests but the switch is doing all the navigation and recalling variables from the FoodTruck class from its public getter methods.

Should the user choose the search function from the Main Menu, they are taken to a search menu where they must choose a filter and then a value to search. The value is compared to the toString() method in the FoodTruck class to find exact matches which are then printed to the screen.

Once the user has reached the Main Menu they may quit by typing QUIT. The user may also do this from the Search Menu. If the user chooses to QUIT. The program displays a goodbye message and terminates.  

## Struggles
I found myself face to face with arrays once again. I've always understood how to create them and what the purpose is but I've struggled mightily with the actual use and getting the output and storage that I want from them. I know the experience helps but I still can't say with a lot of confidence with what is actually going on. Monkey type, program work. Essentially saying that while I got it to function, I don't really understand fully why.

Other than that I probably struggled more with additional features I was playing with than the assigned project. I had a tough time getting the search function to work. A switch inside a switch isn't necessarily the most readable code, especially when the cases all have 2 or 3 if statements. If statements possibly being something I overused but I'm really comfortable with their simplicity, so it works. I wanted to add a feature where the user could go back and enter more trucks if they didn't enter the max at the beginning.  It also would have been fun to allow for Truck deletion/replacement. Abandoned that due to time constraints since it wasn't a graded feature. Also wanted to list duplicate max values and had an idea but never got around to it. Wanted to add a print out of all Food Trucks that were rated higher than the average and/or higher than the rating the user searched for. I also wanted the user to be able to QUIT (aka go to Main Menu) at any point of the makeTrucks method rather than just at the beginning of an entry. Overall, while I got the project finished "as outlined", I feel I left a lot on the table that I wanted to do with it.

I still want to figure out what to do when we have a scanner searching for an int or double and the user enters a string. I understand I could just use nextLine() but when you're looking for a int or a double value getting and casting a string variable doesn't seem efficient. I'd like to be able to have the scanner recognize that the value is not an int or double and put an error message up, rather than termination of the program. Crashing the program because a user fat fingered a button on the keyboard doesn't seem like quality app function.

## Lessons Learned

Balance is hard. I'm coming out of a work environment that sucked up all my time and never got to see my family because of it. So the priority is always to make sure I spend more time with them. I think that contributed to a little less allocation of time to the project this week. That's OK, because I was still able to complete the project but that little sour taste of not doing what I envisioned to with it is a bit frustrating.

For the project itself I became a lot more comfortable with class variables and objects. That made life a lot easier when calling duplicate variables or when using the created array in multiple methods.

## Course Material Used
Arrays
Objects and Object Initialization
Getters and Setters
toString()'s
If Statements
While and For Loops
Switch Statements
Casting Data Types
Scanners
Static Variables
Concatenation
Format Rounding
Breaks and Continues
