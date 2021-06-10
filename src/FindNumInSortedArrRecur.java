public class FindNumInSortedArrRecur {

//    public static int BinarySearch(int[]a, int numToBeFound, int start, int end){

//        if(start == end) {
//            if(a[start] == numToBeFound)
//
//            return start;
//        }
//        else {
//
//            int mid = start + (end - start) / 2;
//            if (numToBeFound > a[mid]) {
//                return BinarySearch(a, numToBeFound, mid+1, end);
//            }
//            else if(numToBeFound < a[mid]) return BinarySearch(a, numToBeFound, start, mid);
//            else if  (numToBeFound == mid) return mid;
//        }
//        return -1;


//    public static void main (String[] args) {
//        int[] a = new int[] {2,5,6,9,11};
//        System.out.println(BinarySearch(a, 5,0,4));
//    }


        public static int recursiveBinarySearch(int[] sortedArray, int start, int end, int key) {

            if (start < end) {
                int mid = start + (end - start) / 2;
                if (key < sortedArray[mid]) {
                    return recursiveBinarySearch(sortedArray, start, mid, key);

                } else if (key > sortedArray[mid]) {
                    return recursiveBinarySearch(sortedArray, mid+1, end , key);

                } else {
                    return mid;
                }
            }
            return -(start + 1);
        }

        public static void main(String[] args) {

            int[] arr1 = {2,45,234,567,876,900,976,999};
            int index = recursiveBinarySearch(arr1,0,arr1.length,45);
            System.out.println("Found 45 at "+index+" index");
            index = recursiveBinarySearch(arr1,0,arr1.length,999);
            System.out.println("Found 999 at "+index+" index");
            index = recursiveBinarySearch(arr1,0,arr1.length,876);
            System.out.println("Found 876 at "+index+" index");
            System.out.println("+++"+recursiveBinarySearch(arr1, 0,arr1.length,976));
        }
}
