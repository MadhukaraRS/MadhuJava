package Assignments;

public class bengaluru
{
	public static void main(String args[])
	{
		int s, i, odd = 0, even = 0;
		
		int[] a = { 33, 2, 4, 71, 92, 88, 9, 1 };
        int oddArray[] = new int[4];
        int evenArray[] = new int[4];
 
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
 
        int j =0, k = 0;
		for (i = 0; i < a.length; i++)
		{
			if (a[i] % 2 != 0)
			{
				odd += a[i];
                oddArray[j] = a[i];
                j++; 
			}
            else
            {
				even += a[i];
                evenArray[k] = a[i];
                k++; 
            }
		}
        for(int x = 0; x < oddArray.length; x++)
            System.out.print(oddArray[x] + " ");

        System.out.print(odd + " ");

        for(int  y = 0; y < evenArray.length; y++)
            System.out.print(oddArray[y] + " ");

        System.out.print(even);
        System.out.println();
 
	}
}
	