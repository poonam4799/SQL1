import java.util.*;
class Greate3

{	
	public static void main(String ag[])
	{
	int num1,num2,num3;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 3 Nos\n");
	num1=sc.nextInt();
	num2=sc.nextInt();
	num3=sc.nextInt();
	if(num1>num2&&num1>num3)
	{
	System.out.println("Num1 is Greater");
	}
	else if(num2>num1&&num2>num3)
	{
	System.out.println("Num2 is greater");
	}
	else
	{
	System.out.println("Num3 is greater");
	}
	}
}