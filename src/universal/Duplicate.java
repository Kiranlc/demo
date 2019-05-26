package universal;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String x[] = {"a","asd","qwerty","a","qwerty"};
String duplicate = "";

for (int i =0;i<x.length;i++)
{
	for (int j =i+1; j<x.length;j++)
	{
		if (x[i].equals(x[j]))
		{
			duplicate= duplicate +"," + x[i];
		}
	}
}

System.out.println("Duplicate Number is "+duplicate);

String duplicate1 = "";
Set<String> duplicated = new HashSet<String>();

for (int i =0;i<x.length;i++)
{
	if (duplicated.add(x[i])==true)
	{
		
	}
	else
		{
			duplicate1= duplicate1 +"," + x[i];
		}
		
	}
System.out.println("Duplicate Number is " + duplicate1);
}



		
	}

