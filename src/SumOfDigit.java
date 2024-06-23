import java.util.Scanner;

public class SumOfDigit {
    static void sumOfDigit(int n) {
        int sum = 0;
        while (n != 0) {
            int ld = n % 10; // Calculate the last digit of the number
            sum += ld;
            n /= 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit :");
        int n = sc.nextInt();
        sumOfDigit(n);
    }
}
