package Alphabat;

import java.util.Scanner;

public class HorizentalTrangle {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n+1-i ; j++) {
               // System.out.print("*" + "" );
                //System.out.print((char) (i+64) +"");
               // System.out.print(j);
                System.out.print(i);
            }
            System.out.println();
        }

    }

}
