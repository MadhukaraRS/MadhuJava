package sessionDay11;

public class EncapsulationTestScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleProgramDay11Encapsulation encap = 
				new SampleProgramDay11Encapsulation();
		
		//Before Setter, Getter is used
		System.out.println(encap.getJobName());
		System.out.println(encap.getOpenings());
		System.out.println(encap.getSalary());
		
		encap.setJobName("Senior test Engineer");
		encap.setOpenings(20);
		encap.setSalary(50000);
		
		//After Setter, Getter is used
		System.out.println(encap.getJobName());
		System.out.println(encap.getOpenings());
		System.out.println(encap.getSalary());
		
		

	}

}
