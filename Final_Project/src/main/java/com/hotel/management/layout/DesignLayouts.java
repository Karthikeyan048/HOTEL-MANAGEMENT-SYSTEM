package com.hotel.management.layout;

public class DesignLayouts {
	 public static void displayWelcomeBanner() {
	        System.out.println("********************************************");
	        System.out.println("*                                          *");
	        System.out.println("*      Welcome to the Hotel Management     *");
	        System.out.println("*                  System                  *");
	        System.out.println("*                                          *");
	        System.out.println("********************************************");
	        System.out.println("Are you a customer or an admin? (Enter 'customer' or 'admin'):");
	    }
	 
	 public static void displayBookingMenu() {
	        System.out.println("===========================================");
	        System.out.println("|      Welcome to Room Booking System     |");
	        System.out.println("===========================================");
	        System.out.println("| Options:                                |");
	        System.out.println("| 1. Book a room                          |");
	        System.out.println("| 2. Cancel booking                       |");
	        System.out.println("| 3. Refund amount                        |");
	        System.out.println("| 4. Exit                                 |");
	        System.out.println("===========================================");
	        System.out.println("Enter your choice:");
	    }
	 public static void displayPaymentMenu() {
	        System.out.println("===========================================");
	        System.out.println("|        Select Payment Type              |");
	        System.out.println("===========================================");
	        System.out.println("| Options:                                |");
	        System.out.println("| 1. Credit Card                          |");
	        System.out.println("| 2. Cash                                 |");
	        System.out.println("===========================================");
	        System.out.print("Enter your choice: ");
	    }
}
