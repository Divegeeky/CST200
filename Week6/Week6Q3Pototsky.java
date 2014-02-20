/** This Program was developed by Jason Pototsky
 2/19/2014 for Week 6 Assignment
 For CST200 Core Data Strs w/OOP - 25311
 Instructor: Andreea-Maria Molnar
 **/
import java.util.*;
//Define the main class
public class Week6Q3Pototsky {
	static LinkedList<Object> myLinkedList = new LinkedList<Object>();
	//Define the Main
	public static void main(String args[]) {
      // Create a couple awesomefilm objects to place into the que
		awesomefilm movie1 = new awesomefilm("RoboCop", "Peter Weller", 53424681, "Action");
		awesomefilm movie2 = new awesomefilm("The Breakfast Club", "Emilio Estevez", 38100000, "Drama");
		awesomefilm movie3 = new awesomefilm("Top Gun", "Tom Cruise", 179767866, "Action");
		awesomefilm movie4 = new awesomefilm("The Goonies", "Sean Astin", 61400000 , "Action");
		awesomefilm movie5 = new awesomefilm("Back to the Future", "Michael J Fox", 197902294, "Action");
		//Add the objects to the linked list
		myLinkedList.add(movie1);
		myLinkedList.add(movie2);
		myLinkedList.add(movie3);
		myLinkedList.add(movie4);
		myLinkedList.add(movie5);
		//Print out the list
		System.out.println("The contents of the list are: "+ myLinkedList);
		//Remove Items
		myLinkedList.remove(movie3);
		System.out.println("The new contents of the list are: "+ myLinkedList);
	}
	  //Define the awesomefilm class
      static class awesomefilm {
    	  //The private fields for the class
    	  private String title;
    	  private String mainactor;
    	  private int grossdraw;
    	  private String genre;
    	  //Blank constructor
    	  awesomefilm(){
    		  this.title = "";
    		  this.genre = "";
    		  this.grossdraw = 0;
    		  this.genre = "";
    	  }
    	  //Constructor with inputs
    	  awesomefilm(String input1, String input2, int input3, String input4){
    		  this.title = input1;
    		  this.mainactor = input2;
    		  this.grossdraw = input3;
    		  this.genre = input4;
    	  }
    	  //The getters and setters are below
    	  public void setTitle(String input){
    		  this.title = input;
    	  }
    	  public void setMainActor(String input){
    		  this.mainactor = input;
    	  }
    	  public void setGrossDraw(int input){
    		  this.grossdraw = input;
    	  }
    	  public void setGenre(String input){
    		  this.genre = input;
    	  }
    	  public String getTitle(){
    		  return this.title;
    	  }
    	  public String getMainActor(){
    		  return this.mainactor;
    	  }
    	  public int getGrossDraw(){
    		  return this.grossdraw;
    	  }
    	  public String getGenre(){
    		  return this.genre;
    	  }
    	  public String toString(){
			return ("The film, " + this.title+ " Starred, "+ this.mainactor + " and Grossed $" + this.grossdraw + " And is a " + this.genre + " movie." );  
    	  }
      }
   }