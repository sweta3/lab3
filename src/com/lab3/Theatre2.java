package com.lab3;
/** 
More Problems on Selection Statements
Problem 2: 
The theatre has now decided to charge based both on the day of the week and on the age of the customer. The new table 
of prices is outlined below:
Day:				    Age			    Price:
Monday - Thursday   Under 5/Over 65		Free
                    5 – 15			    ˆ15
                    15 - 65			    ˆ20
Friday - Sunday		Under 5/Over 65		ˆ5
                    5 – 15			    ˆ20
                    15 - 65			    ˆ30
Use instantiable classes in your application. Save the instantiable class as Theatre2.java
Theatre2 -- the instantiable class, uses 2 nested if else selection statements to determine the cost of a theatre ticket
based on a given day and a customer's age
*/
public class Theatre2 {
	 // declare instance variable to store the day
	private String day="";
	private String message;
	private int age;
	
	//declare constructor
	public Theatre2() {
		
	}
	public Theatre2(String day, int age) {
	this.day=day;
	this.age=age;
	}
	public void setDay(String day) {
		this.day= day;
	}
	public void setAge(int age) {
		this.age= age;
	}
	public void calculatePrice() {
		if(age<5 || age>=65){
				if (day.equals("monday")||day.equals("tuesday")||day.equals("wednesday")||day.equals("thursday")){
					message = "Price: Free";
			}
		}else if(age >=5 && age <=15) {
				if (day.equals("monday")||day.equals("tuesday")||day.equals("wednesday")||day.equals("thursday")) {
					message = "Price: ˆ15";
				}
		} else if (age>15 && age<65){
				if(day.equals("monday")||day.equals("tuesday")||day.equals("wednesday")||day.equals("thursday")) {
					message = "Price: ˆ20";	
				}
		}
		if (age<5 || age>=65) {
				if (day.equals("friday")||day.equals("saturday")||day.equals("sunday")){
					message = "Price: ˆ5";
				}
			
		}else if(age >=5 && age <=15){
				if (day.equals("friday")||day.equals("saturday")||day.equals("sunday")) {
					message = "Price: ˆ20";	
				}
		}else if (age>15 || age<65) {
				if (day.equals("friday")||day.equals("saturday")||day.equals("sunday")){
					message = "Price: ˆ30";
				}
			}
		}

	  public String getMessage(){
	        return message;
	    }
}
