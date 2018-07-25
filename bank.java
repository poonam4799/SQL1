import java.util.*;
class Bank
{
String A_Name,BranchName,BankAddr;
int A_Id;
long TotalBal;
	void accept_Details()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter ID");
	A_Id=sc.nextInt();
	System.out.println("Enter Account Holder Name");
	A_Name=sc.next();	
	
	System.out.println("Enter Branch Name");
	BranchName=sc.next();
	System.out.println("Enter Address of Bank");
	BankAddr=sc.next();
	
	System.out.println("Total Balance");
	TotalBal=sc.nextLong();
	}
	
	void display()
	{
	System.out.println("Enter Account Holder ID:"+A_Id);
	
	System.out.println("Enter Account Holder Name:"+A_Name);
	
	System.out.println("Enter Branch Name"+BranchName);
	
	System.out.println("Enter Bank Address:"+BankAddr);
	
	System.out.println("Enter total Balance:"+TotalBal);
	}
	

}
class Main
{
	public static void main(String ag[])
	{
	Bank b=new Bank();
	b.accept_Details();	
	b.display();
	}
}