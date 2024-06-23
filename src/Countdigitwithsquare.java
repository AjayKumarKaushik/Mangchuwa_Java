import java.util.Scanner;

public class Countdigitwithsquare {
    public static int countDigit(int n){
        int count=0;
        while (n!=0){
            n/=10;
            count++;

        }
        System.out.println(count);
        return count;

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digits: ");
        int n=sc.nextInt();
        countDigit(n);
        int square=n*n;
        System.out.println("squsre of number is" +square);

    }


}
