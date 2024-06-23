package PatternPrinting;

import java.util.Scanner;

public class CrossStar {

    static void crossStar(int n){

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i==j || i+j==n+1 )
                    System.out.print("*" + " ");

                else
                    System.out.print(" " + " ");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        crossStar(n);

    }
}
