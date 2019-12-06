package restaurantSearch;
import java.util.Scanner;

public class restaurantList {

	public static void main(String[] args) {
		//This string stores data of restaurants outside of Aderhold. Source from Google Maps.
		String [] [] aderhold = {
				{"Restaurants   ", "Food Types ", "Price", "Rating", "Review"},
				{"Smoothie King ", "Smoothies ", "$$", "4.0", "Staff was rude bu the smoothie was decent"},
				{"Subway        ", "Sandwhiches ", "$","3.4", "Place was clean, staff were nice but the sandwhich was okay for the price"},
				{"Jimmy Johns   ", "Sandwhiches ", "$$", "3.6", "Sandwhich was not good or worth the price"},
				{"Asian Fusion  ", "Asian Food ", "$", "4.2", "Absolutely loved the honey Chicken and fried rice"},
				{"Mama Mia      ", "Pizza and wings", "$$", "3.9", "Friendly service and good food on the menu"},
				{"Naan Stop     ", "Indian Food ", "$", "4.2", "I have no idea what i order but i loved it"},
				{"Rosa's Pizza  ", "Pizza ", "$", "4.6", "Good price for the pizza, the slices were delicious and big"},
				{"Moe's         ", "Mexican food ", "$", "3.4", "great food but can get crazy during lunch hour"},
				{"Taqueria      ", "Mexican Food ", "$", "4.5", "Great and fast food service but the food itself was horrible"} };
		
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter restaraunt, food, price, rating, or review to see whats around your area.");
	String user = input.nextLine();
	
	//determining on the user input, it will call on the method to perform
	if(user.toLowerCase().equals("restaurant"))
		restaurant(aderhold);
	else if(user.toLowerCase().equals("foodtype"))
		foodType(aderhold);
	else if(user.toLowerCase().equals("price"))
		price(aderhold);
	else if(user.toLowerCase().equals("rating"))
		rating(aderhold);
	else if(user.toLowerCase().equals("review"))
		review(aderhold);
	else {
		System.out.println("Wrong input please try again"); //Want to find a way that let the user input again and run the if statement again.
	}
}
	public static void restaurant(String[][] list){ //Just displays the Restaurants outside of Aderhold
		for(int row = 0, column = 0; row < 10; row++) {
			System.out.println(list[row][column]);
		} 
	}
	public static void foodType(String[][] list) {	//Displays the restaurants and what kind of food they have
		for(int row = 0, column = 0, column1 = 1; row < 10; row++) {
			System.out.print(list[row][column]);
			System.out.print( list[row][column1]);
			System.out.println();
		}
	}
	public static void price(String[][] list) {	//Displays the restaurant and their price but wanna sort them from expensive to cheap. probably use toDigit() and compare each array?
		for(int row = 0, column = 0, column2 = 2; row < 10; row++) {
			System.out.print(list[row][column]);
			System.out.print( list[row][column2]);
			System.out.println();	
		}
	}

	public static void rating(String[][] list) { //Display the restaurants and their ratings but want to sort them from highest ratings to lowest
		for(int row = 0, column = 0, column3 = 3; row < 10; row++) {
			System.out.print(list[row][column]);
			System.out.print( list[row][column3]);
			System.out.println();
			
		}
	}
	public static void review(String[] [] list) {	//Want to find a way that detects the negative and positive words in each review and determine the rating is good or bad
		
	}
}


