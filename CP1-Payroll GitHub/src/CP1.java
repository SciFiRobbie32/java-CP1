/*This program is to calculate a paycheck amount
 * Robert Hannah 11/27/2018
 * 
 */

import java.text.*;
import java.util.*;

public class CP1 {
	
	
	
		//declare variables
		static String iString; //Generic input string
		static String iFirstname, iLastname; //First and last name
		static int cHours; //hours after conversion
		static double cRate; //rate after conversion
		static double cPay; //Calculated pay
		static String oPay; //pay after formatting
		static Scanner myScanner; //input device
		static NumberFormat nf; //used to format currency
		
	public static void main(String[] args) {
		// the to do list, basically calling what needs to be done.
		
		//call input
		init();
		//call input
		input();
		//call calcs
		calcs();
		//call output
		output();
		
		System.out.println("Program Ending, have a good day!");
		
}
		public static void init() {			
			//set scanner to console
			myScanner = new Scanner(System.in);
			//change delimiter from blank space to enter key
			//to allow spaces in strings
			myScanner.useDelimiter(System.getProperty("line.separator"));
			
			//set format to us currency
			nf = NumberFormat.getCurrencyInstance(java.util.Locale.US);
			
		}
		public static void input() {
			//prompt for first name
			System.out.print("enter First Name:  ");
			iFirstname = myScanner.next();
			
			//prompt for last name
			System.out.print("Enter Last Name:  ");
			iLastname = myScanner.next();
			
			//Prompt input and convert hours
			System.out.print("Enter Hours:  ");
			iString = myScanner.next();
			cHours = Integer.parseInt(iString);
									
			//prompt input and convert rate
			System.out.print("Enter Rate:  ");
			iString = myScanner.next();
			cRate = Double.parseDouble(iString);
			
			
			
		}
		public static void calcs() {
			//calculate pay
			cPay = cHours * cRate;
			
		}
		public static void output() {
			//display name as last, first
			System.out.println("Name: " + iLastname + ", " + iFirstname);
			oPay = nf.format(cPay);
			System.out.println("Pay is: " + oPay);
			
			}
		}
