package orderingsystem;

import java.util.Scanner;

public class OrderingApp {
	
	private Restaurant[] Restaurants = new Restaurant[5];
	
	public static void main(String[] args) {
		OrderingApp orderApp = new OrderingApp();
	    Food food1 = new Food("Pepperoni Pizza",20.0f);
	    Food food2 = new Food("Chicken Burger",15.0f);
	    Food food3 = new Food("Barbequed Ribs",34.5f);
	    Food food4 = new Food("Paella",20.0f);
	    Food food5 = new Food("Fried Rice",20.0f);
	    
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
	    
	    orderApp.addRestaurantToList(res1);
	    orderApp.addRestaurantToList(res2);
	    orderApp.addRestaurantToList(res3);
	    orderApp.addRestaurantToList(res4);
	    orderApp.addRestaurantToList(res5);
	    
	    
	    Scanner userInput = new Scanner(System.in);
	    System.out.println("Enter food name: ");
	    String searchStr = userInput.nextLine(); 
	    orderApp.searchInRestaurantList(searchStr);
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
    
    private void searchInRestaurantList(String searchStr) {
    	for(int i = 0; i<Restaurants.length; i++){
    		if(Restaurants[i]!=null) {
    			Restaurants[i].searchInMenu(searchStr);
    		}
    	}
    }

}
