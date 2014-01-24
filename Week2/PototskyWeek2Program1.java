/** This Program was developed by Jason Pototsky
 1/18/2014 for Week 2 Assignment 1
 For CST200 Core Data Strs w/OOP - 25311
 Instructor: Andreea-Maria Molnar
 **/
/*******************************************************Region Import*************************************************************************************************************/
//Import statements
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*******************************************************End Region Import*********************************************************************************************************/

/*******************************************************Region Superclass*********************************************************************************************************/
//Superclass definition
public class PototskyWeek2Program1 {
	
	//Creating the scanner to be used in the program
	static Scanner myscanner = new Scanner(System.in);
/*******************************************************Region Main***************************************************************************************************************/
	// The Main that calls the methods
	public static void main(String[] args) {
	
		// Method One
		getAverage();
		
		// Method Two
		displayMultiplesOfFive();
		
		// Method Three
		getStringAndFlip();
		
		// Method Four
		getAndDisplayStringLexicographic();
		
		//Close myscanner to not "leak" resources
		myscanner.close();
		
		//Finish with flair
		System.out.println("You have now finished the week 1 Program, Don't forget to tip your wait staff.");
	}
/*******************************************************End Region Main************************************************************************************************************/
/*******************************************************Region Methods*************************************************************************************************************/
	//Define the getAverage Method
	public static void getAverage(){
		//Define and initialize the endInput variable
		int endInput = 1;
		//Create the averageList arraylist for integers
		List<Integer> averageList = new ArrayList<Integer>();
		//Define the valueToEnter variable
		int valueToEnter;
		//Initialize the average variable
		int average = 0;
		//Begin the while loop for user input
		while (endInput != 0){
			//Tell the user what to do
			System.out.println("Please input an integer into the line if you wish to end and get the average input 0");
			//Scanner to grab the next line
			valueToEnter = myscanner.nextInt();
			//If the user inputs 0
			if (valueToEnter == 0){
				//If the user inputs 0 than change endInput = 0 thus ending the while loop
				endInput=0;
			}
			//If the user inputs a negative value
			else if (valueToEnter < 0){
				//Input validation
				System.out.println("You don't know how to follow directions do you? Please input a positive value.");
			}
			//If the user enters a positive integers
			else if (valueToEnter > 0){
				//Add the integer to the list
				averageList.add(valueToEnter);
			}
			
		}
		//Begin a for loop to iterate through the list
		for (int i=0; i < averageList.size(); i++){
			//Accumulator function to add up the sum of all items in the list
			average = average + averageList.get(i);
		}
		//Get the average of the sum of all the list items
		average = average / averageList.size();
		//Output the average
		System.out.println("The average of all the items that you entered is: " + average);
	}
	
	//Define the displayMultiplesOfFive method
	public static void displayMultiplesOfFive(){
		//Begin the output
		System.out.print("The Multiples of five from 500 to 5 using a For looop are:");
		//Begin the for loop iterating backwards from 500
		for (int i=500; i>4; i--){
			//If the integer i is divisible by five, modulus will be zero
			if (i%5 == 0){
				//Print the integer value
				System.out.print(" " + i);			
			}
		}
		// End the line and move on
		System.out.println("");
		//Begin the output for the next loop
		System.out.print("The Multiples of five from 500 to 5 using a While loop are: ");
		//initialize the numberToProcess variable
		int numberToProcess = 500;
		//Begin the while loop, so that while the number to process value is greater than 4 loop
		while (numberToProcess > 4){
			//If the number is divisible by five the modulus should be zero
			if (numberToProcess%5 == 0){
				//output the number
				System.out.print(" " + numberToProcess);
			}
		//decrease the numberToProcess variable
		numberToProcess--;
		}
		//Finish the print statement
		System.out.println("");
	}
	
	//Define the getStringAndFlip Method
	public static void getStringAndFlip(){
		//Define the inputstring variable
		String inputString;
		//Define the reverseString variable
		String reverseString;
		//"Close out" the previous scanner input of integers
		myscanner.nextLine();
		//Tell the user what to do		
		System.out.println("Please input a string that you want to modify.");
		//Get input from user using the next input line
		inputString = myscanner.nextLine();
		//Tell the user what they input
		System.out.println("Your string was: "+ inputString);
		//Create a new string reversing it
		reverseString = new StringBuilder(inputString).reverse().toString();
		//Output what the new string is
		System.out.println("The Reverse of your string is: "+ reverseString);
	}

	//Define the getAdnDisplayStringLexicograhic method
	public static void getAndDisplayStringLexicographic(){
		//Define the LexicoList list
		List<String> LexicoList = new ArrayList<String>();
		//Define the inputString variable
		String inputString;
		//Define and initialize the endInput variable 
		int endInput = 1;
		//Begin a while loop to input strings, so while endInput is not zero continue the loop
		while (endInput != 0){
			//Tell the user what to input
			System.out.println("Please input a string that you want to sort, input End when you are finished");
			//Capture the output
			inputString = myscanner.nextLine();
			//If the user inputs End,end,END then
			if (inputString.contentEquals("End") || inputString.contentEquals("end") || inputString.contentEquals("END")){
				//If the user input End end or END than set the endInput variable to 0 and end the while loop
				endInput=0;
			}
			//Any other input than accomplish the following
			else {
				//Add the string to the list
				LexicoList.add(inputString);
			}
		}
		//Sort the list by the Unicode characters it contains
		Collections.sort(LexicoList);
		//Begin the print statement
		System.out.print("The strings that you entered in Lexicographically order are: ");
		//Begin a for loop to iterate through the list
		for (int i=0; i < LexicoList.size(); i++){
			//Print the contents of the loop
			System.out.print(" " + LexicoList.get(i) + ",");
		}
		//End the print statement
		System.out.println("");
	}
/*******************************************************End Region Methods*********************************************************************************************************/
}	
/*******************************************************End Region Superclass******************************************************************************************************/