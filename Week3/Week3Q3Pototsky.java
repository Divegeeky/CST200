/** This Program was developed by Jason Pototsky
 1/28/2014 for Week 3 Assignment
 For CST200 Core Data Strs w/OOP - 25311
 Instructor: Andreea-Maria Molnar
 **/

/*******************************************************Region Import*************************************************************************************************************/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the main class
public class Week3Q3Pototsky {
/*******************************************************Region Global Variables***************************************************************************************************/
	//Create the Scanner object that will be used in this program
	static Scanner myscanner = new Scanner(System.in);
	//Create the StringList object that will be used in this program
	static List<String> StringList = new ArrayList<String>();
	//Create the variable userinput that will be used throughout this program
	static char userinput;
/*******************************************************End Region Global Variables***********************************************************************************************/
/*******************************************************Region Main***************************************************************************************************************/
	//Define the Main
	public static void main(String[] args) {
		//Call the buildList method
		buildList();
		//Call the getCharacter method
		getCharacter();
		//Call the countChars method
		countChars(userinput);
		//Call the checkForPalindrome method
		checkForPalindrome();
	}
/*******************************************************End Region Main***********************************************************************************************************/
	//Define the buildList method
	public static void buildList(){
		//Define and Initialize the continueloop variable
		boolean continueloop = true;
		//Define the userinput variable
		String userinput;
		//Begin the while loop
		while (continueloop == true){
			//Ask the user to input a string
			System.out.println("Please input the string that you want to input.");
			//Assign the next line of string data to the userinput variable
			userinput = myscanner.nextLine();
			//Determine if the string contains the word done
			if (userinput.contains("DONE")||userinput.contains("done")||userinput.contains("DONE")){
				//If the user inputs done, than assign false to the continue loop variable and exit the loop
				continueloop = false;
			}
			//If something other than done is input
			else {
				//Enter the string into the StringList list
				StringList.add(userinput);
			}
		}
	}
	//Define the countChars method that accepts a character input named character
	public static void countChars(char character){
		//Define and initialize the i1 variable
		int i1 = StringList.size();
		//Define and initialize the count variable
		int count = 0;
		//Define and initialize the perstringcount variable
		int perstringcount = 0;
		//Define the currentchar variable
		char currentchar;
		//Begin the for loop that iterates throught the list
		for (int i2=0; i2<i1; i2++){
			//Define and assign the current string in the loop to the currentstring variable
			String currentstring = StringList.get(i2);
			//Define the currentstring's length to the i3 variable
			int i3 = currentstring.length();
			//Define and initialize the perstringcount variable also resets the count for every string
			perstringcount= 0;
			//Begin another for loop to iterate through every character in the currentstring
			for (int i4=0; i4<i3; i4++){
				//Define and assign the current character in the loop to the variable
				currentchar = currentstring.charAt(i4);
				//Check to see if the requested character is at the location
				if (currentchar == character){
					//If it is increase the count and perstringcount variables
					count++;
					perstringcount++;
				}
			}
			//Print out the characters found in the current string
			System.out.println("The String "+ StringList.get(i2) + " Has " + perstringcount +" " + character + "'s in it.");
		}
		//Print out the overall amount found in all of the strings
		System.out.println("There are " + count +" "+ character + "'s in all the entered strings");
	}
	//Define the getCharacter method
	public static void getCharacter(){
		//Define the userstr variable
		String userstr;
		//define the userchar variable
		char userchar;
		//Tell the user to input the character
		System.out.println("What character do you want to search for?");
		//Grab the next item in the scanner
		userstr = myscanner.next();
		//Make the string into a character
		userchar = userstr.charAt(0);
		//Make the global variable the entered variable
		userinput = userchar;
	}
	//Define the method checkForPalindrome
	public static void checkForPalindrome(){
		//Define the i2 variable as the size of the list
		int i2 = StringList.size();
		//Begin the for loop that will loop through the list
		for (int i1=0; i1 < i2; i1++){
			//Get the current string and assign it to the currentstring variable
			String currentstring = StringList.get(i1);
			//Create a new reversed string of the currentstring and assign it to comparestring
			String comparestring = new StringBuilder(currentstring).reverse().toString();
			//Determine if the currentstring and comparestring are equal....thus being a palindrome
			if (currentstring.equals(comparestring)){
				//Print out the palindrome information
				System.out.println(currentstring + " is the same as " + comparestring + " and is a Palindrome.");
			}
			//If it is not a palindrome
			else{
				//You are the weakest link
				System.out.println(currentstring + " is not a Palindrome.");
			}
		}
	}
/*******************************************************Region Methods************************************************************************************************************/
/*******************************************************End Region Methods********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/
/******************************************No Animals were harmed in the making of this program***********************************************************************************/