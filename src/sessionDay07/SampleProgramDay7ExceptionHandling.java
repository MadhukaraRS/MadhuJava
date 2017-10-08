package sessionDay07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class SampleProgramDay7ExceptionHandling {

	public SampleProgramDay7ExceptionHandling(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public SampleProgramDay7ExceptionHandling() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
			//checkedException();
			//tryCatchBlock();
			//throw new Exception("This program has stopped because of File not found");
		tryCatchBlockAutomation();
	}
	
	public static void checkedException() throws FileNotFoundException {
		
		File io = new File("E://Seelnium//Exception.class");
		FileReader reader = new FileReader(io);
		//throw new Exception("This program has stopped because of File not found");
		
	}
	
	public static void tryCatchBlock() throws Exception {
		int a =8, b=5, c=6;
		try {
			String [] name = {"Latha", "Madhukara", "Harsha"};
			for (int i=0; i<=name.length; i++) {
				System.out.println(name[i]);
			}
		}
		catch (Exception exp) {
			a = b+c;
			System.out.println(a);
		}
		
		
	}
	
	public static void tryCatchBlockAutomation() throws Exception {
		
		try {
			System.out.println("Firefox browser Launched");
			String login = "New User login here";
			if(login.equalsIgnoreCase("New User login")) {
				System.out.println("PASS: Login text has displayed");
			}else {
				System.out.println("FAIL: Login text has not displayed");
			}
		}
		catch (Exception exp) {
			System.out.println("FAILED: Login object did not display in my site");
		}
		finally {
			System.out.println("Firefox browser Closed");
		}
		
	}


}
