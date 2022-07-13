package orderingsystem;

import java.util.Scanner;

public class OrderingApp {
	
	private Restaurant[] Restaurants = new Restaurant[5];
	
	public static void main(String[] args) {
		OrderingApp orderApp = new OrderingApp();
	    Food food1 = new Food("Pepperoni Pizza",20.0f);
	    Food food2 = new Food("Chicken Burger",15.0f);
	    Food food3 = new Food("Barbequed Ribs",34.5f);
	    Food food4 = new Food("Paella",18.0f);
	    Food food5 = new Food("Fried Rice",13.0f);
	    Food food6 = new Food("Meat Lovers Pizza",26.0f);
	    Food food7 = new Food("Angus Burger",18.0f);
	    Food food8 = new Food("Grilled Lamb",35.99f);
	    Food food9 = new Food("Croquetas",5.0f);
	    Food food10 = new Food("Fried Noodles",14.05f);
	    
	    Restaurant res1 = new Restaurant("Awesome Pizza Place");
	    Restaurant res2 = new Restaurant("Wild Burger Joint");
	    Restaurant res3 = new Restaurant("American BBQ");
	    Restaurant res4 = new Restaurant("Spanish Delights");
	    Restaurant res5 = new Restaurant("Asian Takeaway");

	    res1.addFoodToMenu(food1);
	    res2.addFoodToMenu(food2);
	    res3.addFoodToMenu(food3);
	    res4.addFoodToMenu(food4);
	    res5.addFoodToMenu(food5);
	    res1.addFoodToMenu(food6);
	    res2.addFoodToMenu(food7);
	    res3.addFoodToMenu(food8);
	    res4.addFoodToMenu(food9);
	    res5.addFoodToMenu(food10);
	    
	    orderApp.addRestaurantToList(res1);
	    orderApp.addRestaurantToList(res2);
	    orderApp.addRestaurantToList(res3);
	    orderApp.addRestaurantToList(res4);
	    orderApp.addRestaurantToList(res5);
	    
	    
	    //Gets user input, prompts for input until q is entered
	    Scanner userInput = new Scanner(System.in);
	    while(true) {
    	  System.out.println("Enter food name: ");
    	  String searchStr = userInput.nextLine();
    	  if(!searchStr.equalsIgnoreCase("q")) {
    		  orderApp.searchInRestaurantList(searchStr);
    	  }else {
    		  break;
    	  }
	    }
	  
	}
	
    private void addRestaurantToList(Restaurant res) {
    	if(Restaurants.length<=0) {
 	    	Restaurants[0] = res;
 		}
 	    for(int i = 0; i<Restaurants.length; i++){
 	      if(Restaurants[i]==null){
 	    	 Restaurants[i] = res;
 	        break;
 	      }
 	    }
    }
    
    //Goes through the list of every restaurant in the list and search for the food in the restaurant's menu as entered by user
    private void searchInRestaurantList(String searchStr) {
    	for(int i = 0; i<Restaurants.length; i++){
    		if(Restaurants[i]!=null) {
    			Restaurants[i].searchInMenu(searchStr);
    		}
    	}
    }

}
