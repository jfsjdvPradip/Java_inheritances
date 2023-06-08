class A
{
    int[] a = new int[5];
 
    {
        a[0] = 10;
    }
}
 
public class Q31 extends A
{
    {
        a = new int[5];
    }
 
    {
        System.out.println(a[0]);
    }
 
    public static void main(String[] args)
    {
        Q31 main = new Q31();
    }
}