package sessionDay04;

public class SampleProgramDay4LoopControls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		whileLoopExample();
		forLoopExample();
		doWhileLoopExample();
	}	
	
	public static void whileLoopExample() {
		
		int a=25;
		int b =30;
		while (a<b) {
			
			System.out.println("******* This line is printing repeatatively" +a);
			a++;
		}
		
		System.out.println("While loop has ended for value" +a);
	}
	
	public static void forLoopExample() {
		
		int b=10;
		int a;
		for (a=30;a>b;a--) {
		
			System.out.println("******* This line is printing repeatatively" +a);
		}
		
		System.out.println("For loop has ended for value" +a);
	}
	
	public static void doWhileLoopExample() {
		
		int b=30;
		int a=30;
		do {
			System.out.println("******* This line is printing repeatatively" +a);
			a++;
		}while(a<b);
		
		System.out.println("For loop has ended for value" +a);
}	
		/*a = prevexectime;
		b =current time;
		int diff;
		do {
			
			System.out.println("*******Display the scores");
			Thread.sleep(30000);
			
		}while((diff = b-a)==30000);*/
}
