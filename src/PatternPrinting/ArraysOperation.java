package PatternPrinting;

import java.util.Scanner;

public class ArraysOperation {
     static boolean sortOfArrray(int arr[]){
         boolean check=true;
         for (int i = 1; i <arr.length ; i++) {
             if(arr[i]<arr[i-1]){
                 check=false;
                 break;
             }
         }return check;
     }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=sc.nextInt();
        System.out.println("Enter the elements :");
        int arr[] =new int [n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();


        }
        System.out.println("is sort"   +sortOfArrray(arr));
    }

}
