import java.util.*;
class Trian
{
	public static void main(String ag[])
	{
	int a,b,c;
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter 3 sides of Traingle");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	if(a==b&&b==c&&a==c)
	{
	System.out.println("Equilateral");
	}
	else if(a==b||b==c||a==c)
	{
	System.out.println("Isocales");
	}
	else
	{
	System.out.println("scalan");
	}
}

}
