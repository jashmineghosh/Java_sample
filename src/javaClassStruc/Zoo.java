package javaClassStruc;

import java.util.Arrays;
import java.util.Random;

public class Zoo {
    public static void main (String[] args) {
//        System.out.println(args[0]);
//        System.out.println(args[1]);
        Random r = new Random();
        System.out.println(r.nextInt(10));

        java.sql.Date date1;

        //operators
//        Integer int1 = 128;
//        Integer int2 = 128;
//        System.out.println(int1 ==int2);
        int num = 10;
        do{
           num--;
           while(num >5)
               num-=2;

        }while(num>10);
        System.out.println("num = "+num);

        //endless for loop
//        for(;;)
//            System.out.println("hello");
//        for(int i =0;i<10;){
////            i=i++;//endless coz of this
////            System.out.println("Hello");
////        }

        //strings
//        String hello = "hello";
//        String hi = hello + "world";
//        hi=hello;
//        System.out.println(hi+hello);

        String str1 = "abc";
        String str2 = "ab";
        String str3 = str2 + "c";
        System.out.println(str1 == str2 );
        System.out.println(str1 == str3 ); //Strings computed by concatenation at run time are newly created and therefore distinct

        //arrays
        double[] a = new double[4*5/2];
        String[] s = new String[]{"abc","def"};int size = s.length;
        System.out.println(s.toString()); //prints [Ljava.lang.String;@4554617c
        System.out.println(Arrays.toString(s)); // nice way to print array

    }
}
