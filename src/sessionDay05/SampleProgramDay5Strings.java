package sessionDay05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class SampleProgramDay5Strings {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
			stringFunctions();
			//splitExample();
			//parsingFunctions();
		}
	
	public static void stringFunctions() {
		
		int a = 67;
		String course = "3000 Selenium books";
		String name = "Java is required to write Selenium automation scripts to help testers"; //Variable
		System.out.println("The length of this array "+ name.length()); //to fetch the length
		System.out.println(name.concat(" but its very easy")); //concat another string or integer (append)
		System.out.println(name+" but its very easy in "+a+" days"); //concat another string or integer (update)
		System.out.println(name.substring(8, 16));  //substring based on begin index and end index
		System.out.println(name.substring(16));   //substring based on only begin index
		System.out.println(name.charAt(15));  //Gives the character at the position specified
		System.out.println(name.contains("Dotnet"));  //Checks the character is present in the string
		System.out.println(course.equalsIgnoreCase("seLeNium")); //compares two strings ignoring the case
		System.out.println(course.equals("Selenium"));   //compares two strings considering the case
		System.out.println(name.hashCode()); //creates a code based on a inbuilt algorithm
		System.out.println(name.indexOf("to"));  //gives you the character count of first occurrence
		System.out.println(name.indexOf("to", 10)); //gives you the character count after specified from index
		System.out.println(name.isEmpty());  //it will check the string variable is blank or not
		System.out.println(name.lastIndexOf("to")); //gives you the index of the character of last occurrence
		System.out.println(name.lastIndexOf("to", 20)); //gives you the index of the character of last occurrence before specified index
		System.out.println(name.replace("Selenium", "API")); //replace the old characters with new characters
		//System.out.print(course.toCharArray()); //converts the string to an character array
		System.out.println(name.toLowerCase()); //converts the variable into lower case
		System.out.println(name.toUpperCase()); //converts the variable into upper case
		
		Object ob = "mobile automation";
		String updatedOb = ob.toString();
		System.out.println(updatedOb);
		
		System.out.println(course.trim()); //removes the unwanted spaces before and after variable
		String [] split = name.split("write");
		System.out.println(split[0]);
		System.out.println(split[1]);
	
	}
	
	public void charArrayExample(){
		
		String course = "Selenium";
		char [] example = course.toCharArray();
		int b = example.length;
		int i=0;
		for (i=0;i<b;i++) {
			if(example[i]=='e') {
				System.out.println("character E is present");
			}
		}
	}
	
	public static void splitExample() {
		
		String [] sampleData = {"latha@gmail.com", "madhukara@rediffmail.com", "harsha@yahoo.com"};
		for (int i=0; i<sampleData.length; i++) {
		String [] splitData = sampleData[i].split("@");
		System.out.println(splitData[0]+","+splitData[1]);
		}
	}
	
	public static void parsingFunctions() {
		String mobilePrice  = "12999";
		int tax =200;
		int x = Integer.parseInt(mobilePrice);
		int z = x+tax;
		System.out.println(z);
		System.out.println(String.valueOf(z));
		
	}
	
	


}


