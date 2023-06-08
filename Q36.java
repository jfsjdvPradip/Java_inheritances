public class Q36
{
    public Q36(int i, int j)
    {
        System.out.println(method(i, j));
    }
 
    int method(int i, int j)
    {
        return i++ + ++j;
    }
 
    public static void main(String[] args)
    {
        Q36 main = new Q36(10, 20);
    }
}