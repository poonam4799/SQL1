import java.util.*;
class AreaCircle
{
	public static void main(String ag[])
{
	int r;
//float area;
	double pi=3.14, area;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter radius");
	r=sc.nextInt();
	area=pi*r*r;
	System.out.println("area of circle"+area);

}

}