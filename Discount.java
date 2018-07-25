import java.util.*;
class Bill
{
	int Id;
	Float Quantity;
	Double Prize;
	void accept()
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Item_id");
	Id=sc.nextInt();
	System.out.println("Enter the Prize");
	Prize=sc.nextDouble();
	System.out.println("Enter the Quantiy");
	Quantity=sc.nextFloat();
	}
		
	void bill()
	{

	double Total_bill=Prize*Quantity;
	System.out.println("Your Total Bill"+Total_bill);
	}
	
	Double Discount()
	{
	if(Total_bill>5000)
	{
	Total_bill=Total_bill-(0.20*Total_bill);
	}
	else if(Total_bill<5000)
	{
	Total_bill=Total_bill-(0.05*Total_bill);
	}
	return Total_bill;
	}
	
}



class Main
{
	public static void main(String ag[])
	{
	Bill b=new Bill();	
	b.accept();
	b.bill();
	
	Double Dis=b.Discount();
	System.out.println("Your Bill:"+Dis);
	}
}
	