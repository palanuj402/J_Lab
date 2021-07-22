import pkg.*;
public class Interf_prob1
{
    public static void main(String args[])
    {
        Class_imple a=new Class_imple(6,5);
	System.out.println("*****Using Interfaces*****");
        System.out.println("ADD is "+a.add());
        System.out.println("SUB is "+a.sub());
        System.out.println("MUL is "+a.mul());
        System.out.println("DIV is "+a.div());
    }        
}