public class TestSuper {
    public static void superMethod()
    {
        System.out.println("I am super class method");
    }
}

class Children extends TestSuper
{
    public static void superMethod()
    {
        System.out.println("I am child class method");
    }
    public void test()
    {
        super.superMethod();
    }
    public static void main(String[] args)
    {
        Children obj = new Children();
        obj.test();
    }
}
