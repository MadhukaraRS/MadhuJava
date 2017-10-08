package sessionDay11;

public class SampleProgramDay11Encapsulation {
	
	private String jobName;
	private int salary;
	private int openings;
	
	private String jobLocation() {
	  String result;
	  return result = "My Job location is Mysore";
	}
	
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
		String location = jobLocation();
		System.out.println(location);
		System.out.println(this.jobName);
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
		System.out.println(this.salary);
	}
	public int getOpenings() {
		return openings;
	}
	public void setOpenings(int openings) {
		this.openings = openings;
		System.out.println(this.openings);
	}

}
