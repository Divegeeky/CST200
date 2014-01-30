/** This Program was developed by Jason Pototsky
 1/28/2014 for Week 3 Assignment Q2
 For CST200 Core Data Strs w/OOP - 25311
 Instructor: Andreea-Maria Molnar
 **/
import java.util.Arrays;
/*******************************************************Region Import*************************************************************************************************************/
import java.util.Scanner;
/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the superclass for the project
class Week3Q2Pototsky {
/*******************************************************Region Global Variables***************************************************************************************************/
	//Create the scanner object to be used for user input
	static Scanner myscanner = new Scanner (System.in);
	//Define the integer array to be utilized
	static int[] userarray;
	//Define and initialize the binaryresults object
	static myResults mybinaryresults = new myResults(0,0);
	//Define and initialize the linearresults object
	static myResults mylinearresults = new myResults(0,0);
	//Define the index variabled
	static int index;
/*******************************************************End Region Global Variables***********************************************************************************************/
/*******************************************************Region Main***************************************************************************************************************/	
	//Define the main
	public static void main(String[] args) {
		//Call the makeArray method
		makeArray();
		//Invoke the printArray method
		printArray();
		//Tell the user to input the index
		System.out.println("Please input the index you wish to search for.");
		//Get the next integer
		index = myscanner.nextInt();
		//Tell the users that the search will be done unsorted
		System.out.println("The Linear search will be conducted on the unsorted array");
		//Search the array with a linear search method
		searchArrayLinear(index);
		//Print out the results of the search index
		System.out.println("The results of the Linear search are index found at array index: "+ mylinearresults.getIndex());
		//Print out the results of the search probes
		System.out.println("The amount of probes to discover this is: "+ mylinearresults.getProbes());
		//Sort the array prior to using it for the binary search
		Arrays.sort(userarray);
		//Invoke the printArray method
		printArray();
		//Tell the users that the binary search will be done on a sorted array
		System.out.println("The Binary search will be conducted on a sorted array.");
		//Search the array with a binary search method
		searchArrayBinaryWithEquality(index);
		//Print out the results of the search index
		System.out.println("The results of the Binary search are index found at array index: "+ mybinaryresults.getIndex());
		//Print out the results of the search proves
		System.out.println("The amount of probes to discover this is: "+ mybinaryresults.getProbes());
	}
/*******************************************************Region Sub-Class**********************************************************************************************************/
	//Define the myResults class
	public static class myResults{
		//Define the probes variable
		public int probes;
		//Define the index variable
		public int index;
		//Define the constructor for the myResults class using probes and index  inputs
		public myResults(int probes, int index){
			//Set the probes parameter to the probes input
			this.probes = probes;
			//Set the index parameter to the index input
			this.index = index;
		}
		//Define the getter for index
		public int getIndex(){
			//return the index parameter for this instance
			return this.index;
		}
		//Define the getter for probes
		public int getProbes(){
			//return the probes parameter
			return this.probes;
		}
		//Define the setIndex method that uses index input
		public void setIndex(int index){
			//Set the index parameter of the object to the index input
			this.index= index;
		}
		//Define the setProbe method that uses the probe input
		public void setProbe(int probe){
			//Set the probe parameter of the object to the probe input
			this.probes= probe;
		}
	}
/*******************************************************End Region Sub-Class******************************************************************************************************/
/*******************************************************Region Methods************************************************************************************************************/
	//Define the makeArray method
	static void makeArray(){
		//Define the arraysize variable
		int arraysize;
		//Tell the user what they will be inputting
		System.out.println("Please input how many variables you would like to input into the array, the array size.");
		//Receive the integer from the user and assign it to the arraysize variable
		arraysize = myscanner.nextInt();
		//Create a new integer array using the arraysize variable
		userarray = new int[arraysize];
		//begin the input loop based on the arraysize variable
		for (int i = 0; i<arraysize; i++){
			//Tell the user what to input
			System.out.println("Please input the integer for index : " + i);
			//Input the integer into the array for each index
			userarray[i] = myscanner.nextInt();
		}
	}
	//Define the searchArrayBinaryWithEquality method that accepts the index input
	static void searchArrayBinaryWithEquality(int indexs){
		//Define and initialize the max variable to the length of the array
		int max = userarray.length-1;
		//Define and initialize the min variable to the beginning of the array
		int min = 0;
		//Define and initialize the mid variable to the formula
		int mid = (max + min) / 2;
		//Define and initialize the indexfound variable to a negative one for not found
		int indexfound = -1;
		//Define and initialize the probes variable
		int probes = 0;
		//Begin the while loop, that says as long as the min does not go above the max
		while (min <= max){
			//If the userarray[mid] equals the index
			if (userarray[mid] == index){
				//Set the indexfound variable to the mid that is within the loop
				indexfound = mid;
				//Count the probe
				probes++;
				//End the loop
				break;
			}
			//If not equal than check for < index
			else if (userarray[mid] < index){
				//Set the min to one more than the middle
				min = mid+1;
				//Count the probe 
				probes++;
				//Set the mid again with the new variables
				mid = (max + min)/2;
			}
			//If not = or < check if > index
			else if (userarray[mid] > index){
				//Set the max to one less than the middle
				max = mid-1;
				//Count the probe
				probes++;
				//Set the mid again with the new variables
				mid = (max + min)/2;
			}
		}
		//Set the binary results object probes parameter using the information gained from the loop
		mybinaryresults.setProbe(probes);
		//Set the binary results object index parameter using the information gained for the loop
		mybinaryresults.setIndex(indexfound);
	}
	//Define the searchArrayLinear that conducts a linear search using the index input
	static void searchArrayLinear(int index){
		//Define and initialize the max to the length of the array 
		int max = userarray.length -1;
		//Define and initialize the indexfound variable
		int indexfound = -1;
		//Define and initialize the probe variable
		int probe = 0;
		//Begin the loop for search
		for (int i = 0; i < max; i++){
			//Check to determine if the value at the array is equal to the index
			if (userarray[i]==index){
				//Set the indexfound to the i variable
				indexfound = i;
				//Count the probe
				probe++;
				//Exit the loop
				break;
			}
		//Count the probe
		probe++;
		}
		//Set the index parameter for the mylinearresults to the indexfound variable
		mylinearresults.setIndex(indexfound);
		//Set the probe parameter for the mylinearresults to the probe variable
		mylinearresults.setProbe(probe);
	}
	static void printArray(){
		//Tell the user what the array contains
		System.out.println("The array is as follows: ");
		//Begin the loop
		for (int i =0; i <userarray.length; i++){
			//Print out each element of the array
			System.out.println("The array index: " + i + " contains the value: " + userarray[i]);
		}
	}
/*******************************************************End Region Methods********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/