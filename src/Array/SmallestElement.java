package Array;

import java.util.Scanner;

public class SmallestElement {

    public static int smallestElement(int arr []){
        int small=Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            //if(arr[i]<small){
                small=Math.min(small,arr[i]);

        }
        return small;
    }
public static int secondSmallestElement(int arr []){
    int small = smallestElement(arr);
    int secondsmall=Integer.MAX_VALUE;
    for (int i = 0; i <arr.length ; i++) {
        if(arr[i]<small && arr[i]!=small){
            secondsmall=Math.min(secondsmall,arr[i]);
        }
    }
    return secondsmall;
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
        System.out.println("smallest element is : "+smallestElement(arr));
        System.out.println("second Smallest Element is "+secondSmallestElement(arr));

    }
}
