package PatternPrinting;

import java.util.Scanner;

public class Traingle1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((char) (j+64) + "");
            }
            System.out.println();
        }
    }
}
