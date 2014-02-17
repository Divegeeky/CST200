/** This Program was developed by Jason Pototsky
 2/12/2014 for Week 5 Assignment 1
 For CST200 Core Data Strs w/OOP - 25311
 Instructor: Andreea-Maria Molnar
 **/
/*******************************************************Region Import*************************************************************************************************************/
/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the class
public class stringList {
/*******************************************************Region Private Variables**************************************************************************************************/
	//Define the private variables needed for the class
	private String List [];
    private int currentCount;
    private int maxSize;
/*******************************************************End Region Private Variables**********************************************************************************************/
/*******************************************************Region Methods************************************************************************************************************/    
	//Constructor with no input assigned to the object 
    public stringList(){
    	/** initializes the list to contain a maximum of 10 items **/
    	this.List = new String[10];
    	this.currentCount = 0;
    	this.maxSize = 10;
    }
    //Constructor with input
    public stringList (int size){
    /** initializes the list to contain a maximum of size items **/
    	this.List = new String[size];
    	this.currentCount = 0;
    	this.maxSize = size;
    }
    //Insert the string
    public void insert (String newString){
    /** insert newString into the list into the next available position, if the list is full do nothing and discard newString **/
    	boolean testvar = this.isFull();
    	if (testvar == false){
    		this.List[currentCount] = newString;
    		currentCount++;
    	}
    	else {
    		System.out.println("I'm Sorry I cannot Insert your value into the Array because it is full");
    	}
    }
    //Determine if the list is full
    public boolean isFull(){
    /** return true if the list is full **/
    	if(this.currentCount==this.maxSize && !this.List[currentCount].isEmpty() ){
    		return true;
    	}
    	else{
    		return false;
    	}
    }
    //Determine if the list is empty
    public boolean isEmpty(){
    /** return true if the list is empty **/
    	if (this.currentCount==0 && this.List[currentCount].isEmpty()){
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    //Sort the list using an insertion sort
    public void sortList (){
    /** sort the contents of the list **/
    	if (this.isEmpty()){
    		System.out.println("I'm sorry, but I really don't feel comfortable sorting an empty list.....its' counterproductive");
    	}
    	else {
    		if (this.isFull()){
    			for (int i = 1; i<this.maxSize; i++){
    				String temp = this.List[i];
    				int j = i -1;
    				while (j > 0 && this.List[j].compareTo(temp)> 0){
    					this.List[j+1] = this.List[j];
    					j--;
    				}
    				this.List[j+1]= temp;
    			}
    		}
    		else {
    			for (int i= 1; i<this.currentCount; i++ ){
    				String temp = this.List[i];
    				int j = i -1;
    				while (j > 0 && this.List[j].compareTo(temp)> 0){
    					this.List[j+1] = this.List[j];
    					j--;
    				}
    				this.List[j+1]= temp;
    			}
    		}
    	}
    }
    //Print the list
    public void printList (){
    /** print the entire contents of the list **/
    	System.out.println("The Array has : " + this.maxSize + " Elements in the array.");
    	System.out.println("The elements of the Array are as follows: ");
    	for (int i= 0; i < this.maxSize; i++){
    		System.out.println("Element with index: " + i + " contains: " + this.List[i] );
    	}
    }
    //Clear the List
    public void clearList(){
    	this.List = new String[this.maxSize];
    }
    //Set the current count at the end
    public void setCurrentCountAtEnd(){
    	this.currentCount = this.currentCount - 1;
    }
/*******************************************************End Region Methods********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/