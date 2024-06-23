package Compositepattern;

import java.util.Scanner;

public class Test {
    static void printPattern(int n){
        for (int i = 1; i <=n ; i++) {//rows
            for (int j = 1; j <=n-i ; j++) {//col
                System.out.print(" " + " ");
            }
            for (int j = 1; j <=i ; j++) {//col
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Eenter n :");
        int n=sc.nextInt();
        printPattern(n);

    }

}
