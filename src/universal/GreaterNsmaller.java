package universal;

public class GreaterNsmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  a[] = {10,20,55,6981,-25,-98752};
		int largestNo = a[0];
		int smallestNo = a[0];
				
		for (int i = 0; i<(a.length); i++ )
		{
			//for (int j = i+1; j<a.length; j++ )
			
				if (a[i]>largestNo)
				{
					largestNo = a[i];
				}
				if (a[i]<smallestNo)
				{
					smallestNo = a[i];
				}
			
		}
		
		System.out.println ("smallest no = "+smallestNo);
		System.out.println ("Largest no = "+largestNo);
		
		

	}

}
