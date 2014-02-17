/** This Program was developed by Jason Pototsky
 2/12/2014 for Week 5 Assignment 1
 For CST200 Core Data Strs w/OOP - 25311
 Instructor: Andreea-Maria Molnar
 **/
/*******************************************************Region Import*************************************************************************************************************/
import java.util.Arrays;
/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the class
public class numberList {
/*******************************************************Region Private Variables**************************************************************************************************/
	//Define the private variables needed for the class
	private int List [];
    private int currentCount;
    private int maxSize;
/*******************************************************End Region Private Variables**********************************************************************************************/
/*******************************************************Region Methods************************************************************************************************************/
    //Constructor with no input assigned to the object 
    public numberList(){
    	/** initializes the list to contain a maximum of 10 items **/
    	this.List = new int[10];
    	this.maxSize = 10;
    	this.currentCount = 0;
    }
    //Constructor with input
    public numberList (int size){
    /** initializes the list to contain a maximum of size items **/
    	this.List = new int[size];
    	this.maxSize = size;
    	this.currentCount = 0;
    }
    //Insert the integer
    public void insert (int newNumber){
    /** insert newNumber into the list in sorted order, if the list is full do nothing and discard newNumber **/
    	boolean testvar = this.isFull();
    	if (testvar == false){
    		this.List[currentCount]=newNumber;
    		currentCount++;
    	}
    	else{
    		System.out.println("I'm sorry I cannot insert your integer because the array is full");
    	}
    }
    //Determine if the list is full
    public boolean isFull(){
    /** return true if the list is full **/
    	if(this.currentCount == this.maxSize && this.List[currentCount]!= 0){
    		return true;
    	}
    	else{
    		return false;
    	}
    }
    //Determine if the list is empty
    public boolean isEmpty(){
    /** return true if the list is empty **/
    	if(this.currentCount == 0 && this.List[currentCount]==0){
    		return true;
    	}
    	else{
    		return false;
    	}
    }
    //Sort the list...Yes I got a little lazy and just sorted with the Arrays
    public void sortList(){
    	Arrays.sort(this.List);
    }
    //Print the list
    public void printList() {
    /** print the entire contents of the list **/
    	System.out.println("The Array has a size of: " + this.maxSize + " Elements" );
    	System.out.println("The Array has the following elements in it:");
    	for (int i = 0; i<this.maxSize;i++){
    		System.out.println("The element at index " + i + " is: " + this.List[i] );
    	}
    }
    //Clear the list
    public void clearList(){
    	this.List = new int[this.maxSize];
    }
    //Set the currentCount at the end...
    public void setCurrentCountAtEnd(){
    	this.currentCount = this.currentCount - 1;
    }
/*******************************************************End Region Methods********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/