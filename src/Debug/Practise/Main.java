package Debug.Practise;

import java.util.ArrayList;
import java.util.List;

public class Main {

    List<String> voterList = new ArrayList<String>();

    public Main() {
        voterList.add("v1");
        voterList.add("v2");
        voterList.add("v3");
        voterList.add("v4");
        voterList.add("v5");

    }

    public static void main(String[] args) {
        Main m=new Main();
        System.out.println(m.voterList);
        m.voterList.remove("v1");
        System.out.println(m.voterList);

    }
}
