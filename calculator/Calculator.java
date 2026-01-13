package calculator;
public class Calculator
{
    public static void main(String[] args) {
        int result=add(2,3);
        System.out.println("addition:"+result);
        System.out.println("subtraction: "+subtract(10,5));
    }
    public static int add(int a, int b)
    {
        return a+b;
    }
    public static int subtract(int c,int d)
    {
        return c-d;
    }
}