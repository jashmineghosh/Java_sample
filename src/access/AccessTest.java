package access;

import accessTest.AccessTester;

import java.util.*;

public class AccessTest {

    //    public AccessTest(int i){
//
//    }
    int a;
    private int b;

    protected void c () {
    }

    public int d () {
        return 0;
    }

    String global = "111";
    double d = 10000_0;
    static char c;

    public int parse (String arg) {
        int value = 0;
        try {
            String global = arg;
            value = Integer.parseInt(global);
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
        System.out.print(global + " " + value + " ");
        return value;
    }

    class Baap {
        public int h = 4;

        public int getH () {
            System.out.println("Baap " + h);
            return h;
        }
    }


    public static void main (String[] args) {
//        AccessTest ct = new AccessTest();
//        System.out.print(ct.parse("333"));
//        System.out.println((int)c);
int[] A = {-1,-3,-1,1,2};
        System.out.println(solution(A));


    }
    public  static int solution(int[] A) {
        // write your code in Java SE 8

        List<Integer> postiveNumbers = new ArrayList<Integer>();
        List<Integer> negativeNumbers = new ArrayList<Integer>();
        List<Integer> duplicateNumbers = new ArrayList<Integer>();
        for (int i = 0; i < A.length; i++) {
            if (!(postiveNumbers.contains(A[i]) || negativeNumbers.contains(A[i]))) {//checks whether it contains duplicates

                if (A[i] >= 0) {
                    postiveNumbers.add(A[i]);
                } else if (A[i] < 0) {
                    negativeNumbers.add(A[i]);
                }
            }
            else duplicateNumbers.add(A[i]);
        }
        int m = 0;
        System.out.println(postiveNumbers);
        System.out.println(negativeNumbers);
        System.out.println(duplicateNumbers);
        Collections.sort(postiveNumbers);
        for (int i = 0; i < postiveNumbers.size()-1; i++) {
            if(postiveNumbers.get(i+1)-postiveNumbers.get(i)>1)
            m = postiveNumbers.get(i)+1;
            if(postiveNumbers.get(i+1)-postiveNumbers.get(i)==1)
                m= postiveNumbers.get(postiveNumbers.size()-1) +1;

        }
        if(postiveNumbers.size()==0)
            return 1;
        return m;
    }
}

