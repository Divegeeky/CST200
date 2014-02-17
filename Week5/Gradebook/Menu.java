/** This Program was developed by Jason Pototsky
 2/12/2014 for Week 5 Assignment 1
 For CST200 Core Data Strs w/OOP - 25311
 Instructor: Andreea-Maria Molnar
 **/
/*******************************************************Region Import*************************************************************************************************************/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the Menu class
public class Menu {
/*******************************************************Region Global Variables***************************************************************************************************/
	//Create a global buffer for the empty string entry
	static BufferedReader buf = new BufferedReader (new InputStreamReader (System.in));
	//Create a global scanner for user entry
	static Scanner myscanner = new Scanner (System.in);
	//Create a global mystringList object
	static stringList mystringlist;
	//Create a global mynumberlist object
	static numberList mynumberlist;
	//Create a global myStudentListType object
	static studentListType myStudentListType;
/*******************************************************End Region Global Variables***********************************************************************************************/
/*******************************************************Region Main***************************************************************************************************************/	
	//Define the main
	public static void main(String[] args) throws IOException {
		//Call the menuStat method
		menuStart();
	}
/*******************************************************End Region Main***********************************************************************************************************/
/*******************************************************Region Methods************************************************************************************************************/
	//Define the menuStart that throws an exception for Input Output Exception
	public static void menuStart() throws IOException{
		//Define and initialize the menuloop variable
		boolean menuloop = true;
		//The Grademaster's creed!
		System.out.println("Good Morning! Welcome to your GradeBook....There are many Gradebooks, but this is one is mine.");
		System.out.println("My Gradebook is my friend. It is my life. I must master it as I must master my life.");
		//Begin the menu loop
		while (menuloop == true){	
			//You gotta give em options.....
			System.out.print("Enter the number for your desired option: \n"
							 + "1. Build the Class lists.\n"
							 + "2. Add Students to the gradebook.\n"
							 + "3. Display a list of all your students. \n"
							 + "4. Display a list of all the scores in the class. \n"
							 + "5. Display a list of the names and scores for the class. \n"
							 + "6. Clear out my Class \n"
							 + "7. Exit the system. \n"
							);
			//Get the user's option
			int option = myscanner.nextInt();
			//Define the Switch with the input of option
			switch (option) {
			//Case 1 Build it....
			case 1:
				//Call the buildClass method
				buildClass();
				//Exit the case
				break;
			//Define Case 2
			case 2:
				//Check to see if the list is full
				if(myStudentListType.isFull()){
					//Notin' Huny
					System.out.println("Sorry Boss your Class is full");
				}
				//GO on......do your thang'
				else{
					//Call the addStudents method
					addStudents();
				}
				//Exit the case
				break;
			//Define Case 3
			case 3:
				//Sort the list
				mystringlist.sortList();
				//Print the list
				mystringlist.printList();
				//Exit the case
				break;
			//Define Case 4
			case 4:
				//Sort the list
				mynumberlist.sortList();
				//Print the list
				mynumberlist.printList();
				//Exit the case
				break;
			//Define Case 5	
			case 5:
				//Sort the List
				myStudentListType.sortList();
				//Print the list
				myStudentListType.printList();
				//Exit the case
				break;
			//Define Case 6
			case 6:
				//Clear the lists
				mystringlist.clearList();
				mynumberlist.clearList();
				myStudentListType.clearList();
				//Exit the case
				break;
			//Define Case 7
			case 7:
				//set the variable to false to exit the loop
				menuloop = false;
				//Exit the case
				break;
			}
		}
	}
	//Define the buildClass method
	public static void buildClass() throws IOException{
		//Tell em what's up
		System.out.println("We need to create this class' gradebook. How many students are enrolled in this class? If you provide a blank response the default will be used.");
		//Get the string information
		String studentSize = buf.readLine();
		//Define the classSize variable
		int classSize;
		//If they just hit enter
		if (studentSize.equals("")){
			//Set size to 10
			classSize = 10;
			}
		//Parse the integer
		else{classSize = Integer.parseInt(studentSize);
		}
		//Tell em what they input
		System.out.println("You input a value of: " + classSize);
		//Build the Arrays
		mynumberlist = new numberList(classSize);
		mystringlist = new stringList(classSize);
		myStudentListType = new studentListType(classSize); 
	}
	//Define the addStudents method
	public static void addStudents() throws IOException{
		//set the boolean to initialize
		boolean Endstatus=false;
		//Do this....
		do{ 
			//Call the buildStudent method and assign the return to studenttotransfer
			studentType studenttotransfer= buildStudent();
			//If there is no return than:
			if (studenttotransfer == null){
				//Exit the loop two times....for extra protection and clarity...and cause I want to.
				Endstatus = true;
				break;
			}
			//If there is a returned object and the List is at the last spot
			else if (myStudentListType.getCurrentCount() == myStudentListType.getMaxSize()-1){
				//Add it like its hot...add it like its hot
				myStudentListType.insert(studenttotransfer);
				mynumberlist.insert(studenttotransfer.getScore());
				mystringlist.insert(studenttotransfer.getLname()+", " + studenttotransfer.getFname());
				//Exit the loop...Two time..two times
				Endstatus = true;
				break;
			}
			//If there is a returned object but it is in the middle of the list
			else {
			//Such add...Student More.....object shiny
			myStudentListType.insert(studenttotransfer);
			mynumberlist.insert(studenttotransfer.getScore());
			mystringlist.insert(studenttotransfer.getLname()+", " + studenttotransfer.getFname());
			}
		}
		//the while for the do....
		while (Endstatus == false);
		//Set the currentCountAtEnd back to the last index that was added
		myStudentListType.setCurrentCountAtEnd();
		mynumberlist.setCurrentCountAtEnd();
		mystringlist.setCurrentCountAtEnd();
	}
	//Define the buildStudent method
	public static studentType buildStudent() throws IOException{
		//DEFINE THE VARIABLES...CAPSLOCK IS STUCK
		String Fname;
		String Lname;
		int score;
		//Just kidding....no one really is reading anymore at this point anyways.....so it doesn't matter
		System.out.println("We will now build our students, I hope you are ready.");
		System.out.println("What is the student's Last name? Enter END to finish");
		//Get the input
		Lname =  buf.readLine();
		//IF they input end into the field
		if (Lname.equals("end")||Lname.equals("END")||Lname.equals("End")){
			//Return nothing!!!! 
			return null;
		}
		//Input.....Need...Input...Johnny 5 is ALIVE!
		System.out.println("What is the student's First name?");
		//reading the input....NOVA
		Fname = buf.readLine();
		//Score....
		System.out.println("What score does the student have?");
		//input score....
		score = myscanner.nextInt();
		//Create the object! there is a student!
		studentType studenttype = new studentType(Fname, Lname);
		//Set the score
		studenttype.setScore(score);
		//Return the object
		return studenttype;
	}
/*******************************************************End Region Methods********************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/