package ArrayProblem;

public class ReverseOfArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int n=arr.length;
        //int temp=0;
        for (int ele:
             arr) {
            System.out.print(ele);
        }
        System.out.println();
        for (int i = 0; i <n/2 ; i++) {
        int temp=arr[i];
        arr[i]=arr[n-1-i];
        arr[n-1-i]= temp;

        }
        for (int ele:
             arr) {
            System.out.print(ele);
        }
        System.out.println();

    }

}
