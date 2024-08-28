import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program for Grazioso Salvare to track search and rescue animals.
 * This class contains the program's main() method.
 * @author Armon Wilson
 * @version 1.0
 */

public class Driver {
	// Initiate ArrayLists to make inventory of dog and monkey class objects. 
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    
    static Scanner scnr = new Scanner(System.in);
    // Instance variables (if needed)

    /** Main() method
     * Adds and pulls object information from class ArrayLists.
     * @param String 
     * @see RescueAnimal.java, Monkey.java, and Dog.java class files for methods. 
     */
    public static void main(String[] args) {
    	Scanner scnr = new Scanner(System.in);
        initializeDogList();
        initializeMonkeyList();
        
        // Menu Operating Loop, breaks on user input "q". User input calls appropriate method
        String i = null;
        while (i != "q") {
        	displayMenu();
        	
        	// Takes user input for menu options (with validation)
        	try {	i = scnr.nextLine();
        		if (i.equals("1")) { 
        			intakeNewDog(scnr);
        		}
        		else if (i.equals("2")) {
        			intakeNewMonkey(scnr);
        		}
        		else if (i.equals("3")) {
        			reserveAnimal(scnr);
        		}
        		else if (i.equals("4")) {
        			printAnimals("dog");
        		}
        		else if (i.equals("5")) {
        			printAnimals("monkey");
        		}
        		else if (i.equals("6")) {
        			printAnimals("available");
        		}
        		else if (i.equals("q")) {
        			break;
        		}
        		else {
        			throw new Exception("\nInvalid input\n");
        		}
        	}
        	catch (Exception excpt) {
        		System.out.println(excpt.getMessage());
        		scnr.next();
        		continue;
        	}
        }
        scnr.close();
        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu\n");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    // Optional for testing
    public static void initializeMonkeyList() {

    }
    

    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    
    public static void intakeNewDog(Scanner scanner) {
    	// Set new Dog name
        System.out.println("What is the dog's name?");
        String dogName = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(dogName)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        // Set Dog breed
        System.out.println("What is the dog's breed?");
        String dogBreed = scnr.nextLine();
        System.out.println();
        
        // Set dog Gender
        System.out.println("What is the dog's gender?");
        String dogGender = scnr.nextLine();
        System.out.println();
        
        //Set dog Age
        System.out.println("How old is the dog?");
        String dogAge = scnr.nextLine();
        System.out.println();
        
      //Set dog weight
        System.out.println("How much does the dog weigh?");
        String dogWeight = scnr.nextLine();
        System.out.println();
        
      //Set dog acquisition date
        System.out.println("What is the dog's acquisition date?");
        String dogAcquisitionDate = scnr.nextLine();
        System.out.println();
        
      //Set dog acquisition country
        System.out.println("What is the dog's acquisition country?");
        String dogAcquisistionCountry = scnr.nextLine();
        System.out.println();
        
      //Set dog training status
        System.out.println("What is the dog's training status?");
        String dogTrainingStatus = scnr.nextLine();
        System.out.println();
        
      //Set dog reservation status
        System.out.println("Is the dog reserved?");
        boolean dogReserved;
        String r = scnr.nextLine(); 
        if (r.equalsIgnoreCase("yes")) {
            dogReserved = true;
        } 
        else if (r.equalsIgnoreCase("no")) {
            dogReserved = false;
        } 
        else {
            // Handle invalid input
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            return; // return to menu or handle the error accordingly
        }
        System.out.println();
        
        // Set dog's country of service
        System.out.println("What country is the dog in service?");
        String dogInServiceCountry = scnr.nextLine();
        System.out.println();
        
        // Assigns all parameters to new Dog object
        Dog newDog = new Dog(dogName, dogBreed, dogGender, dogAge, dogWeight, dogAcquisitionDate,
        		dogAcquisistionCountry, dogTrainingStatus, dogReserved, dogInServiceCountry);
        
        //Adds dog to ArrayList dogList
        dogList.add(newDog);
        return;
    }

        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
    	public static void intakeNewMonkey(Scanner scanner) {
        	System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
            for (Monkey monkey : monkeyList) {
                if (monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; // returns to menu
                }
            }

         // species validation and input.
            System.out.println("What is the monkey's species?");
            // establishes array of acceptable species
            String[] monkeySpecies = new String[6];
            monkeySpecies[0] = "Capuchin";
            monkeySpecies[1] = "Guenon";
            monkeySpecies[2] = "Macaque";
            monkeySpecies[3] = "Marmoset";
            monkeySpecies[4] = "Squirrel monkey";
            monkeySpecies[5] = "Tamarin";
            String species = scanner.nextLine();
            // boolean variable for species validation
            boolean speciesAllowed = false;
            // checks user input against monkeySpecies array for input verification
            for (String speciesType : monkeySpecies) {
                if (speciesType.equalsIgnoreCase(species)) {
                    speciesAllowed = true;
                    break;
                }
            }
            // rejects if input is not contained in array
            if (!speciesAllowed) {
                System.out.println("\n\nThis species is not allowed.\n\n");
                return; // Exit the method or block of code
            }
         // gender user input
            System.out.println("What is the gender?");
            String gender = scnr.nextLine();
            System.out.println();
            
         // age input
            System.out.println("What is the monkey's age?");
            String age = scnr.nextLine();
            System.out.println();
            
         // weight input
            System.out.println("What is the monkey's weight?");
            String weight = scnr.nextLine();
            System.out.println();
            
         // acquisition date input
            System.out.println("What is the monkey's acquisition date?");
            String acquisitionDate = scnr.nextLine();
            System.out.println();
            
         // acquisition country input
            System.out.println("What is the monkey's acquisition country?");
            String acquisitionCountry = scnr.nextLine();
            System.out.println();
                        
         // training status input
            System.out.println("What is the monkey's training status?");
            String trainingStatus = scnr.nextLine();
            System.out.println();
            
         // assigns boolean variable to reserved with input validation
            System.out.println("Is the monkey reserved?");
            String x = scnr.nextLine();
            boolean reserved;
            if (x.equalsIgnoreCase("yes")) {
                reserved = true;
            } 
            else if (x.equalsIgnoreCase("no")) {
                reserved = false;
            } 
            else {
                // Handle invalid input
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                return; // return to menu or handle the error accordingly
            }
            System.out.println();
            
            // in-service country input
            System.out.println("What is the monkey's in-service country?");
            String inServiceCountry = scnr.nextLine();
            System.out.println();
            
            // Tail length input
            System.out.println("What is the monkey's tail length?");
            String tailLength = scnr.nextLine();
            System.out.println();
            
            // height input
            System.out.println("What is the monkey's height?");
            String height = scnr.nextLine();
            System.out.println();
            
            // body length input
            System.out.println("What is the monkey's body length?");
            String bodyLength = scnr.nextLine();
            System.out.println();
             
            // Assign all inputs to new Monkey class object
            Monkey newMonkey = new Monkey(name, species, gender, age, weight, tailLength, height,
                    bodyLength, acquisitionDate, acquisitionCountry, trainingStatus,
                    reserved, inServiceCountry);
            
            // Add new Monkey object to monkeyList ArrayList
            monkeyList.add(newMonkey);
            return;
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            boolean check = false;
            // Initialize ArrayLists for collecting available animals
            ArrayList<Dog> availableDogs = new ArrayList<>();
            ArrayList<Monkey> availableMonkeys = new ArrayList<>();

            System.out.println("\nDo you want to reserve a Dog or Monkey?");
            // Loop for correct user input
            while (!check) {
                try {
                    String userWants = scanner.nextLine();
                    if (userWants.equalsIgnoreCase("dog")) {
                    	
                        // End loop for correct input
                        check = true;

                        // Get user country for verification that a dog is available for reservation.
                        System.out.println("\nEnter your Country:");
                        String userInput = scanner.nextLine();
                        boolean countryMatch = false;
                        
                        //input validation
                        for (Dog dog : dogList) {
                        	if (userInput.equalsIgnoreCase(dog.getInServiceLocation())) {
                        		countryMatch = true;
                        	}
                        	else if (!countryMatch) {
                                throw new Exception("There are no dogs available in your country.");
                            }
                        }

                        // Check dog ArrayList for available dogs in the user's country
                        for (Dog currDog : dogList) {
                            String currCountry = currDog.getInServiceLocation();
                            if (currCountry.equalsIgnoreCase(userInput) && !currDog.getReserved()) {
                                availableDogs.add(currDog);
                            }
                        }

                        // Print all available dogs' names
                        if (availableDogs.isEmpty()) {
                            System.out.println("\nThere are no dogs available in your country.");
                            break;
                        } 
                        else {
                        	System.out.println();
                        	System.out.println("\nAvailable dogs in your country: ");
                            for (Dog availableDog : availableDogs) {
                                System.out.println(availableDog.getName());
                            }
                        }

                        // Ask user for preferred dog
                        System.out.println("\nWhich dog would you like to reserve? Enter the name:");
                        String dogNameInput = scanner.nextLine();
                        boolean checkInput = false;
                        
                        for (Dog availableDog : availableDogs) {
                            if (dogNameInput.equalsIgnoreCase(availableDog.getName())) {
                                availableDog.setReserved(true);
                                System.out.println(availableDog.getName() + " is now reserved.");
                                checkInput = true;
                                break;
                            }
                        }
                     // input validation for user entered animal name. 
                        if (!checkInput) {
                        	throw new Exception("The name you entered does not appear to be valid.");
                        }
                     }
                     else if (userWants.equalsIgnoreCase("monkey")) {
                        // End loop for correct input
                        check = true;

                        // Get user country for verification that a Monkey is available for reservation.
                        System.out.println("Enter your Country:");
                        String userInput = scanner.nextLine();
                        boolean countryMatch = false;
                        
                      //input validation
                        for (Monkey monkey : monkeyList) {
                        	if (userInput.equalsIgnoreCase(monkey.getInServiceLocation())) {
                        		countryMatch = true;
                        	}	
                        }
                        if (!countryMatch) {
                            throw new Exception("There are no monkeys available in your country.");
                        }

                        // Check monkey ArrayList for available monkeys in the user's country
                        for (Monkey currMonkey : monkeyList) {
                            String currCountry = currMonkey.getInServiceLocation();
                            if (currCountry.equalsIgnoreCase(userInput) && !currMonkey.getReserved()) {
                                availableMonkeys.add(currMonkey);
                            }
                        }

                        // Print all available monkeys' names
                        if (availableMonkeys.isEmpty()) {
                            System.out.println("There are no monkeys available in your country.");
                            break;
                        } 
                        else {
                        	System.out.println("Available monkeys in your country: ");
                            for (Monkey availableMonkey : availableMonkeys) {
                                System.out.println(availableMonkey.getName());
                            }
                        }

                        // Ask user for preferred monkey
                        System.out.println("Which monkey would you like to reserve? Enter the name:");
                        String monkeyNameInput = scanner.nextLine();
                        boolean checkInput = false;
                        
                        for (Monkey availableMonkey : availableMonkeys) {
                            if (monkeyNameInput.equalsIgnoreCase(availableMonkey.getName())) {
                                availableMonkey.setReserved(true);
                                System.out.println(availableMonkey.getName() + " is now reserved.");
                                checkInput = true;
                                break;
                            }
                        }
                     // input validation for user entered animal name. 
                        if (!checkInput) {
                        	throw new Exception("The name you entered does not appear to be valid.");
                        }
                    } 
                    
                    else {
                        throw new Exception("Enter \"Dog\" or \"Monkey\".");
                    }
                }
                
                catch (Exception excpt) {
                    System.out.println(excpt.getMessage());
                    scanner.next();
                }
            }
            return;
        }
    

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(String param) {
        	String reservationStatus = "";
        	
        	// houses all animals that are trained and not reserved.
        	ArrayList<RescueAnimal> availableAnimals = new ArrayList<>();
        	
        	//print method for list of dogs
        	if (param.equals("dog")) {
        		System.out.println("Here are all the dogs:");
        		//iteration over ArrayList for reserved status string assignment
        		for (Dog dog : dogList) {
        			if (dog.getReserved()) {
        				reservationStatus = "Reserved";
        			}
        			else {
        				reservationStatus = "Not Reserved";
        			}
        			System.out.println("" + dog.getName() + ", " + dog.getTrainingStatus() + ", "
        					+ dog.getAcquisitionLocation() + ", " + reservationStatus);
        		}
        	}
        	
        	// print method for list of monkeys
        	if (param.equals("monkey")) {
        		System.out.println("Here are all the monkeys:");
        		//iteration over ArrayList for reserved status string assignment
        		for (Monkey monkey : monkeyList) {
        			if (monkey.getReserved()) {
        				reservationStatus = "Reserved";
        			}
        			else {
        				reservationStatus = "Not Reserved";
        			}
        			System.out.println("" + monkey.getName() + ", " + monkey.getTrainingStatus() + 
        					", " + monkey.getAcquisitionLocation() + ", " + reservationStatus);
        		}
        	}
        	
        	// print method for combined list of all animals that are trained but not reserved. 
        	if (param.equals("available")) {
        		// iterates over ArrayList of dogs checking for training status and not reserved. 
        		// if trained and not reserved, animal is placed in availableAnimals ArrayList
        		for (Dog dog : dogList) {
        			if (dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {
        				availableAnimals.add(dog);
        				dog.setAnimalType("Dog");
        			}
        		}
        		// iterates over ArrayList of monkeys checking for training status and not reserved. 
        		// if trained and not reserved, animal is placed in availableAnimals ArrayList
        		for (Monkey monkey : monkeyList) {
        			if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()) {
        				availableAnimals.add(monkey);
        				monkey.setAnimalType("Monkey");
        			}
        		}
        		// prints all animals in availableAnimals ArrayList
        		if (availableAnimals.isEmpty()) {
    				System.out.println("\nThere are no available animals.");
    			}
        		else {System.out.println("\nHere are all of the available animals that are trained and not reserved:\n");
        		for (RescueAnimal animal : availableAnimals) {
        			System.out.println(animal.getName() + " (" + animal.getAnimalType() + ")" );
        		}
        	}
        }
        return;
    }
}

