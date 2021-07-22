class Low_bal_Exception extends Exception
{
    Low_bal_Exception(int a)
    {
        System.out.println(" low balance ");
    }
}
class Account
{
    public String name;
    public int amt;
    public static int balance=10000;
    Account(String s,int m)
    {
        this.name=s;
        this.amt=m;
    }
    public void deposit()
    {
        balance=balance+amt;
    }
    public void withdraw() throws Low_bal_Exception
    {
        if(balance<amt) throw new Low_bal_Exception(amt);
        else 
            balance=balance-amt;
        
    }
    public void show_bal()
    {
        System.out.println("Bal is "+balance);
    }
}
public class Low_Exc 
{
	public static void main(String[] args) 
	{
        	Account ob1=new Account("pal",65000);
        	try
		{
        		ob1.withdraw();    
       		} 
		catch (Exception e) 
		{
			System.out.println("****Transaction failed*****");
        	}
        
        ob1.show_bal();

	}    
}