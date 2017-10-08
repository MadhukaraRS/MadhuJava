package sessionDay10;


public class myInterfaceTestScript {

	public static String environment = "prod";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(environment.equalsIgnoreCase("UAT")) {
			ImplementationClassFileUat uatData = 
					new ImplementationClassFileUat();
			uatData.purchaseElectronicItem();
			uatData.purchaseFashionItem();
			uatData.purchaseFurnitureItem();
			
		}else if(environment.equalsIgnoreCase("PROD")) {
			ImplementationClassFileProd prodData = 
					new ImplementationClassFileProd();
			prodData.purchaseElectronicItem();
			prodData.purchaseFashionItem();
			prodData.purchaseFurnitureItem();
		}else if (environment.equalsIgnoreCase("DEV")) {
			ImplementationClassFileDev devData = 
					new ImplementationClassFileDev();
			devData.purchaseElectronicItem();
			devData.purchaseFashionItem();
			devData.purchaseFurnitureItem();
		}
	}

}
