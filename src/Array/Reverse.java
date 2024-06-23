package Array;

import java.util.Scanner;

public class Reverse {
    public static int [] reverseOfArray(int arr[]){
        int n=arr.length;
        int ans[]=new int[n];
        int j=0;
        for (int i = n-1; i >= 0; i--) {
            ans[j]=arr[i];
            j++;
        }

       return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n=sc.nextInt();
        System.out.println("Elements are :");
        int arr[]=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        int[] ints = reverseOfArray(arr);
        for(int num: ints){
            System.out.println(num + " ");
        }
    }


}
