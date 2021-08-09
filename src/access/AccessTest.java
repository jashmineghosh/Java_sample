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
//int[] A = {-1,-3,-1,1,2};
//        System.out.println(solution(A));


    }
//    public  static int solution(int[] A) {
//        // write your code in Java SE 8
//
//        List<Integer> postiveNumbers = new ArrayList<Integer>();
//        List<Integer> negativeNumbers = new ArrayList<Integer>();
//        List<Integer> duplicateNumbers = new ArrayList<Integer>();
//        for (int i = 0; i < A.length; i++) {
//            if (!(postiveNumbers.contains(A[i]) || negativeNumbers.contains(A[i]))) {//checks whether it contains duplicates
//
//                if (A[i] >= 0) {
//                    postiveNumbers.add(A[i]);
//                } else if (A[i] < 0) {
//                    negativeNumbers.add(A[i]);
//                }
//            }
//            else duplicateNumbers.add(A[i]);
//        }
//        int m = 0;
//        System.out.println(postiveNumbers);
//        System.out.println(negativeNumbers);
//        System.out.println(duplicateNumbers);
//        Collections.sort(postiveNumbers);
//        for (int i = 0; i < postiveNumbers.size()-1; i++) {
//            if(postiveNumbers.get(i+1)-postiveNumbers.get(i)>1)
//            m = postiveNumbers.get(i)+1;
//            if(postiveNumbers.get(i+1)-postiveNumbers.get(i)==1)
//                m= postiveNumbers.get(postiveNumbers.size()-1) +1;
//
//        }
//        if(postiveNumbers.size()==0)
//            return 1;
//        return m;
//    }


}
class Solution {
    public static void main (String[] args) {
        int[] n = new int[]{3,30,34,5,9};
//        List a = Arrays.asList(n);
        List a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(0);
        a.add(1);

        System.out.println("+++"+pairs(a, 3));
//        new Solution().medians(a);
//        int a[][] = { { 1, 2, 3, 4 },
//                { 5, 6, 7, 8 },
//                { 9, 10, 11, 12 },
//                { 13, 14, 15, 16 } };
        List<List<Integer>> list = new ArrayList<>();

        list.add(Arrays.asList(1, 2));
        list.add(Arrays.asList(5, 6 ));
//        list.add(Arrays.asList(9, 10, 11, 12));
//        pairs(1,list);
    }


//    public List<Integer> medians(List<Integer> arr){
//Collections.sort(arr);
//        System.out.println(arr);
//        List<Integer> a = new ArrayList();
//        int i = arr.size();
//        do{
//            arr = arr.subList(0, i);
//            int n = arr.size();
//            Integer[] array = new Integer[arr.size()];
//            array = arr.toArray(array);
//
//            if (arr.size() % 2 == 0)
//                a.add((int) array[n / 2]);
//            else if(arr.size() % 2 != 0)
//a.add((int) ((array[(n - 1) / 2] + array[n / 2]) / 2.0));
//i--;
//        }while(i>0);
//        System.out.println(a);
//        Collections.reverse(a);
//        System.out.println(a);
//        return a;
//    }

    public static void pairs(int s, List<List<Integer>> matrix) {
        int countOfPair = 0;
for(List<Integer> a: matrix){
    System.out.println(a);
    for(int a1 =0; a1< matrix.size(); a1++){

    }
        List<Integer> l1 = matrix.get(0);
        List<Integer> l2 = matrix.get(1);
//    }
    A:for(int i=0;i<l1.size();i++){
       B: for(int j=0;j<l2.size();j++){
            if(l1.get(i)+ l2.get(j) == s){
                countOfPair++;
break A;
            }

        }
    }

            }
            if(countOfPair ==0)
                System.out.println("No output");
            else
        System.out.println(countOfPair);
        }


    static int pairs(List<Integer> arr, int x) {
        Map<Integer, Integer> uniqueMap  = new HashMap<Integer, Integer>() ;
        int sum=0;
for(int i=0;i<arr.size();i++){
    System.out.println(arr.get(i));
    for(int j=i;j<arr.size();j++){
        if(arr.get(i)+arr.get(j) == x){
            uniqueMap.put(arr.get(i),arr.get(j));
            sum++;

        }
    }
}
        List<Integer> listKey = new ArrayList<>();
        List<Integer> listValue = new ArrayList<>();
        System.out.println(uniqueMap);
        for ( Integer key : uniqueMap.keySet() ) {

            System.out.println( "key"+key );

            listKey.add(key);
            System.out.println(listKey);
            listValue.add(uniqueMap.get(key));
//            System.out.println(uniqueMap.get(key));
//            if(list.contains(uniqueMap.get(key))){
//                sum--;
//            }
//                sum--;
//            System.out.println("sum  "+sum);
        }


return sum;
    }
    }




