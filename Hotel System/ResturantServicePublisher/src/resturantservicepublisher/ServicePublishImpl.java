package resturantservicepublisher;

import java.util.Random;
import java.util.Scanner;

public class ServicePublishImpl implements ServicePublish {
		Scanner input = new Scanner(System.in);
		
		String name;
		String serviceType;
		Integer quantity;
		String packageType;
		Double cost;
		String requests, takeAwayOrDeliveryChoice, address, contactNo;
		Integer orderID;
		
		@Override
		public void publishService() {
			basicData();
		
			System.out.println("Confirm the order? Y/N");
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
				orderID = rand.nextInt(99999);
				System.out.println("Your order has been confirmed. Your order ID is " + String.format("%05d", orderID) +  " Thank you for choosing us!...");
				System.out.println(" ");
			}else {
				System.out.println("");
			}
		}
		
		public void basicData() {
			
			
			System.out.println();
			System.out.println("=====================================");
			System.out.println(" ");
			System.out.println("        Welcome! Delight yourself as we take care of everything you would want – a variety to eat to your heart’s content..");
			System.out.println(" ");
			System.out.println("=====================================");
			System.out.println("Please enter your name: ");
			name = input.next();
			
			System.out.println("Hello " + name + ", Which kind of service do you need? ");
			System.out.println("A) Dine-in \tB) Take Away or Delivery \tC) Buffet Catering");
			serviceType = input.next();
			
			System.out.println("");
			
			if(serviceType.equalsIgnoreCase("A")) {
				dineIn();
				
				System.out.println("+++++++++++++++++++++++++++++");
				System.out.println(" ");
				System.out.println("Customer name: " +  name);
				System.out.println("Service type: Dine-in" );
				System.out.println("Package: " + packageType );
				System.out.println("Quantity: "+quantity  );
				System.out.println("Final Cost: " +cost+ "0 LKR");
				System.out.println("Special requests: " + requests);
				System.out.println(" ");
				System.out.println("+++++++++++++++++++++++++++++");
				
				System.out.println("");
			} 
			else if(serviceType.equalsIgnoreCase("B")) {
				takeAwayOrDelivery();
				System.out.println("+++++++++++++++++++++++++++++");
				System.out.println(" ");
				System.out.println("Customer name: " +  name);
				System.out.println("Service type: Take Away or Delivery" );
				System.out.println("Package: " + packageType );
				System.out.println("Quantity: "+quantity  );
				System.out.println("Take Away or Delivery: " + takeAwayOrDeliveryChoice );
				System.out.println("Final Cost: " +cost+ "0 LKR");
				System.out.println("Special requests: " + requests);
				System.out.println(" ");
				System.out.println("+++++++++++++++++++++++++++++");
				
				System.out.println("");
			} 
			else if(serviceType.equalsIgnoreCase("C")) {
				BuffetC();
				
				System.out.println("+++++++++++++++++++++++++++++");
				System.out.println(" ");
				System.out.println("Customer name: " +  name);
				System.out.println("Service type: Buffet Catering" );
				System.out.println("Package: " + packageType );
				System.out.println("Quantity: "+quantity  );
				System.out.println("Final Cost: " +cost+ "0 LKR");
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

		public void dineIn() {
			
			System.out.println("Please select a package:  ");
			System.out.println("A. Budget -  700LKR : Includes Food plate + Dessert");
			System.out.println("B. Normal - 1000LKR: Includes Food plate + Dessert + Welcome drink + Ice coffe");
			System.out.println("C. Full   - 1300LKR :Includes Food Plate+ Dessert+Welcome drink + Ice Coffe + Special Soup");
			
			packageType = input.next();
			System.out.println("Enter the quantity: ");
			quantity = input.nextInt();
			
			if(packageType.equals("A") || packageType.equals("a")) {
				packageType = "Budget";
				cost = 700.00*quantity;
			}
			else if(packageType.equals("B") || packageType.equals("b")) {
				packageType = "Normal";
				cost = 1000.00*quantity;
			}
			else if(packageType.equals("C") || packageType.equals("c")) {
				packageType = "Full";
				cost = 1300.00*quantity;
			}
			System.out.println("");
			
			System.out.println("Any special requests?");
			requests = input.next();
			
			System.out.println("");
		}
		public void BuffetC(){
			
			System.out.println("");
			
			System.out.println("Please select a package:  ");
			System.out.println("A.Classic Buffet - 2000 LKR: Hot and cold dishes served ");
			System.out.println("B.Cocktail Buffet - 1500 LKR: Savory foods and pastrys");
			System.out.println("C.Breakfast Buffet - 1000 LKR : Bread,Sausages,toats,juice,fried eggs  ");
			System.out.println("D.Fork & Finger Buffet -  2000 LKR: Small appitieties,chees,salads  ");
			System.out.println("E.Theme Buffet -  2750 LKR : customizable For special events  ");
			
			packageType = input.next();
			System.out.println("Enter the quantity: ");
			quantity = input.nextInt();
			
			if(packageType.equals("A") || packageType.equals("a") ) {
				packageType = "Classic Buffet "; 
				cost = 2000.00*quantity;
			}
			else if(packageType.equals("B") || packageType.equals("b") ) {
				packageType = "Cocktail Buffet "; 
				cost = 1500.00*quantity;
			}
			else if(packageType.equals("C") || packageType.equals("c") ) {
				packageType = "Breakfast Buffet "; 
				cost = 1000.00*quantity;
			}
			else if(packageType.equals("D") || packageType.equals("d") ) {
				packageType = "Fork & Finger Buffet "; 
				cost = 2000.00*quantity;
			}
			else if(packageType.equals("E") || packageType.equals("e") ) {
				packageType = "Theme Buffet "; 
				cost = 2750.00*quantity;
			
			}else {
				System.out.println("");
			}
			
			System.out.println("");

			
			System.out.println("Any special requests?");
			requests = input.next();
			
			System.out.println("");				
		}
		
		public void takeAwayOrDelivery() {
			
			System.out.println("");
			
			System.out.println("Please select a package:  ");
			System.out.println("A.Full Meal - 500 LKR : Meal Only ");
			System.out.println("B.Snaks and beverages - 300 LKR : Snacks + Coke ");
			System.out.println("C.Unlimited - 700 LKR : Meals + Snacks +Coke");
			
			System.out.println("Or our special menu:  ");

			System.out.println("D. Mixed Grill Beef/Pork/Chicken/Sausages/Fried Egg \t LKR. 2,400 \nWith grilled vegetables with a slice of Pineapple");
			System.out.println("E. Grilled Chicken/Seafood \t LKR. 1,650 \nWith Garden Veggies and your Choice of Potatoes ( Mashed / Fries )");
			System.out.println("F. Honey Glazed BBQ Pork Ribs \t LKR. 1,650 ");

			packageType = input.next();
			System.out.println("Enter the quantity: ");
			quantity = input.nextInt();
			
			if(packageType.equals("A") || packageType.equals("a") ) {
				packageType = "Full Meal ";
				cost = 500.00*quantity;
			}
			else if(packageType.equals("B") || packageType.equals("b") ) {
				packageType = "Snaks and beverages ";
				cost = 300.00*quantity;
			}
			else if(packageType.equals("C") || packageType.equals("c") ) {
				packageType = "Unlimited";
				cost = 700.00*quantity;
			}
			else if(packageType.equals("D") || packageType.equals("d") ) {
				packageType = "Mixed Grill Beef/Pork/Chicken/Sausages/Fried Egg ";
				cost = 2400.00*quantity;
			}
			else if(packageType.equals("E") || packageType.equals("e") ) {
				packageType = "Grilled Chicken/Seafood  ";
				cost = 1650.00*quantity;
			}
			else if(packageType.equals("F") || packageType.equals("f") ) {
				packageType = "Honey Glazed BBQ Pork Ribs";
				cost = 1650.00*quantity;
			}
			else {
				System.out.println("");
			}
			
			System.out.println("Take away or Delivery? [ T | D ]");
			takeAwayOrDeliveryChoice = input.next();
			if(takeAwayOrDeliveryChoice.equals("T") || takeAwayOrDeliveryChoice.equals("t") ) 
				{
				takeAwayOrDeliveryChoice = "Take away";
				System.out.println("Any special requests?");
				requests = input.next();
				System.out.println("We will parcel your order. Thank you!");
				}
			else if (takeAwayOrDeliveryChoice.equals("D") || takeAwayOrDeliveryChoice.equals("d"))
			{
				takeAwayOrDeliveryChoice = "Delivery";
				System.out.println("Enter your address please");
				address = input.next();
				System.out.println("Enter your contact number");
				contactNo = input.next();
				System.out.println("Any special requests?");
				requests = input.next();
				System.out.println("We will bring your food to your doorstep. Thank you!");
			}
						
			System.out.println("");				
		}
	
}
