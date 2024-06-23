import java.util.Scanner;

public class CountDigit1 {
    public static void CountDigit(int n){
        int count=0;
        while (n!=0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int digit=sc.nextInt();

        CountDigit(digit);

    }
}
