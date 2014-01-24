/** This Program was developed by Jason Pototsky
 1/13/2014 for Week 1 Assignment
 For CST200 Core Data Strs w/OOP - 25311
 Instructor: Andreea-Maria Molnar
 **/
import java.util.Scanner;
//Defining the Class for the entire project
public class PototskyWeek1 { 
	//Definitions class, creating the workflow for the first problem
	// The Main worker for the entire project
	public static void main (String [] args)
	{ 
		//Creating a new scanner for use in the entire project
		Scanner in = new Scanner(System.in);
		
		// Question one main 
			//Creating a new definitions object with the properties of the text
		Definitions def_expression = new Definitions("Expression : An expression is a group of values, variables, operators, and constants"
				 + " that form a set of instructions to perform that produces another value.");
			//Invoking the printText method on the def_expression object
		def_expression.printText();
			//Creating a new definitions object with the properties of the text
		Definitions def_algorithm = new Definitions("Algorithm : A step-by-step problem-solving procedure, especially an established, recursive "
				+ " computational procedure for solving a problem in a finite number of steps.");
			//Invoking the printText method on the def_algorithm object
		def_algorithm.printText();
			//Creating a new definitions object with the properties of the text
		Definitions def_api = new Definitions("API: Application Programming Interface, is a set of routines, protocols, and tools for building"
				 + " software applications.");
			//Invoking the printText method on the def_api object
		def_api.printText();

		 // Question two main
			//initialize the frstname variable
		 String frstname;
			//initialize the lastname variable
		 String lastname;
		 	//Tell the user what to input
		 System.out.println("Please tell me what your first name is.");
		 	//Scanner to pick up user input
		 frstname = in.nextLine();
		 	//Confirmation of what the input
		 System.out.println("You entered:"+ frstname);
		 	//Tell the user what to input
		 System.out.println("Please tell me what your last name is.");
		 	//Scanner to pick up user input
		 lastname = in.nextLine();
		 	//Confirmation of what user input
		 System.out.println("You entered:"+ lastname);
		 	//Create a new Initials object
		 Initials user_initials = new Initials(frstname, lastname);
		 	//Invoke the printInitials method
		 user_initials.printInitials();
		 		 
		 // Question three main
		 	//initialize the int1 variable
		 int int1;
		 	//initialize the int2 variable
		 int int2;
		 	//initialize the int3 variable
		 int int3;
		 	//Tell the user what to input
		 System.out.println("Please input three numbers seperated by whitespace, space.");
		 	//Scanner to receive the first integer entered in the stream
		 int1 = in.nextInt();
		 	//Scanner to receive the second integer entered in the stream
		 int2 = in.nextInt();
		 	//Scanner to receive the third integer entered in the stream
		 int3 = in.nextInt();
		 	//Create a new SumAverages object with the scanner inputs
		 SumAverages user_sumaverage = new SumAverages(int1, int2, int3);
		 	//Invoke the printSumAverage method
		 user_sumaverage.printSumAverage();
		 
		 // Question four main
		 	//Initialize the user_radius variable
		 int user_radius;
		 	//Tell the user what to input
		 System.out.println("What do you want the circle's radius to be?");
		 	//Scanner input to receive the next entered integer in the stream
		 user_radius = in.nextInt();
		 	//Create a new Circle object using the scanner input
		 Circle mycircle = new Circle(user_radius);
		 	//Invoking the getAverage method in the mycircle object
		 mycircle.getArea();
		 
		 //Question five main
		 	//Initialize the userheight variable
		 int userheight;
		 	//Initialize the userage variable
		 int userage;
		 	//Tell user what to input - Since the instruction said to enter in centimeters I did not do anything to convert
		 System.out.println("What is your height in centimeters?");
		 	//Scanner to capture the next integer in the stream
		 userheight = in.nextInt();
		 	//Tell the user what to input
		 System.out.println("What is your age?");
	 		//Scanner to capture the next integer in the stream
		 userage = in.nextInt();
		 	//Create a new OptimalWeight object using the scanner inputs
		 OptimalWeight useroptimalweight = new OptimalWeight(userheight, userage);
		 	//Invoke the printOptimalweight method
		 useroptimalweight.printOptimalweight();
		 
		 //Question six main (No need for a class)
		 	//Initialize and store the string
		 String twinkle = "Twinkle, Twinkle, little star";
		 	//Confirm what is the current string is
		 System.out.println("The current string is: "+ twinkle);
		 	//Create a new string replacing all the r characters in the string with x
		 String new_twinkle = twinkle.replaceAll("r","x");
		 	//Confirm the job has been completed
		 System.out.println("The new string is: "+ new_twinkle);
		 
		 //Question seven main
		 	//Initialize the user_string variable
		 String user_string;
		 	//Scanner to reset the line input and clear out what is needed to be captured....basically resetting it from previous operations
		 in.nextLine();
		 	//Tell the user what to input
		 System.out.println("Please input the string that your wish to manipulate.");
		 	//Scanner to capture the next line of information
		 user_string = in.nextLine();
		 	//Confirm what the user input 
		 System.out.println("You input " + user_string);
		 	//Create a new stringify object using the scanner input
		 Stringify newstring = new Stringify(user_string);
		 	//Invoking the getfirstchar method
		 newstring.getfirstchar();
		 	//Invoking the getfirstlasta method
		 newstring.getfirstlasta();
		 	//Invoking the getfirstfour method
		 newstring.getfirstfour();
		 	//Invoking the getcharacters method
		 newstring.getcharacters();
		 	//Invoking the makeuppercase method
		 newstring.makeuppercase();
		 
		 //Question eight main
		 	//Initializing the user_numberstring variable
		 String user_numberstring;
		 	//Tell the user what to input
		 System.out.println("Please input the string that you wish to count, make sure to input numbers");
		 	//Scanner input to grab the next line, a reset is not needed since the last scanner method finished the line
		 user_numberstring = in.nextLine();
		 	//Create a new numbertext object using the user input
		 Numbertext user_numbertext = new Numbertext(user_numberstring);
		 	//Invoke the getnumbersandcount method
		 user_numbertext.getnumbersandcount();
		 
		 //The End!
		 	//Close the Scanner object so that there is not a resource leak
		 in.close();
		 	//Exit with flair
		 System.out.println("This has been fun. However, its closing time, you don't have to go home but you can't stay here!");
		 //End of Main
	}
	//Definitions Class (Class for Question 1)
		//Define the Definitions class
	public static class Definitions{ 
		//Initializing the testToPrint variable for the constructor
		public String textToPrint; 
		//The Constructor for the Definitions object using a string input named text
		public Definitions(String text)
		{
			// Assigning the text input to the textToPrint variable
			textToPrint = text;
		}
		//Creating the printText method
		public void printText()
		{
			//Execution of the print statement to be done by each object
			System.out.println(textToPrint);
		}
	}
	
	//Initials Class (Class for Question 2)
		//Define the Initials Class
	public static class Initials{
		//Initialize the firstName variable
		public String firstName;
		//Initialize the lastName variable
		public String lastName;
		//Define the constructor for the Initials object using two string inputs named text1 and text2
		public Initials(String text1, String text2)
		{
			//Assign the text1 input to the firstName variable
			firstName = text1;
			//Assign the text2 input to the lastName variable
			lastName = text2;
		}
		//Define the printInitials method
		public void printInitials()
		{
			//The execution of the print statement for each Initials object
			System.out.println("My initials are:  "+ firstName.charAt(0)+ lastName.charAt(0));
		}
	}
	
	//SumAverages Class(Class for Question 3)
		//Define the SumAverages class
	public static class SumAverages{
		//Initialize the number1 variable
		public int number1;
		//Initialize the number2 variable
		public int number2;
		//Initialize the number3 variable
		public int number3;
		//Define the Constructor for the SumAverages object using three integer inputs named int1,int2,and int3
		public SumAverages(int int1, int int2,int int3){
			//Assign the int1 input to the number1 variable
			number1 = int1;
			//Assign the int2 input to the number2 variable
			number2 = int2;
			//Assign the int3 input ot the number3 variable
			number3 = int3;
		}
		//Define the printSumAverage method
		public void printSumAverage(){
			//Initialize the sum variable
			int sum;
			//Initialize the average variable
			int average;
			//Get the sum of number1,2,3 by addition of the integers in the variables
			sum = number1 + number2 + number3;
			//Get the average of the numbers by division of the sum by three(total number of variables in the sum)
			average = sum / 3;
			//Execution of the print statement for the printSumAverage method
			System.out.println("The Average of the numbers you entered were " + average + ", and the sum was "+ sum +"." );
		}
	}
	
	//Circle Class (Class for Question 4)
		//Define the Circle class 
	public static class Circle{
		//Initialize the radius variable
		public int radius;
		//Define the constructor for the Circle class that uses an integer input named userinputradius
		public Circle(int userinputradius){
			//Assign the input userinputradius to the variable radius
			radius = userinputradius;
		}
		//Define the getArea method
		public void getArea(){
			//Initialize the circlearea variable
			double circlearea;
			//Assign the result of the formula to the circlearea variable
			circlearea = Math.PI * (radius * radius);
			//Execute the print statement for the getArea method
			System.out.println("The Circle's Area is: "+ circlearea);
		}
	}

	//OptimalWeight Class (Class for Question 5)
		//Define the OptimalWeight Class
	public static class OptimalWeight{
		//Initialize the height variable
		public double height;
		//Initialize the age variable
		public double age;
		//Define the Constructor for the OptimalWeight Class that creates the object using two double types named dub1 and dub2
		public OptimalWeight(double dub1, double dub2){
			//Assigning the dub1 input to the height variable
			height = dub1;
			//Assigning the dub2 input ot the age variable
			age = dub2;
		}
		//Defining the printOptimalweight method
		public void printOptimalweight(){
			//Initializing the optimalweight variable
			double optimalweight;
			//Assigning the result of the formula to the optimalweight variable
			optimalweight = (height - (100.0 + ( age/ 10.0 )))*( 9.0 / 10.0 );
			//Executing the system print for the printOptimalweight method
			System.out.println("The optimal weight for you based on a height of: "+ height + " Centimeters and an age of: " + age + " is: " + optimalweight +" Kgs or " + (optimalweight * 2.2046) + " lbs");
		}
	}
	
	//Stringify Class (Class for Question 7- 6 did not need a class in my determination)
		//Defining the Stringify Class
	public static class Stringify{
		//Initializing the input_string variable
		String input_string;
		//Initializing and assigning the a character to the occurrence variable
		String occurrence = "a";
		//Defining the constructor for the Stringify class that uses a string input named inpstring
		public Stringify(String inpstring){
			//assigning the string input to the input_string variable
			input_string = inpstring;
		}
		//Defining the getfirstchar method
		public void getfirstchar(){
			//initializing the firstchar variable
			char firstchar;
			//Assigning the Character at index 0 to first char
			firstchar = input_string.charAt(0);
			//Executing the print statement for the getfirstchar method
			System.out.println("The first character in the string is " + firstchar);
		}
		//Defining the getfirstchar method
		public void getfirstlasta(){
			//Initializing the first variable
			int first;
			//Initializing the last variable
			int last;
			//Assigning the character that exists at the first index of the occurrence variable ("a")
			first = input_string.indexOf(occurrence);
			//Assigning the character that exists at the last index of the occurrence variable ("a")
			last = input_string.lastIndexOf(occurrence);
			//Print out the first occurrence of the character
			System.out.println("The first occurrence of "+ occurrence + " Exists at " + first);
			//Print out the last occurrence of the character 
			System.out.println("The last occurrence of "+ occurrence + " Exists at " + last);
		}
		//Defining the getfirstfour method
		public void getfirstfour(){
			//Initializing the firstfour variable
			String firstfour;
			//Selecting the first four index characters of the string and assigning them to firstfour
			firstfour = input_string.substring( 0 , 4);
			//Executing the print for the getfirstfour method
			System.out.println("The first four characters of the string are, "+ firstfour);
		}
		//Defining the getcharacters method
		public void getcharacters(){
			//Initializing the number_chars variable
			int number_chars;
			//Getting the length of the string (including whitespace) and assigning it to chumber_chars variable 
			number_chars = input_string.length();
			//Executing the print for the method getcharacters
			System.out.println("The total number of characters in the string including white-space is " + number_chars);
		}
		//Defining the makeuppercase method
		public void makeuppercase(){
			//Initializing the upper_string variable
			String upper_string;
			//Performing the toUpperCase method for the string input_string and assigning it to upper_string variable
			upper_string = input_string.toUpperCase();
			//Executing the pring for the makeuppercase method
			System.out.println(upper_string);
		}
	}
	//Numbertext Class (Question 8 Class)
		//Defining the Numbertext class
	public static class Numbertext{
		//Initializing the input_numbertext variable
		String input_numbertext;
		//Defining the constructor for the Numbertext class that uses a string named inpstring
		public Numbertext(String inpstring){
			//Assigning the string input inpstring to the input_numbertext variable 
			input_numbertext = inpstring;
		}
		//Defining the getnumbersandcount method
		public void getnumbersandcount(){
			//Initializing the count variable
			int count = 0;
			//Initializing the holder variable and "blanking out" the string
			String holder = "";
			//Create the loop for each integer of i where i less than the length of the string iterate and increase i by one
			for (int i = 0; i < input_numbertext.length(); i++){
				//Initialize the c variable and assign the character to the variable for the index position of i
				char c = input_numbertext.charAt(i);        
				//Check to see if the character c is a Digit (Containing the Unicode value associated with a digit)
				if (Character.isDigit(c)){
					//If c is a number increase the count variable by one
					count++;
					//Of c is a number perform an accumulative add of the current character to string with a blank space 
					holder = holder + " " + c;
				}
			}
			//Execute the print statement for the getnumbersandcount method
		    System.out.println("The total number of numeric entrys are " + count + " and the numbers in the string are "+ holder);
		}
	}	
}


