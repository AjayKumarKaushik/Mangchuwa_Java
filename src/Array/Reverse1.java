package Array;

import java.util.Arrays;

public class Reverse1 {
    public static void main(String[] args) {
        
        int arr[]={5,8,9,3,1,7,6};

        for (int ele:  arr
             ) {
            System.out.print(ele + " ");
        }
        System.out.println();

        //manually deep copy
        int crr[]=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
   crr[i]=arr[i];

        }
   crr[0]=90;
        System.out.println(crr[0]+ " ");

        /*int num[]=arr;
        num[0]=80;
        System.out.println(num[0]);*/

         /* int deepcpy[] =Arrays.copyOf(arr,arr.length);
        for (int ele: deepcpy
             ) {
            System.out.print(ele + " ");
        }
        System.out.println();*/

       /* for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        int num []=arr;
        int num [0]=90;*/

       /* Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+ " ");
        }*/
        
    }
}
