//Program to test if abstract class can be instantiated
public abstract class TestAbstract {
    public abstract void firstMethod();
    public void secondMethod()
    {
        System.out.println("Hello");
    }
    private void thirdMethod()
    {
        System.out.println("Hi");
    }
}
class ImplClass extends TestAbstract
{
    public void firstMethod()
    {
        System.out.println("Hi again");
    }
    public void secondMethod()
    {
        System.out.println("Overriding case");
    }
    public static void main(String[] args)
    {
        TestAbstract obj = new ImplClass();
        obj.secondMethod();
        obj.firstMethod();

    }
}