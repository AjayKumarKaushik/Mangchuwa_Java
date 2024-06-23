package PatternPrinting;

import java.util.Scanner;

public class ArraysEx {
    static int countOccurance(int arr[],int x){
        int count=0;
        for (int i = 0; i <arr.length;  i++) {
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter the elements");
        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target=sc.nextInt();
        int occarance = countOccurance(arr, target);
        System.out.println("The number of occurrences of " + target + " in the array is: " + occarance);


    }
}
