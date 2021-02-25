public class StaticVarTest {

    static int x= 1;
    StaticVarTest()
    {
        x++;
        System.out.println(x);
    }
    public static void main(String[] args)
    {
        StaticVarTest ob = new StaticVarTest();
        StaticVarTest obj = new StaticVarTest();
    }
}
