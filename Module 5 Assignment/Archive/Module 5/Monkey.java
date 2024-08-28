/**
 * A class for animal type "Monkey". 
 * Derived from @see RescueAnimal.java 
 * @author Armon Wilson
 * @version 1.0
 */

public class Monkey extends RescueAnimal{
	private String species; 
	private String tailLength;
    private String height;
    private String bodyLength;
    
    //constructor
	public Monkey(String name, String species, String gender, String age,
		    String weight, String tailLength, String height, String bodyLength,
		    String acquisitionDate, String acquisitionCountry,
			String trainingStatus, boolean reserved, String inServiceCountry) {
		        setName(name);
		        setSpecies(species);
		        setGender(gender);
		        setAge(age);
		        setWeight(weight);
		        setAcquisitionDate(acquisitionDate);
		        setAcquisitionLocation(acquisitionCountry);
		        setTrainingStatus(trainingStatus);
		        setReserved(reserved);
		        setInServiceCountry(inServiceCountry);
		        setTailLength(tailLength);
		        setHeight(height);
		        setBodyLength(bodyLength);
	}
	
	// Mutators
	/**
	 * Constructor method for monkey species.
	 */
	public void setSpecies(String monkeySpecies) {
		species = monkeySpecies;
	}
	/** 
	 * Returns the monkey's species.
	 */
	public String getSpecies() {
		return species;
	}
	/**
	 * Constructor method for monkey tail length.
	 */
	public void setTailLength(String input) {
		tailLength = input;
	}
	/** 
	 * Returns the monkey's tail length.
	 */
	public String getTailLength() {
		return tailLength;
	}
	/**
	 * Constructor method for monkey height.
	 */
	public void setHeight(String input) {
		height = input;
	}
	/** 
	 * Returns the monkey's height.
	 */
	public String getHeight() {
		return height;
	}
	/**
	 * Constructor method for monkey body length.
	 */
	public void setBodyLength(String input) {
		bodyLength = input;
	}
	/** 
	 * Returns the monkey's body length.
	 */
	public String getBodyLength() {
		return bodyLength;
	}
}

