package BasicOperationArraylist;

import java.util.ArrayList;

public class PractiseArrList {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(6);
            list.add(0,10);
        list.add(1,20);
        list.add(2,30);
        list.add(3,40);
        list.add(4,50);
        list.add(5,60);
        //System.out.println(list);
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        list.set(2,300);//modify
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
        list.add(56);
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    }
}
