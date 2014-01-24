/** This Program was developed by Jason Pototsky
 1/18/2014 for Week 2 Assignment Program 4
 For CST200 Core Data Strs w/OOP - 25311
 Instructor: Andreea-Maria Molnar
 **/
import java.io.*;
/*******************************************************End Region Import*********************************************************************************************************/
/*******************************************************Region Superclass*********************************************************************************************************/
//Define the main class
public class PototskyWeek2Program4 {
/*******************************************************Region Main
 * @throws IOException ****************************************************************************************************************/
	//Define the main method for the main class
	public static void main(String[] args) throws IOException {
		
		//Creates a new computer object
		Computer labComputer = new Computer();
		
		//Print out the blank strings based upon the constructor
		System.out.println(labComputer.getComputerName());
		System.out.println(labComputer.getLoggedOnUserName());
		System.out.println(labComputer.getIpv4Address());
		System.out.println(labComputer.getMacAddress());
		
		//Set the information using the set methods
		labComputer.setComputerName("FSO0030");
		labComputer.setIpv4Address("10.135.140.80");
		labComputer.setLoggedOnUserName("FSO\\Jpototsk");
		labComputer.setMacAddress("01:23:45:67:89:ab");
		
		//Print out the new information
		System.out.println(labComputer.getComputerName());
		System.out.println(labComputer.getLoggedOnUserName());
		System.out.println(labComputer.getIpv4Address());
		System.out.println(labComputer.getMacAddress());
		
		//Implement the Release and Renew IP method
		labComputer.releaseAndRenewIP();
		//Implement the updateGroupPolicy method
		labComputer.updateGroupPolicy();
		//Implement the enablePSRemoting method
		labComputer.enablePSRemoting();
	}
/*******************************************************End Region Main************************************************************************************************************/
/*******************************************************Region Sub-Class***********************************************************************************************************/

	//Define the Computer class
	public static class Computer{
		//Define the main variables for the computer object
		public String computerName;
		public String loggedOnUserName;
		public String ipv4Address;
		public String macAddress;
		//Computer constructor method
		public Computer(){
			//Define all variables as blank string data
			this.computerName = "";
			this.loggedOnUserName = "";
			this.ipv4Address = "";
			this.macAddress = "";
		}
/*******************************************************Region Methods*************************************************************************************************************/
		//Computer Getter methods
		public String getComputerName(){
			return computerName;
		}
		public String getLoggedOnUserName(){
			return loggedOnUserName;
		}
		public String getIpv4Address(){
			return ipv4Address;
		}
		public String getMacAddress(){
			return macAddress;
		}
		//Computer Setter methods
		public void setComputerName(String input1){
			this.computerName=input1;
		}
		public void setLoggedOnUserName(String input1){
			this.loggedOnUserName = input1;
		}
		public void setIpv4Address(String input1){
			this.ipv4Address = input1;
		}
		public void setMacAddress(String input1){
			this.macAddress = input1;
		}
		//Define the releaseAndRenewIP method
		public void releaseAndRenewIP() throws IOException{
			String command = "Powershell.exe -noprofile -noninteractive \"Ipconfig /release\"";
			Runtime systemRuntime = Runtime.getRuntime();
			Process proc = systemRuntime.exec(command);
			command = "Powershell.exe -noprofile -noninteractive \"Ipconfig /renew\"";
			systemRuntime.exec(command);
			proc.getOutputStream().close();
		}
		//Define the updateGroupPolicy method
		public void updateGroupPolicy() throws IOException{
			String command = "Powershell.exe -noprofile -noninteractive \"GPUpdate /force /boot\"";
			Runtime systemRuntime = Runtime.getRuntime();
			Process proc = systemRuntime.exec(command);
			proc.getOutputStream().close();
		}
		//Define the enablePSRemoting method
		public void enablePSRemoting() throws IOException{
			String command = "Powershell.exe -noprofile -noninteractive \"Enable-PSremoting -Force\"";
			Runtime systemRuntime = Runtime.getRuntime();
			Process proc = systemRuntime.exec(command);
			proc.getOutputStream().close();
		}
	}
/*******************************************************End Region Sub-Class*******************************************************************************************************/
}
/*******************************************************End Region Superclass******************************************************************************************************/