package paymentservicepublisher;

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
	
	String name, number, email;
	String amount;
	Integer bookingID;
	String bankCard;
	
	@Override
	public String publishService() {
		basicData();
		
		System.out.println("Confirm the payment? Y/N");
		String accept  = in.next();
		
		if(accept.equalsIgnoreCase("N") ) {
			System.out.println(" ");
			System.out.println("Payment has been canceled sucessfully...");
			System.out.println(" ");
			basicData();
		}
		else if(accept.equalsIgnoreCase("Y") ) {
			System.out.println(" ");
			System.out.println("Payment Sucessful. Thank You! ");
			System.out.println(" ");
		}
		return "+++++++++++++++++++++++++++++++++++++";
       
	}
	
	public void basicData() {
		
		Scanner sc = new Scanner(System.in);

		
		System.out.println(" ");
		System.out.println("=====================================");
		System.out.println(" ");
		System.out.println("        Welcome to the payment section. Now you can pay at anytime for already booked events and accomodations..");
		System.out.println(" ");
		System.out.println("=====================================");
		
		System.out.println("Please enter your name :");
		name = sc.nextLine();
	
		System.out.println("Please enter your email address :");
		email = sc.nextLine();
		
		System.out.println("Please enter the booking ID : ");
		bookingID = sc.nextInt();
		
		System.out.println("\n=========== Hello "+ name + "! Now you can pay either full amount or pay any amount using Debit or Credit card and pay the rest of the amount when you arrive the Hotel..========\n");
		
		System.out.println("Please enter the amount you want to pay : ");
		amount = sc.next();
		
		bankCardValidation();
		
	}
	
	public void bankCardValidation()
	{
		boolean isValid = false;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your bank card number: ");
		bankCard = sc.next();
		
		while(!isValid) {
					
			if(bankCard.length() == 8) {
				isValid = true;
			}
			else {
				System.out.println("Invalid card number. Please enter again: ");
				bankCard = sc.next();
				isValid = false;
			}
		}
		
		
		if(isValid == true) {
			System.out.println("Enter expiry date: ");
			String expDate = sc.next();
	
			System.out.println("Enter CVV: ");
			String cvv = sc.next();
			
			if(cvv.length() == 3) {
				isValid = true;
			}
			else {
				System.out.println("Invalid CVV. Please enter again: ");
				cvv = sc.next();
				isValid = false;
			}
			
			System.out.println("---------------------------------------------------");
			System.out.println("-----------Card Details--------------------");
			System.out.println("Card number: 	  " +bankCard);
			System.out.println("Card expiry date: " +expDate);
			System.out.println("Card CVV:	  " +cvv);
			System.out.println();
		}
		
		System.out.println("Is card details are correct? Y/N");
		String accept  = in.next();
		
		if(accept.equalsIgnoreCase("N") ) {
			System.out.println(" ");
			System.out.println("Okay let's try again...");
			System.out.println(" ");
			bankCardValidation();
		}
		else if(accept.equalsIgnoreCase("Y") ) {
			System.out.println(" ");
			System.out.println("-----------Payment Details--------------------");
			System.out.println("Customer name :     	 " +name);
			System.out.println("Customer email address:  " +email);
			System.out.println("Booking ID : 	 	 " +bookingID);
			System.out.println("Amount : 	  	 " +amount+".00 LKR");			
			System.out.println("Payment will be done by the card " +bankCard);
			System.out.println();
		}
	}
}
