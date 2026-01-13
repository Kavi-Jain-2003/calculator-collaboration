package calculator;
public class Calculator
{
    public static void main(String[] args) {
        int resultAdd=add(2,3);
        int resultMul=mul(4,5);
        System.out.println("addition:"+resultAdd);
        System.out.println("multiplication:"+resultMul);
    }
    public static int add(int a, int b)
    {
        return a+b;
    }
    public static int mul(int a, int b)
    {
        return a*b;
    }
    
}