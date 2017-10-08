package SampleProjectMadhu;



public  abstract class Purchase  {
	
	public static String environment = "electrical";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(environment.equalsIgnoreCase("electrical")) {
			Implementation electricalPurchase = 
					new Implementation();
			
			electricalPurchase.chimneyPurchase();
			electricalPurchase.computerPurchase();
			electricalPurchase.laptopPurchase();
			electricalPurchase.tvPurchase();
			
			
		}else if(environment.equalsIgnoreCase("home")) {
			Implementation homePurchase = 
					new Implementation();
			
			homePurchase.sofaPurchase();
			homePurchase.tablePurchase();
			homePurchase.floormatPurchase();
			homePurchase.widowcurtainsPurchase();
		}
	}
	
	
}
			
			
			
		
	
		
	