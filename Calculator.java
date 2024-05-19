		/* Mini CLI Calculator */

package com.dannys_notepad.sandbox;

import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
  
  	Scanner reader = new Scanner(System.in);
  	
  	int userOperand1;
  	int userOperand2;
  	int advancedOperand;
  	int calculatorMode;
  	double result;
  	String operator;
  	
  	System.out.println("Mini Calculator");
  	System.out.print("Enter the number that corresponds with the mode of calculation you want\n 1. Normal mode e.g (+, -, /, *)\n 2. Advance mode e.g (cos, sin, tan, sqrt)\n 3. Converting mode e.h (day to minutes, Celcuis to farenhite)\n : ");
  	
  	calculatorMode = reader.nextInt();
  	
  	if(calculatorMode == 1){
  	  	System.out.print("Enter first number: ");
  	  	userOperand1 = reader.nextInt();
  	  	reader.nextLine();
  	  	System.out.print("Enter operator: ");
  	  	operator = reader.nextLine();
  	  	System.out.print("Enter second number: ");
  	  	userOperand2 = reader.nextInt();
  	  	
  	  	switch(operator){
  	  	  case "+":
  	  	  	result = userOperand1 + userOperand2;
  	  	  	System.out.println(result);
  	  	  	break;
  	  	  case "-":
  	  	  	result = userOperand1 - userOperand2;
  	  	  	System.out.println(result);
  	  	  	break;
  	  	  case "*":
  	  	  	if(userOperand1 == 0){
  	  	  	  System.out.println("Any number multiplied by zero is zero");
  } else{
    	result = userOperand1 * userOperand2;
  	  System.out.println(result);
  }
  	  	  	break;
  	  	  case "/":
  	  	  	result = userOperand1 / userOperand2;
  	  	  	System.out.println(result);
  	  	  	break;
  	  	  default:
  	  	  	System.out.println("Invalid input");
  			}
    }else if(calculatorMode == 2){
      	System.out.print("Enter the number corresponding to the mode yoi want\n 1. Sine \n 2. Cosine \n 3. Tangent \n 4. Square root\n : ");
      	calculatorMode = reader.nextInt();
      	
      	switch(calculatorMode){
      	  case 1:
      	  	System.out.print("Enter number: ");
      	  	advancedOperand = reader.nextInt();
      	  	result = Math.sin(advancedOperand);
      	  	System.out.println(result);
      	  	break;
      	  case 2:
      	  	System.out.print("Enter number: ");
      	  	advancedOperand = reader.nextInt();
      	  	result = Math.cos(advancedOperand);
      	  	System.out.println(result);
      	  	break;
      	  case 3:
      	  	System.out.print("Enter number: ");
      	  	advancedOperand = reader.nextInt();
      	  	result = Math.tan(advancedOperand);
      	  	System.out.println(result);
      	  	break;
      	  case 4:
      	  	System.out.print("Enter number: ");
      	  	advancedOperand = reader.nextInt();
      	  	result = Math.sqrt(advancedOperand);
      	  	System.out.println(result);
      	  	break;
      	  default:
      	  	System.out.println("Invalid input");
      	}
    }else if(calculatorMode == 3){
      	System.out.print("Welcome to the conversion mode \nEnter:\n 1. Convert degree in Celcuis to Fahrenheit \n 2. Convert degree in Fahrenheit to Celcuis \n 3. Days to hours \n 4. Hours to minutes \n 5. minutes to seconds\n : ");
      	
      	calculatorMode = reader.nextInt();
      	
      	switch (calculatorMode){
      	  case 1:
      	  	System.out.print("Enter degree in Celcuis: ");
      	  	userOperand1 = reader.nextInt();
      	  	result = (userOperand1 * 9 / 5) + 32;
      	  	System.out.println(result);
      	  	break;
      	  case 2:
      	  	System.out.print("Enter degree in Fahrenheit: ");
      	  	userOperand1 = reader.nextInt();
      	  	result = (userOperand1 - 32) / 9 * 5;
      	  	System.out.println(result);
      	  	break;
      	  case 3:
      	  	System.out.print("Enter number of days to convert: ");
      	  	userOperand1 = reader.nextInt();
      	  	result = userOperand1 * 60;
      	  	System.out.println(result + " hours");
      	  	break;
      	  case 4:
      	  	System.out.print("Enter number of hours to convert: ");
      	  	userOperand1 = reader.nextInt();
      	  	result = userOperand1 * 60;
      	  	System.out.println(result + " minutes");
      	  	break;
      	  case 5:
      	  	System.out.print("Enter number of minutes to convert: ");
      	  	userOperand1 = reader.nextInt();
      	  	result = userOperand1 * 60;
      	  	System.out.println(result + " seconds");
      	  	break;
      	  default:
      	  	System.out.println("Invalid input");
      	}
    }else{
      	System.out.println("Invalid input");
    }
  	
  	reader.close();
   
  }
}
