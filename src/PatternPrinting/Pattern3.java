package PatternPrinting;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enyter rows and coloumns");
       /* int r=sc.nextInt();
        int c= sc.nextInt();*/
        int n=sc.nextInt();
        for (int i = 1; i <=n;  i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print(j +"");
            }
            System.out.println();
        }


    }

}
