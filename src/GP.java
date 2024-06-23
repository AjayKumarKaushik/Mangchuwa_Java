import java.util.Scanner;

public class GP {

    public static int gP(int n){
        int a=1;
        for (int i = 1; i <=n ; i++) {
            a*=3;
            System.out.println(a);

        }
        return a;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nuber :");
        int n=sc.nextInt();
          gP(n);


    }
}
