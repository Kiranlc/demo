package universal;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "teetit";
		//String S1 = new String("Welcome");
		String s1 = "@$&^)*((*&*%) Testing expression 6564546";
		String tem = "";
		
		int len = s.length();
		
		for (int i = (len-1); i>=0; i--)
		{
			tem = tem + s.charAt(i);			
		}
		
		System.out.println(tem);
		
		 if (s.contains(tem))			 
		 {
			 System.out.println(s +" is pallendrome");
		 }
		 else
		 {
			 System.out.println(s +" is not a pallendrome");
		 }
			
		String s2 = s1.replaceAll("[^a-zA-z0-9 ]", "");
		System.out.println(s2);
		System.out.println(s2.replace("^ ", ""));

	}

}