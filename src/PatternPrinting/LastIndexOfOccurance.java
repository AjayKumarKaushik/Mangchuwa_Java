package PatternPrinting;

import java.util.Scanner;

public class LastIndexOfOccurance {
    static  int lastIndexOfArray(int arr[],int x){
        int lastindex=-1;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==x){
         lastindex=i;
            }
        }
        return lastindex;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter the elemnts of array");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("target element");
        int target=sc.nextInt();
        int occurances = lastIndexOfArray(arr, target);
        System.out.println("the number of last occurances of "+target+"in array is "+occurances);


    }
}
