 /** This Program was developed by Jason Pototsky
 2/12/2014 for Week 5 Assignment 1
 For CST200 Core Data Strs w/OOP - 25311
 Instructor: Andreea-Maria Molnar
 **/
/*******************************************************Region Import*************************************************************************************************************/
/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the studentType class
public class studentType {
/*******************************************************Region Private Variables**************************************************************************************************/
	//Define the private variables needed for the class
	private String Fname;
	private String Lname;
	int Score;
/*******************************************************End Region Private Variables**********************************************************************************************/
/*******************************************************Region Methods************************************************************************************************************/
	//Constructor with no input assigned to the object 
	public studentType (){
		//I'll leave your notes alone....but mine are prettier...
		/** initializes a studentType object to a score of zero and Fname, Lname to empty strings **/
		this.Fname = "";
		this.Lname = "";
		this.Score = 0;
	 }
	//Constructor with input of two strings named fname and lname
	 public studentType (String fname, String lname){
		//Greeeeeeen
		/** initializes a studentType object to a score of zero and Fname, Lname to the specified values **/
		this.Fname = fname;
		this.Lname = lname;
		this.Score = 0;
	 }
	 //Setter for Fname using fname input
	 public void setFname (String fname){
		 //set it....I'm at a loss for more
		 this.Fname = fname;
	 }
	 //Setter for Lname using lname input
     public void setLname (String lname){
    	 this.Lname = lname;
     }
     //Setter for Score...
     public void setScore (int score){
    	 this.Score = score;
     }
     //Getter for Fname
     public String getFname(){
    	 return this.Fname;
     }
     //Getter for Lname
     public String getLname(){
    	 return this.Lname;
     }
     //Getter for Score
     public int getScore(){
    	 return this.Score;
     }
     //Overrides the default return for calling this object. 
     public String toString (){
    	 //I still maintain that my notes are prettier....(╯°□°）╯︵ ┻━┻)
    	 /** returns string as: "Lname, Fname: score" **/
    	 return this.Lname + ", " + this.Fname + ": " + this.Score;
     }
/*******************************************************End Region Methods********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/