package com.lab3;
/** 
More Problems on Selection Statements
Problem 1: 
Your local theatre charges different prices during the week and during the weekends.  The prices are outlined in the table below:
Day:				Price:
Monday - Thursday		ˆ20
Friday - Sunday			ˆ30
You have been asked to develop an application that allows a user to enter the day of the week and then display the cost of a theatre ticket
 for that person based on the day of the week. 
Use instantiable classes in your application.  Save the instantiable class as Theatre1.java
Theatre1If.java -- the instantiable class, uses the if selection statement to determine the price of a theatre ticket based on a given day
*/
public class Theatre1If {
	 // declare instance variable to store the day
	private String day="";
	private String message;
	
    // Constructor - initialize the day with the empty string;
    // by default the day instance variable is initialized with null;
	public Theatre1If() {
		
	}
	public Theatre1If(String day) {
		this.day=day;
	}
    // declare a setter method for each of the instance variables that can be set/ assigned a value
    // setter method for the day instance variable
	public void setDay(String day) {
		this.day= day;
	}
	public void calculatePrice() {
		if(day.equals("monday")||day.equals("tuesday")||day.equals("wednesday")||day.equals("thursday")) {
			message = "Price: 20";	
		}else if(day.equals("friday")||day.equals("saturday")||day.equals("sunday")) {
			message="Price: 30";
		}else { // why is this else branch needed? -- if the user entered an invalid day then we should not provide a valid price for the ticket
			message = "The day is not valid";
		}
}
	 // declare a getter method for each of the instance variables
	// the method which does the actual processing: based on a given day determines the price of the ticket
    public String getMessage(){
        return message;
    }
}
	
