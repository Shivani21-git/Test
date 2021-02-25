//Program to test Method hiding
public class TestMethodHiding {

    static public void firstMethod()
    {
        System.out.println("Hi");
    }
}
class Second extends TestMethodHiding
{
    static public void firstMethod()
    {
        System.out.println("Hello");
    }
}
class Testing
{
    public static void main(String[] args)
    {
        Second obj = new Second();
        obj.firstMethod();
    }
}
















