package Assignments;

public class CompareResult {

	@SuppressWarnings("null")
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String [] array1 = {"java", "api", "selenium", "dotnet"};
		String [] array2 = {"program", "services", "webdriver", "technologies"};
		String word1 = "Java";
		String word2 = "WEBDRIVER";
		String word3 = null;
		
		System.out.println("concatinating array1 with array2");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] +array2[i] ); 
        }
        
        	System.out.println("comparing array1 with word1");
        	for (int i = 0; i < array1.length; i++)
            if(word1.equalsIgnoreCase(array1[i])) 
            	System.out.println("PASS");
            else 
            	System.out.println("FAIL");
        	
        	System.out.println("comparing array2 with word2");
        	for (int i = 0; i < array2.length; i++)
        		if(word2.equalsIgnoreCase(array2[i]))
        				System.out.println("PASS");
        		else
        			System.out.println("FAIL");
        	 
        	try {
        		System.out.println("comparing array2 with word3");
            	for (int i = 0; i < array2.length; i++)
            		if(word3.equalsIgnoreCase(array2[i]))
            				System.out.println("PASS");
            		else
            			System.out.println("FAIL");
        	}catch(NullPointerException e)
            	{
                    System.out.print("NullPointerException Caught");
                }
        	}
	}


