import java.util.Objects;
import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {

        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n<0)
            System.out.println(-n);
        else
            System.out.println(n);*/

        final Object lock1=new Object();
        final Object lock2=new Object();
        Thread t1=new Thread(){
            public void run(){
                synchronized (lock1){
                    System.out.println("Thread1: holdong lock1");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Thread1: holding lock2");
                    synchronized (lock2){
                        System.out.println("Thread2: holding lock1 and lock2");
                    }
                }
            }

        };
        Thread t2=new Thread(){
            public void run(){
                synchronized (lock2){
                    System.out.println("Thread2: holdong lock2");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Thread2: holding lock2");
                    synchronized (lock1){
                        System.out.println("Thread1: holding lock1 and lock2");
                    }
                }
            }

        };
        t1.start();
        t2.start();
    }
}
