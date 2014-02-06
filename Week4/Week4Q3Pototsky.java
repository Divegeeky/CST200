/** This Program was developed by Jason Pototsky
 2/03/2014 for Week 4 Assignment Program 3
 For CST200 Core Data Strs w/OOP - 25311
 Instructor: Andreea-Maria Molnar
 **/
/*******************************************************Region Import*************************************************************************************************************/
/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the superclass
public class Week4Q3Pototsky {		
/*******************************************************Region Main***************************************************************************************************************/
	//Define the main
	public static void main(String[] args) {
		//Create the object
		Product product1 = new Product();
		//Print out the default (Post Constructor) value for Name
		System.out.println("The default name for this product is: " + product1.getName());
		//Print out the default (Post Constructor) value for Price
		System.out.printf("The default price for this product is: $" + "%.2f", product1.getPrice());
		//Due to printing out using formatting so it looks pretty I made a end of line.
		System.out.println("");
		//Change the name of the object
		product1.setName("Bananna");
		//Print out the changed name of the object
		System.out.println("I changed the products name now, it is now named a: " + product1.getName());
		//Change the price of the object
		product1.setPrice(3.00);
		//Print out the changed price of the object
		System.out.printf("I changed the price of the product it now costs: $" + "%.2f", product1.getPrice());
		//Due to printing out using formatting so it looks pretty I made a end of line.
		System.out.println("");
		//Call the veteransDiscount method
		product1.veteransDiscount();
		//Print out the result of the price after the method
		System.out.printf("I sold this to a Veteran, so they get money off: $" + "%.2f", product1.getPrice());
		//Due to printing out using formatting so it looks pretty I made a end of line.
		System.out.println("");
		//Reset the price back to my original setPrice
		product1.setPrice(3.00);
		//Call the discountByPercent method and use 20 for percent
		product1.discountByPercent(20);
		//Print out the resulting price
		System.out.printf("I have reset the price and then discounted by 20 percent, Lets call it a sale...yeah: $" + "%.2f", product1.getPrice());
		//Due to printing out using formatting so it looks pretty I made a end of line.
		System.out.println("");
		//Reset the price back to my original setPrice
		product1.setPrice(3.00);
		//Call the decreaseByWhole method
		product1.decreaseByWhole(1);
		//Print out the resulting price
		System.out.printf("I have reset the price and then discounted by a while number of 1 Dollar: $"+ "%.2f", product1.getPrice());
		//Due to printing out using formatting so it looks pretty I made a end of line.
		System.out.println("");
		//Reset the price back to my original setPrice
		product1.setPrice(3.00);
		//Call the increaseByPercent method
		product1.increaseByPercent(10);
		//Print out the resulting price
		System.out.printf("Supply and Demand dictates that I can get away with raising the price 10 percent : $" + "%.2f", product1.getPrice());
		//Due to printing out using formatting so it looks pretty I made a end of line.
		System.out.println("");
		//Reset the price back to my original setPrice
		product1.setPrice(3.00);
		//Call the increaseByWhole method
		product1.increaseByWhole(1);
		//Print out the resulting price
		System.out.printf("There is a sucker born every minute, so I added on a dollar here : $" + "%.2f", product1.getPrice());
		//Due to printing out using formatting so it looks pretty I made a end of line.
		System.out.println("");
	}

/*******************************************************End Region Main***********************************************************************************************************/
/*******************************************************Region Sub-Class**********************************************************************************************************/
	//Define the Product sub-class
	static class Product{
		//Define the object variables/values
		private String name;
		private double price;
/*******************************************************Region Methods************************************************************************************************************/
		//Define the Constructor for the Product Class
		Product(){
			//Initialize the name value as a blank string
			this.name = " ";
			//Initialize the price value as 0
			this.price = 0;
		}
		//Define the getter for price
		double getPrice(){
			//return the object's price
			return this.price;
		}
		//Define the getter for name
		String getName(){
			//return the object's name
			return this.name;
		}
		//Define the setter for name that accepts a string input
		void setName(String input){
			//Initialize the name value with the string input
			this.name = input;
		}
		//Define the setter for price that accepts a double input
		void setPrice(double input){
			//Initialize the price value with the double input
			this.price = input;
		}
		//Define the veteransDiscount method
		void veteransDiscount(){
			//Take 10% off the price and store that new double value in the object's price value
			this.price = price - (price * .10);
		}
		//Define the discountByPercent method that accepts an integer input
		void discountByPercent(int input){
			//Define a variable that will house the new double value for percentage
			double percentage;
			//Convert the integer to a value that can be used to determine the new price and cast it as a double value
			percentage = (double)input /100;
			//Take a percentage off the price and store that new double value in the object's price value
			this.price = price - (price * percentage );
		}
		//Define the increaseByPercent method that accepts an integer input
		void increaseByPercent(int input){
			//Define a variable that will house the new double value for percentage
			double percentage;
			//Convert the integer to a value that can be used to determine the new price and cast it as a double value
			percentage = (double)input /100;
			//"Jack the Price up" by a percentage
			this.price = price + (price * percentage);
		}
		//Define the increasedByWhole method that accepts an integer input
		void increaseByWhole(int input){
			//Increase the price by a specific whole number
			this.price = price + input;
		}
		//Define the decreaseByWhole method that accepts an integer input
		void decreaseByWhole(int input){
			//Decrease the price by a specific whole number
			this.price = price - input;
		}
/*******************************************************End Region Methods********************************************************************************************************/
	}
/*******************************************************End Region Sub-Class******************************************************************************************************/
}
/*******************************************************End Region Superclass*****************************************************************************************************/