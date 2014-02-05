/** This Program was developed by Jason Pototsky
 2/03/2014 for Week 4 Assignment Program 2
 For CST200 Core Data Strs w/OOP - 25311
 Instructor: Andreea-Maria Molnar
 **/
/*******************************************************Region Import*************************************************************************************************************/
import java.util.Scanner;
/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the super class
public class Week4Q2Pototsky {
/*******************************************************Region Global Variables***************************************************************************************************/
	//Define the scanner object to be utilized throughout the program
	static Scanner myscanner = new Scanner (System.in);
/*******************************************************End Region Global Variables***********************************************************************************************/
/*******************************************************Region Main***************************************************************************************************************/
	//Define the main 
	public static void main(String[] args) {
		//Create the integerArray using the buildArray method
		int[] integerArray = buildArray();
		//Tell the user that the unsorted array is going to be printed
		System.out.println("The Unsorted Array is below:");
		//Print the array using the integerArray as an input
		printArray(integerArray);
		//Print out a blank line to separate
	    System.out.println("-----------------------------------------");
		//Define a sortedArray that uses the insertionSort that uses integerArray input
	    int[] sortedArray = insertionSort(integerArray);
	    //Tell the user that the printed array is going to be printed
		System.out.println("The Sorted Array is below:");
		//Print the array using the sortedArray as an input
		printArray(sortedArray);
	}
/*******************************************************End Region Main************************************************************************************************************/
/*******************************************************Region Methods*************************************************************************************************************/
	//Define the buildArray method
	public static int[] buildArray(){
		//Define the arraySize variable
		int arraySize;
		//Define the integerArray that will be used to temporarily store the array information
		int[] integerArray;
		//Print out what you want the user to input
		System.out.println("You need to build an array, how many elements do you wish to have in it?");
		//Have an integer assigned from user input to the arraySize variable
		arraySize = myscanner.nextInt();
		//Initialize the integerArray with the element size that was defined
		integerArray = new int[arraySize];
		//Begin the for loop
		for(int i = 0; i < arraySize; i++){
			//Tell the user what to store at the i index
			System.out.println("Please input the integer that you want to store in index # " + i);
			//Input the user information into the array element in i
			integerArray[i]= myscanner.nextInt();
		}
		//Return the array to the main
		return integerArray;
	}
	
	//Define the printArray method that uses the input integerArray
	public static void printArray(int[] integerArray){
		//Begin the for loop
		for (int i = 0; i < integerArray.length; i++){
			//Print out the integer at index i
			System.out.println("The integer at the index: " + i + " is: " + integerArray[i]);
		}
	}
	
	//Define the insertionSort method that accepts an integerArray input
	public static int[] insertionSort(int[] integerArray) {
		//Begin the for loop
		for (int i = 0; i < integerArray.length; i++) {  
			//Define the temp variable and assign it to the array value at i
			int temp = integerArray[i];  
			//Define the j variable and assign the i-1 in the loop to the input
			int j = i - 1;  
			//Begin the nested while loop, that while j is greater than or equal to 0, and if the value in the array element j is greater than temp
			while (j >= 0 && integerArray[j] > temp) {  
				//Place the value in j into the element above i
				integerArray[j + 1] = integerArray[j];  
				//redefine the j value by decrementing it
				j--;  
			} 
			//Place the value of the temporary value(the assessed value) into the j+1 element
			integerArray[j + 1] = temp;  
		} 
		//Return the sorted array to the main
		return integerArray;
	}  
/*******************************************************End Region Methods*********************************************************************************************************/
}
/*******************************************************End Region Superclass******************************************************************************************************/