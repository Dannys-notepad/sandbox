package com.dannys_notepad.sandbox;

import java.util.Scanner;

public class rockPaperScissors {

  static String computer(){
    String cards[] = {"rock", "paper", "scissors"};
    int randomPick = (int) Math.floor(Math.random() * cards.length);
    return cards[randomPick];
  }
  
  public static void main(String[] args) {
  	try{
  	  Scanner reader = new Scanner(System.in);
  	  
  	  int userWins = 0,
  	  cpuWins = 0,
  	  draws = 0,
  	  userLoses = 0,
  	  cpuLoses = 0, usersChoice;
  	  String computersChoice;
  	  
  	  String words[] = {"rock", "paper", "scissors"};
  	  
  	  System.out.println("Welcome to the Rock Paper Scissors game");
  	  System.out.print("Enter:\n 0 to pick rock\n 1 to pick Paper\n 2 to pick Scissors\n enter any number greater than 2 to end the game: ");
  	  usersChoice = reader.nextInt();
  	  computersChoice = computer();
  	  
  	  while(usersChoice <= 2){
  	    
  	    System.out.println(" Computer: " + computersChoice + "\n Human: " + words[usersChoice]);
  	    if(words[usersChoice] == computersChoice){
  	     	System.out.println("Ooh...that's a draw");
  	     	draws++;
  			}else if(words[usersChoice] == "rock" && computersChoice == "paper"){
  			  System.out.println("You lose, paper covers rock");
  			  userLoses++;
  			  cpuWins++;
 			 }else if(words[usersChoice] == "paper" && computersChoice == "rock"){
 			   System.out.println("Paper covers rock, you win!");
 			   userWins++;
 			   cpuLoses++;
 			 } else if(words[usersChoice] == "paper" && computersChoice == "scissors"){
 			 System.out.println("You lose, scissors cuts paper");
 			 cpuWins++;
 			 userLoses++;
 			   
			  }else if(words[usersChoice] == "scissors" && computersChoice == "paper"){
			    System.out.println("Scissors cuts paper, you win!");
			    userWins++;
			    cpuLoses++;
 			}else if(words[usersChoice] == "rock" && computersChoice == "scissors"){
 			  System.out.println("Rock smashes scissors, you win!");
 			  userWins++;
 			  cpuLoses++;
			 }if(words[usersChoice] == "scissors" && computersChoice == "rock"){
 			  System.out.println("Rock smashes scissors, you lose!");
 			  cpuWins++;
 			  userLoses++;
			 }
  	    System.out.print("Pick again: ");
  	    usersChoice = reader.nextInt();
  	    computersChoice = computer();
  	    
  		}
  		System.out.println("\nGame stats\n");
  		System.out.println("Human:\nwins: " + userWins + "\nloses: " + userLoses + "\ndraws:" + draws);
  		System.out.println("---------");
  		System.out.println("Computer:\nwins: " + cpuWins + "\nloses: " + cpuLoses + "\ndraws:" + draws);
  	  
  	  reader.close();
  	  
  	}catch(Exception e){
  	  System.out.println("Something went wrong");
 	 }
  }

}
