/** This Program was developed by Jason Pototsky
 2/12/2014 for Week 5 Assignment 1
 For CST200 Core Data Strs w/OOP - 25311
 Instructor: Andreea-Maria Molnar
 **/
/*******************************************************Region Import*************************************************************************************************************/
/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the class
public class studentListType {
/*******************************************************Region Private Variables**************************************************************************************************/
	//Define the private variables needed for the class
	private studentType List [];
    private int currentCount;
    private int maxSize;
/*******************************************************End Region Private Variables**********************************************************************************************/
/*******************************************************Region Methods************************************************************************************************************/
	//Constructor with no input assigned to the object 
    public studentListType(){
    /** initializes the list to contain a maximum of 10 items **/
    	this.List = new studentType[10];
    	this.currentCount = 0;
    	this.maxSize = 10;
    }
    //Constructor with input
    public studentListType (int size){
    /** initializes the list to contain a maximum of size items **/
    	this.List = new studentType[size];
    	this.currentCount = 0;
    	this.maxSize = size;
    }
    //Insert an object into the list
    public void insert (studentType  Student){
    /** insert newString into the list into the next available position, if the list is full do nothing and discard newString **/
    	boolean testvar = this.isFull();
    	if (testvar == false){
    		this.List[currentCount] = Student;
    		currentCount++;
    	}
    	else {
    		System.out.println("I'm Sorry I cannot Insert your value into the Array because it is full");
    	}
    }
    //Test if the list is full
    public boolean isFull(){
    /** return true if the list is full **/
    	if(this.currentCount==this.maxSize && !this.List[currentCount].getLname().isEmpty() ){
    		return true;
    	}
    	else{
    		return false;
    	}
    }
    //Determine if the list is empty.
    public boolean isEmpty(){
    /** return true if the list is empty **/
    	if (this.currentCount==0 && this.List[currentCount] == null){
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    //Sort the list using an insertion sort method
    public void sortList (){
    /** sort the contents of the list **/
    	if (this.isEmpty()){
    		System.out.println("I'm sorry, but I really don't feel comfortable sorting an empty list.....its' counterproductive");
    	}
    	else {
    		if (this.isFull()){
    			for (int i = 1; i<this.maxSize; i++){
    				studentType temp = this.List[i];
    				int j = i -1;
    				String ilname = this.List[i].getLname();
    				String jlname = this.List[j].getLname();
    				while (j > 0 &&  jlname.compareTo(ilname)> 0){
    					this.List[j+1] = this.List[j];
    					j--;
    				}
    				this.List[j+1]= temp;
    			}
    		}
    		else {
    			for (int i= 1; i<this.currentCount; i++ ){
    				studentType temp = this.List[i];
    				int j = i -1;
    				String ilname = this.List[i].getLname();
    				String jlname = this.List[j].getLname();
    				while (j > 0 && jlname.compareTo(ilname)> 0){
    					this.List[j+1] = this.List[j];
    					j--;
    				}
    				this.List[j+1]= temp;
    			}
    		}
    	}
    }
    //Print the Array
    public void printList (){
    /** print the entire contents of the list **/
    	System.out.println("The Array has : " + this.maxSize + " Elements in the array.");
    	System.out.println("The elements of the Array are as follows: ");
    	for (int i= 0; i < this.maxSize; i++){
    		if (this.List[i]!=null){
    				System.out.println("Element with index: " + i + " contains: " + this.List[i].toString() );
    		}
    	}
    }
    //Clear the list
    public void clearList(){
    	this.List = new studentType[this.maxSize];
    }
    //Set the Current Count to its last index...only used sparingly..
    public void setCurrentCountAtEnd(){
    	this.currentCount = this.currentCount - 1;
    }
    //Getter for the count.. I realized I needed this for my menu class
    public int getCurrentCount(){
    	return this.currentCount;
    }
    //Getter for the MaxSize.... Same as above
    public int getMaxSize(){
    	return this.maxSize;
    }
/*******************************************************End Region Methods********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/
