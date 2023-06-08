class A
{
    void A()
    {
        System.out.println(1);
    }
}
 
class B extends A
{
    void B()
    {
        A();
    }
}
 
public class Q24
{
    public static void main(String[] args)
    {
        new B().B();
    }
}