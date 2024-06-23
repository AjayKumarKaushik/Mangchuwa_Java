import java.util.*;

public class Practise {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10, 23, 44, 56, 78, 99, 13, 14,10,23);
         integers.stream().filter(v->v%2==0).forEach(System.out::println);
        System.out.println("((((((((((((((");
        integers.stream().filter(c->c%2!=0).forEach(System.out::println);
        System.out.println("******************");
        integers.stream().map(d->d +"").filter(k->k.startsWith("1")).forEach(System.out::println);
        Set<Integer> set=new HashSet<>();
           integers.stream().filter(d->!set.add(d)).forEach(System.out::println);

    }
}
