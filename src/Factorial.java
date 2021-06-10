import java.util.Scanner;

public class Factorial {

    public static int factorial (int n) {
        int output=0;
        if (n == 1) return 1;
        if (n > 1) {
            output = n*factorial(n-1);
//            System.out.println(output);
            return output;
        }
    return output;
    }
        public static void main (String[]args){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a number");
//            s.nextInt();
            System.out.println(factorial(s.nextInt()));
//            System.out.println(factorial(3));
        }
    }

