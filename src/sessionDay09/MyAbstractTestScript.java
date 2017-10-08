package sessionDay09;

public class MyAbstractTestScript {
	
	public static String var1 = "dev";

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		if(var1.equals("uat")){
		SampleProgramDay9CallToAbstractUat uat = 
				new SampleProgramDay9CallToAbstractUat();
		uat.amazonBoxOrder();
		uat.flipkartBoxOrder();
		uat.snapDealBoxOrder();
		}else if(var1.equals("dev")) {
			SampleProgramDay9CallToAbstractDev dev = 
					new SampleProgramDay9CallToAbstractDev();
			dev.amazonBoxOrder();
			dev.flipkartBoxOrder();
			dev.snapDealBoxOrder();
			
		}else if(var1.equals("prod")) {
			SampleProgramDay9CallToAbstractProd prod = 
					new SampleProgramDay9CallToAbstractProd();
			prod.amazonBoxOrder();
			prod.flipkartBoxOrder();
			prod.snapDealBoxOrder();
			
		}
		
	}

}
