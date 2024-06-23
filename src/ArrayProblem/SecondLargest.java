package ArrayProblem;

import java.util.Scanner;

public class SecondLargest {
    public static int maximumElement(int [] arr){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>largest){
                largest=Math.max(largest,arr[i]);
            }
        }
        return largest;


    }
    public static int secondLargestElement(int [] arr){
        int mx = maximumElement(arr);
        int smx=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=mx){
                smx=Math.max(smx,arr[i]);
            }
        }
        return smx;
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
        System.out.println("largest element is" +maximumElement(arr));
        System.out.println("second largest element :"+ secondLargestElement(arr));

    }
}
