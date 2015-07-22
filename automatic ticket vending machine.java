/*
•	Built a program to simulate an subway automatic ticket vending machine using Java
	Created methods to select the subway line and calculate the total ticket prices and change
	Created methods to print out the summary of the ticket purchases
	This program works successfully to simulate the automatic ticket vending machine
 */
package com.mitbbs;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Input the Number of Adults: ");
        int numberOfAdults = in.nextInt();
        System.out.print("Please Input the Number of Children: ");
        int numberOfChildren = in.nextInt();
        System.out.print("Please Select Your Line: 1) Red Line,2) Blue Line: ");
        int input = in.nextInt();
        int totalTicketPrice = 0;

        //The method to calculate the total ticket prices depends on the line the user choose
        if (input == 1) {
            totalTicketPrice = totalTicketPriceForRedLine(numberOfAdults, numberOfChildren);
        } else if (input == 2) {
            totalTicketPrice = totalTicketPriceForBlueLine(numberOfAdults, numberOfChildren);
        } else {
            System.out.print("Invalid Input, Please Try Again!");
            return;
        }

        System.out.println("Total Ticket Price: $ " + totalTicketPrice);
        System.out.print("Please Insert Bill: $ ");
        int money = in.nextInt();
        System.out.println("Total Inserted Bill: $ " + money);

        while (money < totalTicketPrice) {
            System.out.print("Please Insert More Bill: $ ");
            money += in.nextInt();
            System.out.println("Total Inserted Bill: $ " + money);
        }
        // This creates a summary of the ticket purchases
        System.out.println("*******************************");
        System.out.println("Summary of Your Purchases");
        System.out.println("Number of Children Ticket: " + numberOfChildren);
        System.out.println("Number of Adult Ticket: " + numberOfAdults);

        if (input == 1) {
            System.out.println("You have Chosen Red Line");
        } else {
            System.out.println("You have Chosen Blue Line");
        }
        System.out.println("Total Ticket Price: $ " + totalTicketPrice);
        System.out.println("Total Inserted Bill: $ " + money);
        System.out.println("Change: $ " + (money - totalTicketPrice));
        System.out.println("Have a Nice Trip!");
        System.out.println("*******************************");
    }

    // This method calculates the total ticket price for if you choose to take Red Line
    private static int totalTicketPriceForRedLine(int numberOfAdults, int numberOfChildren) {
        int adultTicketPrice = 10;
        int childTicketPrice = 5;
        int totalTicketPrice = adultTicketPrice * numberOfAdults + childTicketPrice * numberOfChildren;
        return totalTicketPrice;
    }

    // This method calculates the total ticket price for if you choose to take Blue Line
    private static int totalTicketPriceForBlueLine(int numberOfAdults, int numberOfChildren) {
        int adultTicketPrice = 8;
        int childTicketPrice = 4;
        int totalTicketPrice = adultTicketPrice * numberOfAdults + childTicketPrice * numberOfChildren;
        return totalTicketPrice;
    }
}
