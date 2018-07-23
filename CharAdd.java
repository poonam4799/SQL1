import java.util.*;
class CharAdd
{
	public static void main(String ag[])
{
	int a,b,sum;
	char ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter character");
	ch=sc.next().charAt(0);
 
	
	if(ch=='a' || ch=='A')
	{
	System.out.println("Enter 2nos");
	a=sc.nextInt();
	b=sc.nextInt(); 
	sum=a+b;
	System.out.println("Addition"+sum);
	}
	else
	{
	System.out.println("Invalid Choice");
	}
	
	}

}