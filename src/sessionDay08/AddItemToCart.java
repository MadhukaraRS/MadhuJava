package sessionDay08;

public class AddItemToCart {

	String itemName;
	
	public AddItemToCart() {
		this.itemName = Properties.Item;
	}
	
	public void addItem() {
		System.out.println(""+itemName+" added Successful");
	}
}
