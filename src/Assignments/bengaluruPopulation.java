package Assignments;

public class bengaluruPopulation
{
	public static void main(String args[])
	{
		int s, i, odd = 0, even = 0;
		
		int[] a = { 33, 2, 4, 71, 92, 88, 9, 1 };
 
		for (i = 0; i < a.length; i++)
		{
			for (int j = i + 1; j < a.length; j++)
 
			{
				if (a[i] > a[j])
				{
					s = a[i];
					a[i] = a[j];
					a[j] = s;
 
				}
 
			}
 
		}
 
		System.out.print("Input Bengaluru Population :");
 
		for (i = 0; i < a.length; i++)
 
		{
 
			System.out.print(" " + a[i]);
 
		}
 
		System.out.print("\nOutput :");
 
		
		for (i = 0; i < a.length; i++)
		{
 
			if (a[i] % 2 != 0)
			{
				odd += a[i];
				System.out.print(" " + a[i]);
				
			}
 
		}
		System.out.print(" " + odd);
 
		for (i = 0; i < a.length; i++)
 
		{
			if (a[i] % 2 == 0)
			{
				even += a[i];
				System.out.print(" " + a[i]);
				
 
			}
 
		}
		System.out.println(" " + even);
	}
}
	
