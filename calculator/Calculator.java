package calculator;
public class Calculator
{
    public static void main(String[] args) {
<<<<<<< HEAD
        int resultAdd=add(2,3);
        int resultMul=mul(4,5);
        System.out.println("addition:"+resultAdd);
        System.out.println("multiplication:"+resultMul);
=======
        int result=add(2,3);
        System.out.println("addition:"+result);
        System.out.println("subtraction: "+subtract(10,5));
>>>>>>> 504ab9bc2cba234b89076ee8860fe1df9635e0a1
    }
    public static int add(int a, int b)
    {
        return a+b;
    }
<<<<<<< HEAD
    public static int mul(int a, int b)
    {
        return a*b;
    }
    
=======
    public static int subtract(int c,int d)
    {
        return c-d;
    }
>>>>>>> 504ab9bc2cba234b89076ee8860fe1df9635e0a1
}