public class BiggestNumInArrRecur {
    static int max=Integer.MIN_VALUE;
    static int findBiggestNum(int[] a, int n){

        if(n == -1){
            return  max;
        }
        if(a[n] > max){
            max = a[n];

        }
        return findBiggestNum(a,n-1);
    }

    public static void main (String[] args) {
        int[] a = {4,9,-1,3,0};
        int[] b = {2};
        System.out.println(findBiggestNum(b, b.length-1));
    }


}
