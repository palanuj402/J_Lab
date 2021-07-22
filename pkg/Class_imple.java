package pkg;

public class Class_imple implements Inter_math2
{
    public int a, b;
    public Class_imple(int x,int y)
    {
        this.a=x;
        this.b=y;
    }
    public int add(){
        return a+b;
    }
    public int sub()
    {
        return a-b;
    }
    public int mul()
    {
        return a*b;
    }
    public int div()
    {
        return a/b;
    }

}
