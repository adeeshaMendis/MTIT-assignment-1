package accomodationservicepublisher;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;


public class ServicePublishImpl implements ServicePublish{
	
	Scanner in = new Scanner(System.in);
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
	String name;
	String number;
	String roomType, roomTypeName;
	String location;
	Integer noOfDays = 0;
	Double cost, totalCost;
	String checkInDate;
	Integer bookingID;

    
	@Override
	public String publishService() {
		basicData();
		
		System.out.println("Confirm the booking? Y/N");
		String accept  = in.next();
		
		if(accept.equals("N") || accept.equals("n")) {
			System.out.println(" ");
			System.out.println("Okay let's try again...");
			System.out.println(" ");
			basicData();
		}
		else if(accept.equals("Y") || accept.equals("y")) {
			System.out.println(" ");
			Random rand = new Random();
			bookingID = rand.nextInt(99999);
			System.out.println("Your booking has been confirmed. Your booking ID is " + String.format("%05d", bookingID) +  " Thank you!...");
			System.out.println(" ");
			//recieptPrinter();
		}
		return "+++++++++++++++++++++++++++++++++++++";
       
	}
	
	public void basicData() {
		
		try
	    {	
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(" ");
		System.out.println("=====================================");
		System.out.println(" ");
		System.out.println("        Welcome! Our luxury accommodation will help you & your loved ones to experience a great time..");
		System.out.println(" ");
		System.out.println("=====================================");
		
		System.out.println("Please enter your name :");
		name = input.readLine();
		System.out.println("Please enter your contact number : ");
		number = input.readLine();
		System.out.println(" ");
		System.out.println("---------------Hello " + name + "! Check out our accommodation options laced with luxury-------------------------");
		System.out.println();
		System.out.println("--A)-- STANDARD ROOM		16,000 LKR per day");
		System.out.println(" 	Capacity: 		2 Adults, 2 Children\n ");
		System.out.println("--B)-- DELUXE ROOM		20,000 LKR per day");
		System.out.println("	Capacity: 		3 Adults, 2 Children\n ");
		System.out.println("--C)-- EXCLUSIVE BUYOUT		32,000 LKR per day");
		System.out.println("	Capacity:  		6 Adults, 2 Children ");
		System.out.println(" ");
		System.out.println("Please select the accommodation option you desire [ A | B | C ]");
		System.out.println("A) STANDARD ROOM \t B) DELUXE ROOM  \t C) EXCLUSIVE BUYOUT  ");
		roomType = input.readLine();
		
		if(roomType.equalsIgnoreCase("A")) {
			
			cost = 16000.00;
			roomTypeName = "STANDARD ROOM";
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("        " +roomTypeName + " Room Details   ");
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("* Bed: 		King Bed");
			System.out.println("* Capacity: 	2 Adults, 2 Children ");
			System.out.println("* Room size:	30m^2");
			System.out.println("* View: 	Lake View");
			System.out.println("* Room Price: 	16,000 LKR");
			System.out.println(" ");
			System.out.println("=====================================");
		
			
			System.out.println("Please enter your check in date (DD/MM/YY) : ");
			checkInDate = input.readLine();
			
			System.out.println("Please enter the number of days you want this room to be booked : ");
			noOfDays = in.nextInt();
			
			totalCost = cost * noOfDays;
			
			System.out.println("");
			
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("        Booking Summary   ");
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("Name : 			" + name );
			System.out.println("Contact No : 		" + number );
			System.out.println("Room Type : 		" + roomTypeName);
			System.out.println("Check in Date : 	" + checkInDate );
			System.out.println("No of booked days : 	" + noOfDays );
			System.out.println("Room Cost: 		16,000 LKR");
			System.out.println("Total Cost: 		" + totalCost+"0 LKR");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("");
			
		} else if(roomType.equalsIgnoreCase("B") ) {
			
			cost = 20000.00;
			
			roomTypeName = "DELUXE ROOM";
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("        " +roomTypeName + " Room Details   ");
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("* Bed: 		King Bed");
			System.out.println("* Capacity: 	3 Adults, 2 Children ");
			System.out.println("* Room size: 	70m^2");
			System.out.println("* View: 	Lake View");
			System.out.println("* Room Price: 	20,000 LKR");
			System.out.println(" ");
			System.out.println("=====================================");
		
			
			System.out.println("Please enter your check in date (DD/MM/YY) : ");
			checkInDate = input.readLine();
			
			System.out.println("Please enter the number of days you want this room to be booked : ");
			noOfDays = in.nextInt();
			
			totalCost = cost * noOfDays;
			
			System.out.println("");
			
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("        Booking Summary   ");
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("Name : 			" + name );
			System.out.println("Contact No : 		" + number );
			System.out.println("Room Type : 		" + roomTypeName);
			System.out.println("Check in Date : 	" + checkInDate );
			System.out.println("No of booked days : 	" + noOfDays );
			System.out.println("Room Cost: 		20,000 LKR");
			System.out.println("Total Cost: 		" + totalCost+"0 LKR");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("");
			
			System.out.println("");
			
		} else if(roomType.equalsIgnoreCase("C") ) {
			
			cost = 32000.00;
			
			roomTypeName = "EXCLUSIVE BUYOUT";
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("        " +roomTypeName + " Room Details   ");
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("* Bed: 		2 King Beds");
			System.out.println("* Capacity:  	6 Adults, 2 Children ");
			System.out.println("* Room size: 	55m^2");
			System.out.println("* View: 	Lake View");
			System.out.println("* Room Price: 	32,000 LKR");
			System.out.println(" ");
			System.out.println("=====================================");
		
			
			System.out.println("Please enter your check in date (DD/MM/YY) : ");
			checkInDate = input.readLine();
			
			System.out.println("Please enter the number of days you want this room to be booked : ");
			noOfDays = in.nextInt();
			
			totalCost = cost * noOfDays;
			
			System.out.println("");
			
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("        Booking Summary   ");
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("Name : 				" + name );
			System.out.println("Contact No : 		" + number );
			System.out.println("Room Type : 		" + roomTypeName);
			System.out.println("Check in Date : 	" + checkInDate );
			System.out.println("No of booked days : 	" + noOfDays );
			System.out.println("Room Cost: 		32,000 LKR");
			System.out.println("Total Cost: 		" + totalCost+"0 LKR");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("");
			
			
		} 
		return;
      } catch (Exception ex) { }
	}
	
	/*public void recieptPrinter() {
		try {
			PrintStream pw = new PrintStream(new File("D:/Downloads/output.txt"));
			if(packageType.equals("Platinum") || packageType.equals("platinum")) {			
				pw.println("+++++++++++++++++++++++++++++++++++++");
				pw.println("");
				pw.println("=====================================");
				pw.println("        Booking Receipt   ");
				pw.println("=====================================");
				pw.println(" ");
				pw.println("Name: " + name);
				pw.println("Contact No: " + number);
				pw.println("Date: " + date);
				pw.println("Venue: " + location);
				pw.println(" ");
				pw.println("+++++++++++++++++++++++++++++++++++++");
				pw.println(" ");
				pw.println("Service Type : Photography Service");
				pw.println("Package: " + packageType );
				pw.println("Total: " + cost);
				pw.println(" ");
				pw.println("+++++++++++++++++++++++++++++++++++++");
				pw.println("");
			} 
			else if(packageType.equals("Gold") || packageType.equals("gold")) {
				pw.println("+++++++++++++++++++++++++++++++++++++");
				pw.println("");
				pw.println("=====================================");
				pw.println("        Booking Receipt   ");
				pw.println("=====================================");
				pw.println(" ");
				pw.println("Name: " + name);
				pw.println("Contact No: " + number);
				pw.println("Date: " + date);
				pw.println("Venue: " + location);
				pw.println(" ");
				pw.println("+++++++++++++++++++++++++++++++++++++");
				pw.println(" ");
				pw.println("Service Type : Photography Service");
				pw.println("Package: " + packageType );
				pw.println("Total: " + cost);
				pw.println(" ");
				pw.println("+++++++++++++++++++++++++++++++++++++");
				pw.println("");
			} 
			else if(packageType.equals("Silver") || packageType.equals("gold")) {
				pw.println("+++++++++++++++++++++++++++++++++++++");
				pw.println("");
				pw.println("=====================================");
				pw.println("        Booking Receipt   ");
				pw.println("=====================================");
				pw.println(" ");
				pw.println("Name: " + name);
				pw.println("Contact No: " + number);
				pw.println("Date: " + date);
				pw.println("Venue: " + location);
				pw.println(" ");
				pw.println("+++++++++++++++++++++++++++++++++++++");
				pw.println(" ");
				pw.println("Service Type : Photography Service");
				pw.println("Package: " + packageType );
				pw.println("Total: " + cost);
				pw.println(" ");
				pw.println("+++++++++++++++++++++++++++++++++++++");
				pw.println("");
			} 
			else if(packageType.equals("A") || packageType.equals("a")) {
				pw.println("+++++++++++++++++++++++++++++++++++++");
				pw.println("");
				pw.println("=====================================");
				pw.println("        Booking Receipt   ");
				pw.println("=====================================");
				pw.println(" ");
				pw.println("Name: " + name);
				pw.println("Contact No: " + number);
				pw.println("Date: " + date);
				pw.println("Venue: " + location);
				pw.println(" ");
				pw.println("+++++++++++++++++++++++++++++++++++++");
				pw.println(" ");
				pw.println("Service Type : Photography Service");
				pw.println("Package: " + packageType );
				pw.println("Total: " + cost);
				pw.println(" ");
				pw.println("+++++++++++++++++++++++++++++++++++++");
				pw.println("");
			} 
			else if(packageType.equals("B") || packageType.equals("b")) {
				pw.println("+++++++++++++++++++++++++++++++++++++");
				pw.println("");
				pw.println("=====================================");
				pw.println("        Booking Receipt   ");
				pw.println("=====================================");
				pw.println(" ");
				pw.println("Name: " + name);
				pw.println("Contact No: " + number);
				pw.println("Date: " + date);
				pw.println("Venue: " + location);
				pw.println(" ");
				pw.println("+++++++++++++++++++++++++++++++++++++");
				pw.println(" ");
				pw.println("Service Type : Photography Service");
				pw.println("Package: " + packageType );
				pw.println("Total: " + cost);
				pw.println(" ");
				pw.println("+++++++++++++++++++++++++++++++++++++");
				pw.println("");
			} 
			else if(packageType.equals("C") || packageType.equals("c")) {
				pw.println("+++++++++++++++++++++++++++++++++++++");
				pw.println("");
				pw.println("=====================================");
				pw.println("        Booking Receipt   ");
				pw.println("=====================================");
				pw.println(" ");
				pw.println("Name: " + name);
				pw.println("Contact No: " + number);
				pw.println("Date: " + date);
				pw.println("Venue: " + location);
				pw.println(" ");
				pw.println("+++++++++++++++++++++++++++++++++++++");
				pw.println(" ");
				pw.println("Service Type : Photography Service");
				pw.println("Package: " + packageType );
				pw.println("Total: " + cost);
				pw.println(" ");
				pw.println("+++++++++++++++++++++++++++++++++++++");
				pw.println("");
			} 
			else {
				pw.println("");
			}	
			pw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/

}
