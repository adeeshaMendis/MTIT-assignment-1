package com.mtit.eventservicepublisher;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class ServicePublishImpl implements ServicePublish {
	Scanner sc = new Scanner(System.in);
	Scanner input = new Scanner(System.in);
	
	
	String name, mNumber, hallType, hallTypeName, indoorHallType, indoorHallTypeName, outdoorHallType, outdoorHallTypeName, requests;
	String eventType, eventTypeName, date;
	Integer capacity, bookingID;
	Double cost;

	@Override
	public void publishService() {
		basicData();
		
		System.out.println("Confirm the booking? Y/N");
		String accept  = input.next();
		
		if(accept.equals("N") || accept.equals("n")) {
			System.out.println(" ");
			System.out.println("Thank you & Goodbye!...");
			System.out.println(" ");
			basicData();
		}
		else if(accept.equals("Y") || accept.equals("y")) {
			System.out.println(" ");
			Random rand = new Random();
			bookingID = rand.nextInt(99999);
			System.out.println("Your booking has been confirmed. Your booking ID is " + String.format("%05d", bookingID) +  " Thank you!...");
			System.out.println(" ");
			recieptPrinter();
		}
	}
	
	public void basicData() {
		
		System.out.println("Please enter your name: ");
		name = sc.nextLine();
		
		System.out.println("");
		
		System.out.println("Please enter your contact number: ");
		mNumber = sc.nextLine();
		
		System.out.println("");
		
		System.out.println("Hello " + name + ", Please select the type of the event you want to host [A | B | C]");
		System.out.println("A) Wedding \t B) Birthday party or function \t C) Meeting & Conference ");
		eventType = input.next();
		
		if(eventType.equalsIgnoreCase("A") ) 
			eventTypeName = "Wedding";
		else if(eventType.equalsIgnoreCase("B") ) 
			eventTypeName = "Birthday party or function";
		else if(eventType.equalsIgnoreCase("C") ) 
			eventTypeName = "Meeting & Conference";
		
		System.out.println(" ");
		
		System.out.println("Please enter date of the event [DD-MM-YYYY] ");
		date = input.next();
				
		System.out.println(" ");
			
		System.out.println("Please select the type of hall you want [ A | B ]");
		System.out.println("A) Indoor \t B) Outdoor ");
		hallType = input.next();
		
		if(eventType.equalsIgnoreCase("A") ) 
			hallTypeName = "Indoor";
		else if(eventType.equalsIgnoreCase("B") ) 
			hallTypeName = "Outdoor";
		
		System.out.println("");
		
		if(hallType.equals("A") || hallType.equals("a")) {
			indoorHall();
			
			System.out.println("+++++++++++++++++++++++++++++");
			System.out.println("Here is your selections.");
			System.out.println(" ");
			System.out.println("Name: " + name);
			System.out.println("Contact Number: " + mNumber);
			System.out.println("Event Type: " + eventTypeName);
			System.out.println("Date: " + date);
			System.out.println("Capacity for the event: " + capacity);
			System.out.println("Type of the hall: " + hallTypeName);
			System.out.println("Type of the indoor Hall: " + indoorHallTypeName);
			System.out.println(" ");
			System.out.println("+++++++++++++++++++++++++++++");
			System.out.println(" ");
			System.out.println("Final Cost for the hall: " + cost );
			System.out.println("Special requests: " + requests);
			System.out.println(" ");
			System.out.println("+++++++++++++++++++++++++++++");		
			System.out.println("");
		} 
		else if(hallType.equals("B") || hallType.equals("b")) {
			outdoorHall();
			
			System.out.println("Please select the outdoor hall you want [A | B | C | D]");
			System.out.println("A) Beachside \t B) Roof top ");
			
			System.out.println("+++++++++++++++++++++++++++++");
			System.out.println("Here is your selections.");
			System.out.println(" ");
			System.out.println("Name: " + name);
			System.out.println("Contact Number: " + mNumber);
			System.out.println("Event Type: " + eventTypeName);
			System.out.println("Date: " + date);
			System.out.println("Type of the hall: " + hallTypeName);
			System.out.println("Type of the outdoor Hall: " + outdoorHallTypeName);
			System.out.println(" ");
			System.out.println("+++++++++++++++++++++++++++++");
			System.out.println(" ");
			System.out.println("Final Cost for the hall: " + cost );
			System.out.println("Special requests: " + requests);
			System.out.println(" ");
			System.out.println("+++++++++++++++++++++++++++++");		
			System.out.println("");
			
		} 
		else {
			System.out.println("");
		}
		return;
	}
	
	public void recieptPrinter() {
		try {
			PrintStream pw = new PrintStream(new File("C:/Users/Adeesha/Desktop/bookingReceiptHall.txt"));
			if(hallType.equalsIgnoreCase("A")) {				
				pw.println();
				pw.println("=====================================");
				pw.println("        Booking Receipt   ");
				pw.println("=====================================");
				pw.println(" ");
				pw.println("Name : 			" + name );
				pw.println("Contact No : 		" + mNumber );
				pw.println("Event Type : 		" + eventTypeName);
				pw.println("Date: " + date);
				pw.println("Type of the hall: " + hallTypeName);
				pw.println("Type of the indoor Hall: " + indoorHallTypeName);
				pw.println(" ");
				pw.println("+++++++++++++++++++++++++++++");
				pw.println("Final Cost for the hall: " + cost );
				pw.println("Special requests: " + requests);
				pw.println(" ");
				pw.println("+++++++++++++++++++++++++++++");		
				pw.println("");
				System.out.println("The Receipt has been printed");
				
			} 
			else if(hallType.equalsIgnoreCase("B")) {
				pw.println();
				pw.println("=====================================");
				pw.println("        Booking Receipt   ");
				pw.println("=====================================");
				pw.println(" ");
				pw.println("Name : 			" + name );
				pw.println("Contact No : 		" + mNumber );
				pw.println("Event Type : 		" + eventTypeName);
				pw.println("Date: " + date);
				pw.println("Type of the hall: " + hallTypeName);
				pw.println("Type of the outdoor Hall: " + outdoorHallTypeName);
				pw.println(" ");
				pw.println("+++++++++++++++++++++++++++++");
				pw.println("Final Cost for the hall: " + cost );
				pw.println("Special requests: " + requests);
				pw.println(" ");
				pw.println("+++++++++++++++++++++++++++++");		
				pw.println("");
				System.out.println("The Receipt has been printed");
			} 
			else {
				pw.println("");
			}	
			pw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public void indoorHall() {
		
		System.out.println("Enter the capacity for the event?");
		capacity = input.nextInt();
		
		System.out.println("Please select the indoor hall you want [A | B | C | D]");
		System.out.println("A) PLATINUM 500,000/= LKR \n B) GOLD 400,000/= LKR \n C) SILVER 300,000/= LKR \n D) BRONZE 200,000/= LKR ");
		indoorHallType = input.next();

		System.out.println("");

		if(indoorHallType.equalsIgnoreCase("A")) {
			cost = 500000.00;
			indoorHallTypeName = "PLATINUM";
		}
		else if(indoorHallType.equalsIgnoreCase("B")) {
			cost = 400000.00;
			indoorHallTypeName = "GOLD";

		}
		else if(indoorHallType.equalsIgnoreCase("C")) {
			cost = 300000.00;
			indoorHallTypeName = "SILVER";

		}
		else {
			cost = 200000.00;
			indoorHallTypeName = "BRONZE";
			System.out.println("Set to default hall type BRONZE");

		}

		System.out.println("");
		
		System.out.println("Any special requests?");
		requests = sc.nextLine();
		
		System.out.println("");
	}
	public void outdoorHall() {

		System.out.println("Please select the outdoor hall you want [A | B | C | D]");
		System.out.println("A) Beachside \t B) Roof top ");
		outdoorHallType = input.next();		
		System.out.println("");
		
		if(outdoorHallType.equalsIgnoreCase("A")) {
			cost = 500000.00;
			outdoorHallTypeName = "Beachside";
		}
		else if(outdoorHallType.equalsIgnoreCase("B")) {
			cost = 400000.00;
			outdoorHallTypeName = "Roof top";
		}

		System.out.println("");
		
		System.out.println("Any special requests?");
		requests = sc.nextLine();
		
		System.out.println("");		
	}
}