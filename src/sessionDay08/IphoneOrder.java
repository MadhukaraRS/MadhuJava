package sessionDay08;

public class IphoneOrder {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		LoginFlipkart loginObj = 
				new LoginFlipkart(Properties.username, Properties.password);
		AddItemToCart add = new AddItemToCart();
		MakePayment paymentDone = new MakePayment();

		
		loginObj.login();
		add.addItem();
		paymentDone.payment();
		
		

	}
	
	public void newLogin() {
		System.out.println("This is new login method in Iphone classfile");
	}
	

}
