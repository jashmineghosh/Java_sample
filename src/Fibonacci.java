import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci (int n) {

        if (n == 0) return 0;
        if (n == 1 || n==2) return 1;

            return fibonacci(n-2)+ fibonacci(n-1);

    }
    public static void main (String[]args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
           int j= s.nextInt();
//        System.out.println("Find fibonacci for"+10+" numbers");

        for(int i=0;i<j;i++){
            System.out.println(fibonacci(i) + "");
        }


    }


}
