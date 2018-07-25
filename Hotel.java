import java.util.*;
class Hotel
{
	String hotel_Name,Room_Type;
	int hotel_Id,NoOfRoom;
	Long Price_Per_Room,Payment,Total_bill;


	void accept()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Hotel Name");
	hotel_Name=sc.next();
	System.out.println("Enter the Hotel ID");
	hotel_Id=sc.nextInt();
	System.out.println("Enter the Room Type");
	Room_Type=sc.next();
	System.out.println("Enter the Price per Room");
	Price_Per_Room=sc.nextLong();	
	}



	Long getBill()
	{
	Total_bill=NoOfRoom*Price_Per_Room;
	return Total_bill;
	}

}
class Main1

{
	public static void main(String ag[])
	{
	Hotel h=new Hotel();
	h.accept();
	Long Total_Payment=h.getBill();
	System.out.println("Total Payment"+Total_Payment);

	}
	
	}

