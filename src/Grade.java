import java.util.Scanner;

public class Grade {
public static void printreal(int number){

    /*if(number%2==0){
        System.out.println("even"+number);
    }else {
        System.out.println("odd"+number);
    }*/
    if(number>0){
        System.out.println("number is real: absulute"+number);
    }
    else{
        System.out.println("number is negative");
    }
}


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer");
        int number=sc.nextInt();
       // printEvenOdd(number);
 printreal(number);

       /* System.out.println("Enterv the marks: ");
        int n=sc.nextInt();
        if(n>81){
            System.out.println("Excelent");
        } else if (n>61) {
            System.out.println("good");
        } else if (n>41) {
            System.out.println("average");
        }
        else {
            System.out.println("fail");
        }*/
    }

}
