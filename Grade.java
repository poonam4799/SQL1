import java.util.*;
class Grade
{
	public static void main(String ag[])
	{
	int sub1,sub2,sub3,sum,per;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Marks Of 3 Subjects ");
	sub1=sc.nextInt();
	sub2=sc.nextInt();
	sub3=sc.nextInt();
	sum=sub1+sub2+sub3;
	per=(100*sum)/300;
 	System.out.println("Percentage"+per);
	if(per>40 && per<50)
	{
	System.out.println(" Second Class");
	}
	else if(per>51 && per<60)
	{
	System.out.println("Higher Second Class");
	}
	else if(per>61 && per<75)
	{
	System.out.println("First Class");
	}
	else if(per>76 && per<99)
	{
	System.out.println("Distinction");
	}
	else
	{
	System.out.println("Fail");
	}
	}
}