package ArrayProblem;

public class MaximumElement {

    public static void main(String[] args) {

        /*int arr[]={10,8,43,12,5,56,78};
          int n=arr.length;
        int max=arr[0];
        for (int i = 1; i <n ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println(max);*/

        /*int arr[]={-1,-5,-7,-8,-9,-2,-4,-50};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            if(arr[i]>max){
                //max=arr[i];
                max=Math.max(max,arr[i]);
            }
        }
        System.out.println(max);*/
       /* int arr[]={-1,-5,-7,-8,-9,-2,-4,-50};
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <n ; i++) {
            if(arr[i]<min){
                min=Math.min(min,arr[i]);
            }
        }
        System.out.println(min);
    }*/

       /* int arr[]={-1,-5,-7,-8,-9,-2,-4,-50};
        int n=arr.length;
          int min=arr[0];
        for (int i = 1; i <n ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);*/
        int arr[]={1,5,7,8,9,2,4,50};
        int n=arr.length;
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            if(arr[i]>largest){
                largest=Math.max(largest,arr[i]);
            }
        }
         int secondLargest=Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            if(arr[i]!=largest){
              secondLargest=Math.max(secondLargest,arr[i]);
            }
        }


        System.out.println(largest);
        System.out.println(secondLargest);

    }
}
