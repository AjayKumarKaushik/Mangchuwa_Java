package ArrayProblem;

import java.util.Scanner;

public class StudentMarks {


    public static void main(String[] args) {
       int arr[]={81,56,89,74,23,44,21,23,99};
       int n=arr.length;
        for (int i = 0; i <n ; i++) {
            if(arr[i]<35){
                System.out.println(arr[i] +"");
                System.out.println(i +"");
            }
        }
    }
}
