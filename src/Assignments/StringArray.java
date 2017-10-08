package Assignments;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] statement = {"Constant practice is needed to learn JAVA programming language"};
		String word = "Webdriver";
		
		System.out.println("Statement Entered is:");
        for (int i = 0; i < statement.length; i++) {
            System.out.print(statement[i] + " ");
         
		String name = statement[i];
		System.out.println("\nThe number of characters present in this statement is "+ name.length()); 

		String [] splitData = statement[i].split("learn ");
		System.out.println(splitData[1]);
		System.out.println(name.indexOf("learn"));
		System.out.println(word.toUpperCase());
		System.out.println(name.contains("needed"));
        }
        
	}
}
			
			
		
			
			




        
        
        