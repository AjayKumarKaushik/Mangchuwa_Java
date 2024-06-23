package ArrayProblem;

public class SumOfEle {
    public static void main(String[] args) {

        int arr[]={12,56,89,47,36,12};
        int n=arr.length;
        int sum=0;
        for (int i = 0; i <n ; i++) {
            sum+=arr[i];

        }
        System.out.println(sum);
    }
}
