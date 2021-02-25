public class ThisMethodCall {
    public void mMethod(ThisMethodCall obj)
    {
        System.out.println("Hello");
    }
    public void nMethod()
    {
        System.out.println("hi");
        mMethod(this);
    }
    public static void main(String[] args)
    {
        ThisMethodCall ob = new ThisMethodCall();
        ob.nMethod();;
    }
}
