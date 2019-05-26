package universal;

public class IntegerReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 98654163;
int r ;
int sum = 0;

while (num > 0)
{
	r = num%10;
	sum = (sum*10)+r;
	num=num/10;

}

System.out.println(sum);

int num1 = 98654163;
System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

	}

}
