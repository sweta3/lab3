package com.lab3;
import java.util.*;
public class Theatre1IfApp {
    public static void main(String args[]){
        // declare a variable to store the day entered by the user
    	String day;
    	
        // declare a variable named t and create an object of type Theatre1If
    	Theatre1If t = new Theatre1If();
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
        // it is not mandatory, but we can display a user friendly message in case that the day is not valid
        // (recall that the calculatePrice() method of the Theatre1If class assigns/stores in the price instance variable 
    	//if the day is invalid)
    }
}
