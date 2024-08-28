package petBAG;
import java.util.Scanner;

public class Pet {
	static Scanner scnr = new Scanner(System.in);
	private static String petType;
	private static String petName;
	private static int petAge;
	private static int dogSpaces;
	private static int catSpaces;
	private static int daysStay;
	private static double amountDue;
	
	// Set constructor for pet
	public Pet() {
		petType = "Unknown";
		petName = "Unknown";
		petAge = -1;
		dogSpaces = Dog.getDogSpaceNumber();
		catSpaces = Cat.getCatSpaceNumber(); // TODO: Create Cat Class
		daysStay = -1;
		amountDue = 0.00;
	}
	
	// Get pet type (Dog or Cat)
	public static String getPetType(String userPetType) {
		userPetType = scnr.next();
		return userPetType;
	}
	
	// Set pet type (dog or cat)
	public static void setPetType(String userPetType) {
		userPetType = petType;
	}
	
	// Get pet name
	public static String getPetName(String userPetName) {
		userPetName = scnr.next();
		return userPetName;
	}
	
	// Set pet name
	public static void setPetName(String userPetName) {
		userPetName = petName;
	}
	
	// Get pet Age
	public static int getPetAge(int userPetAge) {
		userPetAge = scnr.nextInt();
		return userPetAge;
	}
	
	// Set pet age
	public static void setPetAge(int userPetAge) {
		userPetAge = petAge;
	}
	
	// get Dog Spaces
	public static int getDogSpaces(int numDogSpaces) {
		numDogSpaces = scnr.nextInt();
		return numDogSpaces;
	}
	
	// Set dog spaces
	public static void setDogSpaces(int numDogSpaces) {
		numDogSpaces = dogSpaces;
	}
	
	// get cat Spaces
	public static int getCatSpaces(int numCatSpaces) {
		numCatSpaces = scnr.nextInt();
		return numCatSpaces;
	}
		
	// Set Cat spaces
	public static void setCatSpaces(int numCatSpaces) {
		numCatSpaces = catSpaces;
	}
	
	// Get days stay
	public static int getDaysStay(int numDaysStay) {
		numDaysStay = scnr.nextInt();
		return numDaysStay;
	}
	
	// Set days stay 
	public static void setDaysStay(int numDaysStay) {
		numDaysStay = daysStay;
	}
	
	// get amount due @ checkout
	public static double getAmountDue(double price) {
		
		double dailyBoardFee = 0.00;
		double groomingFee = 0.00;
		
		// This decision branch sets the pricing based on type of pet,
		// length of stay, and if grooming is a service added. 
		// TODO: error correct/notify if Dog or Cat is not capitalized,
		// 		 or if something else is entered. 
		if (petType.equals("Dog")) {
			if (Dog.getDogWeight() >= 30) {
				dailyBoardFee = 34.00;
				// TODO: error correct/notify if Yes is not capitalized,
				// 		 or if something else is entered. 
				if (Dog.getGrooming().equals("Yes")) {
					groomingFee = 29.95;
				}
				else {
					groomingFee = 0.00;
				}
			}
			
			if ((Dog.getDogWeight() >= 20) && (Dog.getDogWeight() < 30) ) {
				dailyBoardFee = 29.00;
				if (Dog.getGrooming().equals("Yes")) {
					groomingFee = 24.95;
				}
				else {
					groomingFee = 0.00;
				}
			}
			
			if (Dog.getDogWeight() < 20) {
				dailyBoardFee = 24.00;
				if (Dog.getGrooming().equals("Yes")) {
					groomingFee = 19.95;
				}
				else {
					groomingFee = 0.00;
				}			
			}
		}
		else if (petType.equals("Cat")) {
			dailyBoardFee = 18.00;
			groomingFee = 0.00;
		}
		price = (double) (dailyBoardFee * daysStay) + groomingFee;
		return price;
	}
	
	//Set the price for the stay & grooming, where applicable 
	public static void setAmountDue(double priceDue) {
		priceDue = amountDue;
	}
}
