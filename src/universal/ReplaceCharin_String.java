package universal;

public class ReplaceCharin_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "vasjfvasjvfha     qqqqsacvdc";
		String finallStr = "";
			
		
		for (int i=0 ; i <x.length();i++)
		{
			String y = Character.toString(x.charAt(i));
			
			if (y.equals("v"))
{
y = "u";	
} 
			
			if (y.equals(" "))
			{
			y = "9";	
			} 
			
			finallStr = finallStr + y;
		}
			
			System.out.println(finallStr);
				

	}

}
