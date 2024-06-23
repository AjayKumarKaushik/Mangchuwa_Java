import java.util.Scanner;

public class SquareOfNaturel {
    /*public static void squareOfNaturelNumber(int n){
        for (int i = 1; i <=n ; i++) {
            System.out.println("square of naturel numbers are :"+(i*i));
        }

    }*/
    public static void oddNumbers(int a, int b){
        for (int i = a; i <=b ; i++) {
            if(i%2!=0){
                System.out.println(i +"");
            }
        }
    }

    public static void main(String[] args) {
//        int n=5;
//        for (int i = 1; i <=n ; i++) {
//            System.out.println("Square of naturel number is :"+(i*i));
//        }

        Scanner sc=new Scanner(System.in);
       /* System.out.println("Enter the Number");
        int n=sc.nextInt();
       */// squareOfNaturelNumber(n);
        System.out.println("odd numbers from :");
        int a=sc.nextInt();
        System.out.println("odd numbers to :");
        int b=sc.nextInt();
        oddNumbers(a,b);


    }
}
