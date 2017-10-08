import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.BatchUpdateException;
import java.util.Arrays;



class bengalore{
	
	
	

	public static void main(String v[]) throws IOException
	{
		BufferedReader bangalore = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		 int max = Integer.parseInt(bangalore.readLine());
		 
		 int [] bangPopulation = new int [ max ];
		 System.out.println("Enter the elements");
		 
		 for(int i=0; i<bangPopulation.length; i++)
			 bangPopulation[i] = Integer.parseInt(bangalore.readLine());
		 
		 Arrays.sort(bangPopulation);
		 for(int i=0; i<bangPopulation.length; i++)
		 System.out.print(bangPopulation[i] +" " );
		 
		 int i;
		if(bangPopulation[i]%2 != 0) {
			 for(int i=0; i<bangPopulation.length; i++)
			 System.out.println("The Zombies are " +bangPopulation);
			 //int sum +=  bangPopulation[i]; 
			 //System.out.println(bangPopulation[i]);
		 } else {
			 for(int i=0; i<bangPopulation.length; i++)
			 System.out.println("The Vampires are " );
			 System.out.println(bangPopulation[i]);
		 }
		 
		 
				 
	}
}