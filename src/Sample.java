import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sample {
    public static void main(String[] args) {

        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"A");
        hm.put(2,"D");
        hm.put(4,"T");
        hm.put(3,"E");
        hm.put(5,"U");

        Set<Integer> integers = hm.keySet();
        System.out.println(integers);
        Collection<String> values = hm.values();
        System.out.println(values);
        Set<Map.Entry<Integer, String>> entries = hm.entrySet();
        for (Map.Entry<Integer,String> tr:entries
             ) {
            System.out.println(tr.getKey() + " "+tr.getValue());
        }

    }
}
