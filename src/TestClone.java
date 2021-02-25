public class TestClone implements Cloneable {
    int x;
    int y;
    Test c = new Test();
    TestClone(int x, int y,Test ob)
    {
        this.x = x;
        this.y = y;
        this.c.a = ob.a;
        this.c.b = ob.b;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException
    {
        Test obj = new Test(1,2);
        TestClone ob = new TestClone(10,20,obj);
        TestClone ob2 = (TestClone)ob.clone();
        ob2.x=1;
        ob2.y=3;
        ob2.c.a = 4;
        System.out.println(ob.x);
        System.out.println(ob.y);
        System.out.println(ob.c.a);
        System.out.println(ob.c.b);
        System.out.println(ob2.x);
        System.out.println(ob2.y);
        System.out.println(ob2.c.a);
        System.out.println(ob2.c.b);


    }
}
