import java.util.Scanner;
class Low_bal_Exception extends Exception
{
    Low_bal_Exception()
    {
        System.out.println(" low balance ");
    }
}
class Account
{
    public String name;
    //public int amt;
    public int balance=1000;
    Account(String s)
    {
        this.name=s;
     //   this.amt=m;
    }
    public int deposit(int amount)
    {
        balance=balance+amount;
	return balance;
    }
    public int withdraw(int x) throws Low_bal_Exception
    {
        if(x > balance) throw new Low_bal_Exception();
        else 
            balance=balance-x;
        return balance;
    }
    public void show_bal()
    {
        System.out.println("Bal is "+balance);
    }
}
public class Bank 
{
	public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		//String name=ob.next();
		Account ob1=new Account("pal");
		int ch;
		System.out.println("*******Anuj ka Bank*******");
		while(true)
		{	
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Show Balance");
			System.out.println("4.Exit");
			System.out.println("Enter your choice: ");
			ch=ob.nextInt();	
				

			switch(ch)
			{
				case 1:
					System.out.print("Enter Amount to be deposited: ");
					int a=ob.nextInt();
					System.out.println("New Balance is: "+ob1.deposit(a) );
					break;
				case 2:
					try
					{
						System.out.print("Enter Amount to be Withdrawn: ");
						int m=ob.nextInt();
						//ob1.withdraw();
						System.out.println("New Balance is: "+ob1.withdraw(m) );
       						    
    					}
					catch (Exception e) 
					{
						System.out.println("****Transaction failed*****");
        				}
					break;
				case 3:
					ob1.show_bal();
					break;
				case 4:
					break;	
			}
		
		}
	}
}