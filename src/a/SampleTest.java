package a;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleTest {
    public static void main (String[] args) {
        int[] A = {9,3,9,3,9,7,9};
        int a = solution(A);
        System.out.println("+++"+a);
    }

    public static int solution (int[] A) {


//if(A.length%2!=0){
//    int[] E = new int[A.length / 2 + 1];
//    System.out.println(E.length);
//    int[] O = new int[A.length / 2];
//    System.out.println(O.length);

//    for(int i=0;i<A.length; i++) {
//        if (i % 2 == 0) {
//            for (int j = 0; j < E.length; j++) {
//                E[j] = A[i];
//            }
//        }
//        }
//    for(int i=0;i<A.length; i++) {
//        if (i % 2 != 0) {
//
//                for (int j = 0; j < O.length; ) {
//                    O[j] = A[i];
//
//                    System.out.println("+++" + O[j]);
//                }
//
//        }
//    }
//
//    }
    int x = A.length/2;

    int O[] = new int[x];
    System.out.println(x);
    //go over the larger array and skip by 2
    for (int i = 1; i < A.length-1; i=i+2)
    {
        O[i/2] = A[i];
    }
int a =0;
    for (int i = 0; i < O.length; i++)
    {
        System.out.println(O[i]);


            for ( int j = 0; j < i; j++){
                if (O[i] != O[j]){
                    System.out.println("+++"+O[i]);
a= O[i];
                    break;
                }
            }


        }

        int x1 = (A.length/2)+1;

        int E[] = new int[x1];
        System.out.println(x1);
        //go over the larger array and skip by 2
        for (int i = 0; i < A.length; i=i+2)
        {
            E[i/2] = A[i];
        }

        for (int i = 0; i < E.length; i++)
        {
            System.out.println(E[i]);
        }
        return a;
}
}





