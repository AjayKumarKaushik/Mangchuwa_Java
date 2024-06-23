package PatternPrinting;

import java.util.Scanner;

public class StarSquare {
     public static void printSquarePattern(int n){
         for (int i = 1; i <=n ; i++) {
             for (int j = 1; j <=n ; j++) {
                 System.out.print(j);
             }
             System.out.println();

         }

     }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter star");
        int n=sc.nextInt();
        printSquarePattern(n);

        /*for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

    }
}
