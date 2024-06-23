package BasicOperationArraylist;

import java.util.ArrayList;

public class ListPractise {
    public static void main(String[] args) {

        ArrayList<Integer> lst = new ArrayList<Integer>();
        System.out.println(lst + " " + lst.size());
        lst.add(60);
        System.out.println(lst + " " + lst.size());
        lst.add(20);
        System.out.println(lst + " " + lst.size());
        lst.add(50);
        System.out.println(lst + " " + lst.size());
        lst.add(10);
        System.out.println(lst + " " + lst.size());
        lst.add(90);
        System.out.println(lst + " " + lst.size());
        lst.add(40);
        lst.remove(4);
        System.out.println(lst+" "+lst.size());

    }
}
