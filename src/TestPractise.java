import java.util.Scanner;

public class TestPractise {

    public static void arithMatic(int n){
        int a=5;int d=-4;
        for (int i = 1; i <n ; i++) {
            a+=d;
            System.out.println(a);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        arithMatic(n);

        /*for (int i = 1; i <=2*n-1 ; i+=2) {
            System.out.println(i);
        }

*/

        /*for (int i = 4; i <=3*n+1 ; i+=3) {
            System.out.println(i);
        }*/
        /*int a=4; int d=3;
        for (int i = 1; i <=n ; i++) {
            System.out.println(a);
            a+=d;
        }*/
    }

}
