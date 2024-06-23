package PatternPrinting;

import java.util.Scanner;

public class Pattern2 {
    public static void printPattern(int r, int c){
        for (int i = 1; i <=r ; i++) {
            for (int j = 1; j <=c ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and columns ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        printPattern(r,c);
    }
}
