package Week1Day1;


import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,6,7,8};
		Arrays.sort(a);
		
		for (int i=0;i<a.length;i++)
		
		{ 
			int b = a[i+1]-1;
			if (b!=a[i]) 
			{
				System.out.println(b);
				break;
			}
		
			
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
