package orderingsystem;

public class Restaurant {
	
	private Food[] Menu = new Food[99];
	private String Name = "";
	
	public Restaurant(String name) {
		setName(name);
	}
	
	private void setName(String name) {
		this.Name = name;
	}
	public String getRestaurantName() {
		return this.Name;
	}
	
	public void addFoodToMenu(Food food){
		if(Menu.length<=0) {
			Menu[0] = food;
		}
	    for(int i = 0; i<Menu.length; i++){
	      if(Menu[i]==null){
	        Menu[i] = food;
	        break;
	      }
	   }
	}
	
	public void searchInMenu(String searchStr) {
		for(int i = 0; i<Menu.length; i++){
			if(Menu[i]!=null) {
				if(Menu[i].getFoodName().equalsIgnoreCase(searchStr)){
		        	System.out.println(getRestaurantName()+", "+Menu[i].getFoodName()+", $"+Menu[i].getFoodPrice().toString());
		        	break;
				}
			}
		}
	}
}
