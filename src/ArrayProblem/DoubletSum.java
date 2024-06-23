package ArrayProblem;

import java.util.Scanner;

public class DoubletSum {

/*
    static int doubleSum(int arr[], int target){
        int sum=0;
        int n=arr.length;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if (arr[i]+arr[j] == target) {
                    sum++;
                }
            }
        }
        return sum;
    }
*/
class Solution {
    public int[] twoSum(int[] arr, int x) {
        int ans[]=new int[2];
        int n=arr.length;
        for (int i = 0; i <n ; i++) {
            boolean flag=false;
            for (int j = i+1; j <n ; j++) {
                if(arr[j]+arr[i]==x){
                    ans [0]=i;
                    ans [1]=j;
                    flag=true;
                    break;
                }
            }
            if(flag==true) break;
        }
        return ans;
    }
}

    public static void main(String[] args) {

       /* int arr[]={4,6,3,5,8,2};
        int x=7;*/
        /*int n=arr.length;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[j]+arr[i]==x){
                    System.out.println(i+" "+j);
                }
            }
        }*/
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n=sc.nextInt();
        System.out.println("Elements are :");
        int arr[]=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target element :");
        int target=sc.nextInt();
        System.out.println("Doublem sum are "+doubleSum(arr,target));*/


    }
}
