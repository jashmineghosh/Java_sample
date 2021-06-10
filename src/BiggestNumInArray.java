import java.util.Arrays;

public class BiggestNumInArray {

     static int findBiggestNum(int[] a){
     int max=0;
      if(a.length == 0){
          return  -1;
      }
         a[0] = max;
      for(int i =0;i<a.length;i++){

          if(a[i] > max){
              max = a[i];
          }
      }
      return max;
    }

    static void insertInArr(int[] a, int pos, int num){

    int[] newA = new int[a.length+1];
        for(int i=0; i<a.length;i++){
            newA[i] = a[i];
            System.out.println(newA[i]);
        }
    for(int i=newA.length-2; i>=pos-1;i--){
        newA[i+1] = newA[i];
    }
    newA[pos-1] = num;
    for(int i=0; i<newA.length;i++){
        System.out.println(newA[i]+" ");
    }

    }
    public  static String deleteFromArr(int[] a, int pos){
         if(pos < 0 || pos >= a.length || a == null ){
             return Arrays.toString(a);
         }
        int newA[] = new int[a.length-1];
         for(int i=0,j=0;i<a.length;i++){
             if(i == pos) {
                 continue;

             }

             newA[j++] = a[i];
         }
         return Arrays.toString(newA);


    }
    public static void main (String[] args) {
         int[] a = {2,-9,-1,3,0};
//        System.out.println(findBiggestNum(a));
//        insertInArr(a, 1, 50);
//        System.out.println(deleteFromArr(a, 1));

        OperationOn2DArr a1 = new OperationOn2DArr(3,3);
//        a1.traverseArray();
        a1.insertIntoArray(2,1,10);
        a1.traverseArray();
        a1.insertIntoArray(2,1,10);
        a1.accessingSingleCell(2,1);
        a1.accessingSingleCell(2,10);
        a1.searchingSingleValue(10);
        a1.searchingSingleValue(20);
        a1.deleteValueFromCell(2,1);
        a1.deleteValueFromCell(2,10);
        a1.deleteEntireArr();
        a1.traverseArray();
    }
}
