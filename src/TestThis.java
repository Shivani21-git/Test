// this can be passed as an argument in method call
public class TestThis {
    TestThis()
    {
        System.out.println("Default");
    }
    TestThis(TestThis ob)
    {
        System.out.println("Not Default");
    }

    public void testMethod()
    {
        TestThis obj = new TestThis(this);
    }
    public static void main(String[] args)
    {
        TestThis ob = new TestThis();
        ob.testMethod();
        //TestThis ob2 = new TestThis(this);  very imp, this and super cannot be used in static context
    }

}
