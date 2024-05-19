package com.dannys_notepad.sandbox;

import java.util.Scanner;

public class takeAGuess {

  public static void main(String[] args) {
  	Scanner reader = new Scanner(System.in);
  	
  	int tries = 5;
  	int randNum = (int) Math.floor(Math.random()*10)+1;
  	//System.out.println(randNum);
  	
  	System.out.print("Guess a number from 1-10: ");
  	double userInput = reader.nextDouble();
  
  for(int i = 5; i != 0; i--){
    if(userInput == randNum){
      System.out.println("You got it with " + tries + " tries left");
      break;
    }else{
      tries--;
      System.out.print("Wrong! try again: ");
      userInput = reader.nextDouble();
      if(tries == 0){
        System.out.println("Sorry you exhausted your tries, the number was " + randNum);
      }
    }
  }
  
  reader.close();
  
 }
}
