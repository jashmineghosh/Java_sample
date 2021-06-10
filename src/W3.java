import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.lang.Object.*;
import java.util.Scanner;

public class W3 {
    /*
    Following w3Schools code
     */

//        public static void main(String[] args) {
//            int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
//            for (int i = 0; i < myNumbers.length; i++) {
//                System.out.println(myNumbers.length);
//                for(int j = 0; j < myNumbers[i].length; j++) {
//                    System.out.println(myNumbers[i][j]);
//                }
//            }
//        }



//    enum Level {
//        LOW,
//        MEDIUM,
//        HIGH
//    }
//
//
//        public static void main(String[] args) {
//            Level myVar = Level.MEDIUM;
//
//            switch(myVar) {
//                case LOW:
//                    System.out.println("Low level");
//                    break;
//                case MEDIUM:
//                    System.out.println("Medium level");
//                    break;
//                case HIGH:
//                    System.out.println("High level");
//                    break;
//            }
//        }
//


//    public static void main (String[] args) {
//        int[] intArray = { 1, 2, 3, 4, 5 };
//        int[] removed = ArrayUtils.removeElement(intArray, 3);//create a new array
//        System.out.println(Arrays.toString(removed));
//    }


//
//        public static void main(String args[]) {
//            int i, m = 0, flag = 0;
//            int n = 11;//it is the number to be checked
//            m = n / 2;
//            if (n == 0 || n == 1) {
//                System.out.println(n + " is not prime number");
//            } else {
//                for (i = 2; i <= m; i++) {
//                    if (n % i == 0) {
//                        System.out.println(n + " is not prime number");
//                        flag = 1;
//                        break;
//                    }
//                }
//                if (flag == 0) {
//                    System.out.println(n + " is prime number");
//                }
//
//            }//end of else
//
//        }

    static Scanner sc = new Scanner(System.in);
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    static boolean flag = true;
    static {
            if(B<=0 || H <=0)

            System.out.println("java.lang.Exception: Breadth and height must be positive");

    }
    public static void main (String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }


    }

            }









