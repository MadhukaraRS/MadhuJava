package sessionDay11;

public class SampleProgramDay11PolyMorphism extends SampleProgramDay11ChildClass implements SampleProgramDay11Interface1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Three methods which are accessed from Child class
		SampleProgramDay11ChildClass.checkOrderStatus();
		SampleProgramDay11ChildClass.checkPaymentStatus();
		SampleProgramDay11ChildClass.checkTransactions();
		
		
	}


	@Override
	public void addFirstname() {
		// TODO Auto-generated method stub
		System.out.println("First name added");
	}

	@Override
	public void addAddress() {
		// TODO Auto-generated method stub
		System.out.println("Address added");
	}

	@Override
	public void changePassword() {
		// TODO Auto-generated method stub
		System.out.println("Password changed");
	}

	@Override
	public void editEmailId() {
		// TODO Auto-generated method stub
		System.out.println("Email ID Updated");
	}

}
