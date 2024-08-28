package petBAG;
import java.util.Scanner;

public class Dog {
	private static int dogSpaceNumber;
	private static int dogWeight;
	private static String grooming;
	
   public Dog() { 
	   dogSpaceNumber = -1;
	   dogWeight = -1;
	   grooming = "unknown";
   }
   
   /* get the dogs space number*/
   public static int getDogSpaceNumber() {
	   return dogSpaceNumber;
   }
   
   /* set the space number for the dog */
   public static void setDogSpaceNumber(int spaceNumber) {
	   dogSpaceNumber = spaceNumber;
   }
   
   /* get the dog's last entered weight*/
   public static int getDogWeight() {
	   return dogWeight;
   }
   
   /* Set the dog's new weight */
   public void setDogWeight(int weight) {
	   dogWeight = weight;
   }
   
   /* Retrieve if dog is getting groomed */ 
   public static String getGrooming() {
	   return grooming;
   }
   
   /* set if dog is getting grooming */
   public void setGrooming(String groom) {
	   grooming = groom;
   }
}