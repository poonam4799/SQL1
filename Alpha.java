import java.util.*;
class Alpha
{
	public static void main(String ag[])
	{
	char a;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Alphabet");
	a=sc.next().charAt(0);
	if(a>64 && a<91 || a>96 && a<123)
	{
	System.out.println("Enter Character is Alphabet");
	}
	else if(a>47 && a<58)	
	{
	System.out.println("Digit");
	}
	else
	{
	System.out.println("Enter char neither Alphabet nor Special Symbol");
	}
}
}