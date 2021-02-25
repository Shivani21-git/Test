public class InstanceVarTest {

    int x = 1;
    InstanceVarTest ()
    {
        x++;
        System.out.println(x);
    }
    public static void main(String[] args)
    {
        InstanceVarTest ob = new InstanceVarTest();
        InstanceVarTest obj = new InstanceVarTest();
    }
}
