import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Ram's age");
        int ram=sc.nextInt();
        System.out.println("Enter  shyam's age");
        int shyam=sc.nextInt();
        System.out.println("Enter Ajay's age");
        int ajay=sc.nextInt();

        if(ram<= shyam && ram<=ajay){
            System.out.println("ram is youngest"+ram);
        } else if (shyam<=ram && shyam<=ajay) {
            System.out.println("shyam is youngest"+shyam);
        }
        else {
            System.out.println("ajay is youngest"+ajay);
        }

        /*if(n1>=n2 && n1>=n3){
            System.out.println("n1 is raetest"+n1);
        }
         else if (n2>=n1 && n2>=n3) {
            System.out.println("n2 is greatest" +n2);
        }
         else {
            System.out.println("n3 is greatest "+n3);
        }*/
        /*if(n%5==0 || n%3==0 ){
            System.out.println("Divisible by 5 or 3");
        }
        else{
            System.out.println("not Divisible by 5 or 3");
        }*/

    }
}
