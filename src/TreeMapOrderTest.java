import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapOrderTest {

    public static void main(String[] args)
    {
        TreeMap map = new TreeMap();

        map.put(new User("Hello",4),1);
                map.put(new User("Shivani",3),1);
        map.put(new User("Suman",4),4);
        map.put(new User("Hii",1),1);
        System.out.println(map);
    }




}
class User implements Comparable
{
    String username;
    int id;
    User(String name, int id)
    {
        this.username = name;
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
