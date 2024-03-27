package Test;

import java.util.Scanner;

public class Petrolium {

	public static void main(String[] args) {
		
		int totalCapacity=500;
		int petrolPrice=100;
		int remainingQuantity;
		int petrolPurchasedAmount;
		int usedQuantity;
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome to Indian Oil Petrolium");
		System.out.println("Petrol Capacity : 500 litres  and Price of per litre : Rs.100");
		
		System.out.println("Enter the Petrol Amount");
		int petrolAmount= s.nextInt();
		
		petrolPurchasedAmount= petrolAmount*petrolPrice;
		
		usedQuantity= petrolAmount/petrolPrice;
		
		
		remainingQuantity=totalCapacity-usedQuantity;
		totalCapacity=remainingQuantity;
		
		System.out.println(" Petrol Purchased : "+ usedQuantity+"   Litres");
		
		 
	    System.out.println("Remaining Quantity of Petrol "+remainingQuantity);
	    
	    
	    System.out.println("Thank you visit Again");
	}

}
