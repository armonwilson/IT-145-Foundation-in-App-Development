
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
	
	public void setSpecies(String monkeySpecies) {
		species = monkeySpecies;
	}
	public String getSpecies() {
		return species;
	}
	public void setTailLength(String input) {
		tailLength = input;
	}
	public String getTailLength() {
		return tailLength;
	}
	public void setHeight(String input) {
		height = input;
	}
	public String getHeight() {
		return height;
	}
	public void setBodyLength(String input) {
		bodyLength = input;
	}
	public String getBodyLength() {
		return bodyLength;
	}
}

