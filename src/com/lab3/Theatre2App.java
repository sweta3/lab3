package com.lab3;
import java.util.*;
//Use instantiable classes in your application. Save the instantiable class as Theatre2.java
//Theatre2App.java 
//	-- prompts the user to input a day and the age of the customer
//	-- uses the instantiable class Theatre2 to determine the actual cost of a theatre ticket based on the given day and age

public class Theatre2App {

	public static void main(String[] args) {
		   // declare a variable to store the day entered by the user
    	String day;
    	int age;
    	
        // declare a variable named t and create an object of type Theatre1If
    	Theatre2 t = new Theatre2();
        // create an object of type Scanner to allow input from the keyboard
    	Scanner input = new Scanner(System.in);
        // input
        // prompt the user to input a day
    	System.out.println("Please enter the day: ");
        // reads a single word from the keyboard
    	day=input.next();
    	day=day.toLowerCase();
    	
    	System.out.println("Please enter age: ");
    	age=input.nextInt();
        // use (i.e. by calling/invoking) the setter method setDay()
    	// to store in the instnce variable named day of the object t the day provided by the user
    	t.setDay(day);
    	t.setAge(age);
        // processing: calculate the price of a tiket in the given day
    	t.calculatePrice();
        // output
        // invoke/call the getter method getPrice() to retrieve the cost of the ticket
    	String m = t.getMessage();
    	System.out.println(m);


	}

}
