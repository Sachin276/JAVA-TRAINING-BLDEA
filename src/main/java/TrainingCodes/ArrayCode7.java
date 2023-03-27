package TrainingCodes;
// Array are equal or not
import java.util.Arrays;
public class ArrayCode7 
{
	public static void main(String[] args)
	{
		int arr1[]= {10,12,14,89,56,32,45,69,52,24,23,26};
		int arr2[]= {10,12,14,89,56,32,45,69,52,24,23,26};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(arr1.length==arr1.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]!=arr2[i]) 
				{
					System.out.print("Arrays not equal");
					System.exit(0);
				}
				}
			System.out.println("Arrays are equal");
			
			}
		else {
			System.out.println("Arrays not equal");
		
		}
	}
}

