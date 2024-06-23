import java.util.Scanner;

public class ReverseOfn {

    static void reverseOfDigit(int n){
        int rev=0;
        int ld;
        while(n!=0){
            ld=n%10;
            rev=rev*10+ld;
            n/=10;
        }
        System.out.println(rev);

    }
    public static void main(String[] args) {

       /* int n=12345;
        int rev=0;
        int ld;
        while(n!=0){
           ld=n%10;
           rev=+rev*10+ld;
           n/=10;
        }
        System.out.println(rev);*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digit");
        int n=sc.nextInt();
        reverseOfDigit(n);
    }
}
