/** This Program was developed by Jason Pototsky
 2/12/2014 for Week 5 Assignment 2
 For CST200 Core Data Strs w/OOP - 25311
 Instructor: Andreea-Maria Molnar
 **/
/*******************************************************Region Import*************************************************************************************************************/
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;
/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the main class
public class Week5Q2Pototsky {
/*******************************************************Region Global Variables***************************************************************************************************/
	//Create a global array stack  
	static Deque<Integer> stack = new ArrayDeque<Integer>();
	//Create a global input array
	static ArrayList<Integer> input = new ArrayList<Integer>();
	//Create a global output array
	static ArrayList<Integer> output = new ArrayList<Integer>();
	//Create a global bustaMove array
	static ArrayList<String> bustaMove = new ArrayList<String>();
	//Create a global scanner object
	static Scanner myscanner = new Scanner (System.in);
/*******************************************************End Region Global Variables***********************************************************************************************/
/*******************************************************Region Main***************************************************************************************************************/
	//Define the main for the main class 
	public static void main(String[] args) {
		//Call the buildInput method
		buildInput();
		//Call the buildOutput method
		buildOutput();
		//Call the buildStack method
		buildStack();
	}
/*******************************************************End Region Main***********************************************************************************************************/
/*******************************************************Region Methods************************************************************************************************************/
	//Define the buildInput method
	static void buildInput(){
		//Define and initialize the Endthis variable for the while variable
		boolean Endthis = false;
		//define the temporarily string variable
		String temp;
		//Tell the user what to input and the limitations
		System.out.println("We are going to begin building the input array please input end when you are done entering elements, Maximum of 10 values.");
		//Begin a while loop
		while (Endthis==false){
			//The current variable
			temp = myscanner.next();
			//Determine if the user placed end into the field
			if (temp.equals("END") || temp.equals("end")||temp.equals("End")){
				//Change the variable to end the loop
				Endthis = true;
			}
			//If they put an integer value in
			else {
				//Nested if loop that will only execute if there the list has 10 values or less
				if (input.size()<=9){
				//Parse the string as an integer
				input.add(Integer.parseInt(temp));
				}
				//If the input array is larger than 10
				else {
					//Waskaly Wabbit You put in more than 10
					System.out.println("A maximum of only 10 items are allowed to be input for each sequence - Please re-enter");
					//Clear out the array
					input.clear();
					//Exit the loop
					break;
				}
			}			
		}
		//If the array is empty
		if (input.size()==0){
			//I pity the fool that needs to start over
			buildInput();
		}
	}
	
	//Define the buildOutput method
	static void buildOutput(){
		//Define and initialize the Endthis variable
		boolean Endthis = false;
		//Define the temp variable
		String temp;
		//Tell the user what to input
		System.out.println("We are going to begin building the output array please input end when you are done entering elements, Maximum of 10 values.");
		//Begin the while loop
		while (Endthis==false){
			//Store scanner input
			temp = myscanner.next();
			//Determine if the user input end
			if (temp.equals("END") || temp.equals("end")||temp.equals("End")){
				//Set the variable to true and exit the loop
				Endthis = true;
			}
			//If no end than integer
			else {
				//If the loop is less than 10 go ahead and continue
				if (output.size()<=9){
				//Parse the string as an integer and sore it in the output arraylist
				output.add(Integer.parseInt(temp));
				}
				//If the array is larger than 10
				else {
					//They made more than 10....they no likey to listen
					System.out.println("A maximum of only 10 items are allowed to be input for each sequence - Please re-enter");
					//Clear out the array
					output.clear();
					//Exit the loop
					break;
				}
			}			
		}
		//If the array is empty
		if (output.size()==0){
			//Start at the beginning
			buildOutput();
		}
	}
	
	//Define the buildStack method
	static void buildStack(){
		//Quick test to see if the input and output arrays are the same size
		if (input.size() != output.size()){
			//Just stopping it
			System.out.println("You are trying to trick me because the size of input and output are off....");
			System.exit(0);
		}
		//Tell them to match the information
		System.out.print("We are attempting to match the input: ");
		//Print the input array
		printIntegerArray(input);
		//Continue the print
		System.out.print("To the output of : ");
		//Print the output array
		printIntegerArray(output);
		//End the print line
		System.out.println("");
		//Define and initialize the j variable
		int j = 0;
		//Define and initialize the i variable
		int i = 0;
		//While j is less than the output array size
		while (j < output.size()){
			//If i == to the size of the input array and he peek is not equal to j you hit a brick wall
			if (i == input.size() && stack.peek()!= output.get(j)){
				//End the while loop
				break;
			}
			//If the i is equal to the input array size and the stack is empty than you got everything
			else if (i == input.size() && stack.isEmpty()){
				//end the while loop
				break;
			}
			//If the stack top value is equal to the j value in the output array
			else if (stack.peek()== output.get(j)){
				//Pop it like its hot...pop it like its hot
				stack.pop();
				//Add the instruction to the move array
				bustaMove.add("pop");
				//Increase the j value
				j++;
			}
			//If all else fails
			else {
				//Push it....Push it good, push it...push it real good
				stack.push(input.get(i));
				//Add the instruction to the move array
				bustaMove.add("Push");
				//Increase the i value
				i++;
				}
		}
		//Print moves array
		System.out.print("The Moves were: ");
		//Print the array information
		printStringArray(bustaMove);
		//Ending the print statement
		System.out.println("");
		//If there is nothing in the stack
		if (stack.isEmpty()){
			//Print out the input can be mapped
			System.out.println("The input can be mapped to the output.");
		}
		//Otherwise, you are out of luck 
		else {
			//Print out the input cannot be mapped
			System.out.println("The input cannot be mapped to the output.");
		}
	}
	//Print an integerArray using the input of an integer array named input2 in the method
	static void printIntegerArray(ArrayList<Integer> input2){
		//For loop begins that loops along the size of the inputted loop
		for(int i =0; i <input2.size(); i++){
			//Print the value with a space
			System.out.print(input2.get(i) + " ");
		}
	}
	//Print a stringArray using the input of a string array named input2 in the method
	static void printStringArray(ArrayList<String> input2){
		//For loop begins that loops along the size of the inputted loop
		for (int i = 0; i <input2.size(); i++){
			//Print the values with a space
			System.out.print(input2.get(i) + " ");
		}
	}
/*******************************************************End Region Methods********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/