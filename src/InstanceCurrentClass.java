public class InstanceCurrentClass {
    int x, y;

    public InstanceCurrentClass firstMethod()
    {
        return this;
    }
    public static void main(String[] args)
    {
        InstanceCurrentClass ob = new InstanceCurrentClass();
        ob.x = 1;
        ob.y=2;
        InstanceCurrentClass obj = ob.firstMethod();
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
}
