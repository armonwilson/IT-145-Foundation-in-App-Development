/**
 * Main class file. Sets and returns default animal characteristics. 
 * @see Dog and Monkey classes derived from this class
 * @author Armon Wilson
 * @version 1.0
 */

import java.lang.String;

public class RescueAnimal {

    // Instance variables
    private String name;
    private String animalType;
    private String gender;
    private String age;
    private String weight;
    private String acquisitionDate;
    private String acquisitionCountry;
	private String trainingStatus;
    private boolean reserved;
	private String inServiceCountry;


    // Constructor Methods
	
    public RescueAnimal() {
    }

    /**
     * Returns name for the class object.
     */
	public String getName() {
		return name;
	}

	/**
     * Sets name for the class object.
     */
	public void setName(String name) {
		this.name = name;
	}

	/**
     * Returns the animal type.
     */
	public String getAnimalType() {
		return animalType;
	}

	/**
     * Sets the animal type for the class object.
     */
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	/**
     * Returns the gender for the class object.
     */
	public String getGender() {
		return gender;
	}

	/**
     * Sets the gender for the class object.
     */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
     * returns the age for the class object.
     */
	public String getAge() {
		return age;
	}

	/**
     * Sets the age for the class object.
     */
	public void setAge(String age) {
		this.age = age;
	}

	/**
     * Returns the weight for the class object.
     */
	public String getWeight() {
		return weight;
	}

	/**
     * Sets the weight for the class object.
     */
	public void setWeight(String weight) {
		this.weight = weight;
	}

	/**
     * Returns the date of acquisition for the class object.
     */
	public String getAcquisitionDate() {
		return acquisitionDate;
	}

	/**
     * Sets the date of acquisition for the class object.
     */
	public void setAcquisitionDate(String acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

	/**
     * Returns the country of acquisition for the class object.
     */
	public String getAcquisitionLocation() {
		return acquisitionCountry;
	}

	/**
     * Sets the country of acquisition for the class object.
     */
	public void setAcquisitionLocation(String acquisitionCountry) {
		this.acquisitionCountry = acquisitionCountry;
	}

	/**
     * Returns the reserved status for the class object.
     */
	public boolean getReserved() {
		return reserved;
	}

	/**
     * Sets the reserved status for the class object.
     */
	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}
	
	/**
     * Returns the service country for the class object.
     */
	public String getInServiceLocation() {
		return inServiceCountry;
	}

	/**
     * Sets the service country for the class object.
     */
	public void setInServiceCountry(String inServiceCountry) {
		this.inServiceCountry = inServiceCountry;
	}

	/**
     * Returns the training status for the class object.
     */
	public String getTrainingStatus() {
		return trainingStatus;
	}

	/**
     * Sets the training status for the class object.
     */
	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}
}
