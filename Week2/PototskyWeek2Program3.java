/** This Program was developed by Jason Pototsky
 1/18/2014 for Week 2 Assignment Program 3
 For CST200 Core Data Strs w/OOP - 25311
 Instructor: Andreea-Maria Molnar
 **/
/*******************************************************Region Import**************************************************************************************************************/

/*******************************************************End Region Import**********************************************************************************************************/
/*******************************************************Region Superclass**********************************************************************************************************/
//Define the main class
public class PototskyWeek2Program3 {
/*******************************************************Region Main****************************************************************************************************************/
	//Define the main
	public static void main(String[] args) {
		//Create a new object named oneperson
		Person oneperson = new Person();
		//Execute the setName method
		oneperson.setName("james");
		//Execute the happyBirthday method
		oneperson.happyBirthday();
		//Get the age of the oneperson object
		System.out.println(oneperson.getAge());
		//Get the name of the oneperson object
		System.out.println(oneperson.getName());
		//Execute the ageMeByInt method
		oneperson.ageMeByInt(4);
		//Get the new age of the oneperson object
		System.out.println(oneperson.getAge());
	}
/*******************************************************End Region Main************************************************************************************************************/
/*******************************************************Region Sub-Class***********************************************************************************************************/
	//Define the person class
	public static class Person{
		//Define the name variable
		String name;
		//Define the age variable
		int age;
/*******************************************************Region Methods*************************************************************************************************************/
		//Define the constructor for Person class	
		public Person(){
			//On new Person objects assign the name a blank string
			this.name = "";
			//On new Person objects assign the age to be 0
			this.age = 0;
		}
		//Define the setName method using string input
		public void setName(String input1){
			//Change the blank name to a name based upon the input
			this.name = input1;
		}
		//Define the getName method
		public String getName(){
			//Return the name of the person object
			return name;
		}
		//Define the getAge method
		public int getAge(){
			//Return the age of the person object
			return age;
		}
		//HAPPY BIRTHDAY
		public void happyBirthday(){
			//Incremement the age
			age++;
		}
		//Define the ageMeByInt method
		public void ageMeByInt(int input1){
			//Loop based upon on an input
			for (int i=0; i<input1;i++){
				//Incremement the age
				age++;
			}
		}
	}
/*******************************************************End Region Sub-Class*******************************************************************************************************/
/*******************************************************End Region Methods*********************************************************************************************************/
}
/*******************************************************End Region Superclass******************************************************************************************************/