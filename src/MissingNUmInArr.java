public class MissingNUmInArr {
    public static int findMissingNum(int[] a, int l){
//      assuming l is length of given array, but it has 1 missing number, sum of  array is (length * (length+1))/2
        int sum =  ((l+1) * (l+2))/2;
        for(int i =0;i< a.length ;i++){
            sum = sum - a[i];

        }
        return sum;
    }

    public static int findDuplicateNum(int[] a, int l){
//      assuming l is length of given array, but it has 1 extra number, sum of  array is (length * (length+1))/2
        int sum =  ((l-1) * l)/2;
        for(int i =0;i< a.length ;i++){
            sum -=  a[i] ;

        }
        return -(sum);
    }
    public static void main (String[] args) {
        int arr[] = {1,2,4,5,6};
        int dupArr[] = {1,2,3,3};
        int number = findMissingNum(arr, 5);
        System.out.println("missing number is "+number);
        int number1 = findDuplicateNum(dupArr, 4);
        System.out.println("duplicate number is "+number1);
    }
}
