//Program to check overriding of data members

public class DataMemeberOveriding {
    int speed = 10;
}
class Child extends DataMemeberOveriding
{
    int speed = 20;
}
class Test1 {
    public static void main(String[] args)
    {
        DataMemeberOveriding obj = new Child();
        System.out.println(obj.speed);
    }
}

