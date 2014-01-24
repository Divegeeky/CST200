/** This Program was developed by Jason Pototsky
 1/18/2014 for Week 2 Assignment 2
 For CST200 Core Data Strs w/OOP - 25311
 Instructor: Andreea-Maria Molnar
 **/
/*******************************************************Region Import*************************************************************************************************************/
//Import Statements
import java.util.Scanner;
import java.lang.Math;
/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the main class
public class PototskyWeek2Program2 {
	//Create the scanner for input of user variables
	static Scanner mynextscanner = new Scanner(System.in);
	//Define the overallength variable
	public static double overallLength;
	//Define the lengthAtWaterLine variable
	public static double lengthAtWaterLine;
	//Define the maximumWidth variable
	public static double maximumWidth;
	//Define the totalDisplacement variable
	public static double totalDisplacement;
	//Define the sailArea variable
	public static double sailArea;
/*******************************************************Region Main***************************************************************************************************************/
	//Main statement for the main class
	public static void main(String[] args) {
		//Call the mainProgram
		mainProgram();
	}
/*******************************************************End Region Main************************************************************************************************************/
/*******************************************************Region Methods*************************************************************************************************************/
	//Define the mainProgram method
	public static void mainProgram(){
		//Define the mainselection variable
		String mainselection = "";
		//Define the continuevar variable
		boolean continuevar = true;
		//Begin the while loop
		while (continuevar == true){
			//Begin with a little Pirate talk
			System.out.println("Arrrrr!!, are ye ready for a day of sailin'? Well tough luck, because we have math to do!");
			System.out.println("First off, we need to be determining what some of ye variables are, you know the things that we be needin' to do math...do math or walk the plank!!");
			System.out.println("");
			//Call the getAndSetVariables method
			getAndSetVariables();
			//Call the displayAnswers method
			displayAnswers();
			//Ask the user what they want to do
			System.out.println("Do you want to go again? Please input exit if you want to be done.");
			//Required to go from Int to next Line
			mynextscanner.nextLine();
			//Get the input from the user
			mainselection = mynextscanner.nextLine();
			//Begin the if statement for the exit
				if (mainselection.contains("exit")){
					//I had nothing to do with this, the computer made me do it.
					System.out.println("See you later! I hope you had fun, I'm just a lowly computer but Jason deserves an A!");
					//Set the continuevar to false and exit the loop and program
					continuevar = false;			
				}
		}
	}
	//Define the displayAnswers method
	public static void displayAnswers(){
		//Define the selection variable
		int selection;
		//Define the menuselection variable
		boolean menuselection = true;
		//Define the selectionagain variable
		int selectionagain;
		//Begin the menuselection loop
		while(menuselection == true){
			//Tell the users what I want from the next input
			System.out.println("Now that we have the variables set, please type in the number of the menu selection you want.");
			System.out.println("1. Maximum Theoretical Hull Speed, 2. Displacement to Ship Length, 3. Sail Area to Displacement, 4. Capsize Screening Formula, 5. Comfort Index, 6. Gimme everything!");
			//Get the user input
			selection = mynextscanner.nextInt();
			
			//Use input from selection to determine what answers to put up
			if (selection == 1){
				System.out.println("Maximum Theoretical Hull Speed = " + calculateHullSpeed() );
			}
			else if (selection == 2){
				System.out.println("Displacement to Ship Length = "+ calulateDtoL());
			}
			else if (selection == 3){
				System.out.println("Sail Area to Displacement = " + calculateSAtoD());
			}
			else if (selection == 4){
				System.out.println("Capsize Screening Formula = "+ calculateCapI());
			}
			else if (selection == 5){
				System.out.println("Comfort Index = " + calculateCI() );
			}
			else if (selection == 6){
				System.out.println("Maximum Theoretical Hull Speed = " + calculateHullSpeed()+", Displacement to Ship Length = "+ calulateDtoL());
				System.out.println("Sail Area to Displacement = " + calculateSAtoD());
				System.out.println("Capsize Screening Formula = "+ calculateCapI() + ", Comfort Index = " + calculateCI());
			}
			//Very simple error checking
			else{
				System.out.println("You don't like to play by the rules do you? Well than neither do I!");
				System.exit(selection);
			}
			//Another selection to determine the flow of the program
			System.out.println("Are you happy or do you want to know one of those numbers again? 0 for back to menu selection 1 to continue.");
			//Selection input
			selectionagain = mynextscanner.nextInt();
				//Determine what to do based upon user input
				if (selectionagain == 0){
					System.out.println("One more again!");
				}
				else if (selectionagain == 1){
					menuselection= false;
				}
				else{
					System.out.println("You aren't that bright are you?");
				}
		}
	}
	//Define the getAndSetVariable method
	public static void getAndSetVariables(){
		//Define and initialize the returnindex variable
		boolean returnindex = true;
		//Define the devisions variable
		int decisions;
		//Begin the while loop
		while (returnindex == true){
			//Overallength input
			System.out.println("Please input the Overall Length (LOA) of the watercraft you wish to know about.");
			overallLength = mynextscanner.nextDouble();
			//LengthAtWaterLine input
			System.out.println("Please input the Length at the Water Line (LWL) of the watercraft you wish to know about.");
			lengthAtWaterLine = mynextscanner.nextDouble();
			//maximumWidth input
			System.out.println("Please input the Maximum Width (Beam) of the watercraft you wish to know about.");
			maximumWidth = mynextscanner.nextDouble();
			//totalDisplacement input
			System.out.println("Please input the Total Displacement (Displacement) of the watercraft you wish to know about.");
			totalDisplacement = mynextscanner.nextDouble();
			//sailArea input
			System.out.println("Please input the Total Sail Area (SailArea) of the watercrtaft you wish to know about.");
			sailArea = mynextscanner.nextDouble();
			//Let the user know what they put in
			System.out.println("LOA = "+overallLength +", LWL = "+lengthAtWaterLine+", Beam = "+maximumWidth+", Displacement = "+totalDisplacement+", and SailArea = "+sailArea);
			System.out.println("Are you happy with these variables? Enter 0 for yes, or 1 to re-enter your variables.");
			//Closeout the previous line
			mynextscanner.nextLine();
			//Get the user's input
			decisions = mynextscanner.nextInt();
			//If the user inputs 0 than set return index to false and exit the while loop
			if (decisions == 0){
				returnindex = false;
			}
		}
	}
	//Method to calculate the Maximum Theoretical Hull Speed and return the variable
	public static double calculateHullSpeed(){
		double maxTheoreticalHullSpeed;
		maxTheoreticalHullSpeed = 1.34 * Math.sqrt(lengthAtWaterLine);
		return maxTheoreticalHullSpeed;
	}
	//Method to calculate the Displacement to Ship Length and return the variable
	public static double calulateDtoL(){
		double displacementToShipLength;
		displacementToShipLength =  (totalDisplacement/2240)/Math.pow((.01 * lengthAtWaterLine),3);
		return displacementToShipLength;
	}
	//Method to calculate the Sail Area to Displacement and return the variable
	public static double calculateSAtoD(){
		double sailAreaToDisplacement;
		sailAreaToDisplacement = sailArea/Math.pow((totalDisplacement/64),(.667));
		return sailAreaToDisplacement;
	}
	//Method to calculate the Capsize Screening Formula and return the variable
	public static double calculateCapI(){
		double capsizeScreening;
		capsizeScreening = maximumWidth/Math.pow((totalDisplacement/64), .333);
		return capsizeScreening;
	}
	//Method to calculate the Comfort Index and return the variable
	public static double calculateCI(){
		double comfortIndex;
		comfortIndex = totalDisplacement/(.65 *( (.7 * lengthAtWaterLine) + (.3 * overallLength)) * Math.pow(maximumWidth, 1.33));
		return comfortIndex;
	}
/*******************************************************End Region Methods*********************************************************************************************************/
}
/*******************************************************End Region Superclass******************************************************************************************************/