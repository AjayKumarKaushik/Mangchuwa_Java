package Compositepattern;

import java.util.Scanner;

public class Test2 {

    static  void patterntest(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <=n ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n :");
        int n=sc.nextInt();
        patterntest(n);

    }
}
