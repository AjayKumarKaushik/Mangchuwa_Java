package Array;

import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the elements :");
        int n=sc.nextInt();
        System.out.println("Arrays are :");
        int arr[]=new int[n];
        for (int i = 1; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 1; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
