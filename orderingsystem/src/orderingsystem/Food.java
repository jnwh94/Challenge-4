package orderingsystem;

public class Food {
  private String foodName = "";
  private float foodPrice = 0f;

  public Food(String name, Float price){
    setFoodName(name);
    setFoodPrice(price);
  }

  private void setFoodName(String name){
    this.foodName = name;
  }

  public String getFoodName(){
    return this.foodName;
  }

  private void setFoodPrice(Float price){
    this.foodPrice = price;
  }

  public Float getFoodPrice(){
    return this.foodPrice;
  }
  
}
