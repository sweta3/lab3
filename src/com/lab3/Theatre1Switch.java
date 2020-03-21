package com.lab3;
//Theatre1Switch.java -- the instantiable class, uses the switch selection statement 
//to determine the price of a theatre ticket based on a given day
public class Theatre1Switch {
	 // declare instance variable to store the day
	private String day="";
	private String message;
    // Constructor - initialize the day with the empty string;
    // by default the day instance variable is initialized with null;
	public Theatre1Switch() {
		
	}
	public Theatre1Switch(String day) {
		this.day=day;
	}
    // declare a setter method for each of the instance variables that can be set/ assigned a value
    // setter method for the day instance variable
	public void setDay(String day) {
		this.day= day;
	}
	public void calculatePrice() {
		switch(day) {
	   case "monday":
	   case "tuesday":
	   case "thursday":
		   message = "Price: 20";
		   break;
	   case "friday":
	   case "saturday":
	   case "sunday":
		   message = "Price: 30";
		   break;
	   default:   
		   message="The day is not valid";
		   break;
	   }
	}
    public String getMessage(){
        return message;
	}
}
