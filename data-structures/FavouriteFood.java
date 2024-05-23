package com.dannys_notepad.sandbox;

import java.util.ArrayList;
import java.util.Scanner;

public class FavouriteFoods {
  
  public static void main(String[] args) {
		ArrayList <String> favouriteFood = new ArrayList<>();
		Scanner reader = new Scanner(System.in);
		
		String food;
		
		while (true){
		  System.out.println("\n1. Add food");
		  System.out.println("2. Remove food");
		  System.out.println("3. View food");
		  System.out.println("4. exit \n");
		  
		  String input = reader.nextLine();
		  
		  if(input.toLowerCase().contains("add")){
		    System.out.print("Enter food to add: ");
		    food = reader.nextLine();
		    food.toLowerCase();
		    favouriteFood.add(food);
			}else if(input.toLowerCase().contains("remove")){
		    System.out.print("Enter food to remove: ");
		    food = reader.nextLine();
		    food.toLowerCase();
		    favouriteFood.remove(food);
			}else if(input.toLowerCase().contains("view")){
		    int num = 0;
   		 for(String foods : favouriteFood){
     		 //System.out.println("----------------");
     		 System.out.printf("\t%d. %s \n", ++num, foods);
     		 System.out.println("----------------");
   		 }
			}else if(input.toLowerCase().contains("exit")){
			  System.exit(0);
			}else{
			  System.out.println("Invalid response, please try again");
			}
		}
		//reader.close();
		
  }
  
}
