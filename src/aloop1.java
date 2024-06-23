import java.util.Scanner;

public class aloop1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
       /* for(int i=12;i<=n;i+=12){
            System.out.println(i);
        }*/
         /*for(int i=1;i<=100;i++){
             if(i%5==0 || i%3==0){
                 System.out.println(i);
             }
         }*/
       /* for (int i = 19; i <=190 ; i+1=19;) {
          *//*if(i%19==0){  System.out.println(i);
        }*//*}*/
        /*for (int i = 2; i <=190 ; i+=2) {
            System.out.println(i);
        }*/
        for (int i = 1; i <=n; i+=2) {
            System.out.println(i);
        }

    }
}
