package com.lab3;
import java.util.*;

import java.util.Scanner;

//-- prompts the user to input a day
//-- uses the instantiable class Theatre1Switch to determine the actual cost of a theatre ticket based on the given da
public class Theatre1SwitchApp {

	public static void main(String[] args) {
	String day;
    	
        // declare a variable named t and create an object of type Theatre1Switch
		Theatre1Switch t = new Theatre1Switch();
        // create an object of type Scanner to allow input from the keyboard
    	Scanner input = new Scanner(System.in);

        // input
        // prompt the user to input a day
    	System.out.println("Please enter the day: ");
        // reads a single word from the keyboard
    	day=input.next();
    	day=day.toLowerCase();
        // use (i.e. by calling/invoking) the setter method setDay()
    	// to store in the instnce variable named day of the object t the day provided by the user
    	t.setDay(day);
        // processing: calculate the price of a tiket in the given day
    	t.calculatePrice();
        // output
        // invoke/call the getter method getPrice() to retrieve the cost of the ticket
    	String m = t.getMessage();
    	System.out.println(m);
	}
}
