package PatternPrinting;

import java.util.Scanner;

public class Test {

    static void printN(int n){

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(2*j-1 + "");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements :");
        int n=sc.nextInt();


        printN(n);


    }

}
