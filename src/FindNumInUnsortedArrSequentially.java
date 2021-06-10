import java.util.Arrays;

public class FindNumInUnsortedArrSequentially {

    public static int findNumInUnsortedArrSequentially(int[] a, int n){
       for(int i =0; i< a.length;i++){

           if(a[i]== n){
               System.out.println("number is found at "+(i+1));
               return 1;

           }
          }
        System.out.println("number not found");
return -1;
    }

    public static void main (String[] args) {
        int[] arr = {2,6,0,1,-3};
        int num = findNumInUnsortedArrSequentially(arr, -1);
//        if(num <0)
//        System.out.println("number is not found");
    }
}
