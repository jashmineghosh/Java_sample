package a;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

 public  class SampleTest {


//     public static long maximumSum(List<Long> a, long m) {
//         // Write your code here
//int count =0;
//         count =a.size();
//         for(int i=0;i<a.size();i++){
//             for(int j=i+1;j<a.size()+1;j++){
//                 System.out.println(a.subList(i,j));
//             }
//         }
//
//         return 1;
//     }
//
//     private static final Scanner scanner = new Scanner(System.in);
//
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
////         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//         int q = Integer.parseInt(bufferedReader.readLine().trim());
//
//         IntStream.range(0, q).forEach(qItr -> {
//             try {
//                 String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//                 int n = Integer.parseInt(firstMultipleInput[0]);
//
//                 long m = Long.parseLong(firstMultipleInput[1]);
//
//                 List<Long> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                         .map(Long::parseLong)
//                         .collect(toList());
//
//                 long result = SampleTest.maximumSum(a, m);
//                 System.out.println(result);
////                 bufferedWriter.write(String.valueOf(result));
////                 bufferedWriter.newLine();
//             } catch (IOException ex) {
//                 throw new RuntimeException(ex);
//             }
//         });
//
//         bufferedReader.close();
////         bufferedWriter.close();
//     }


public static int perfectTeam(String skills) {
    // Write your code here
//pcmpcmbbbzz
    int numberOfTeams = Integer.MAX_VALUE;

    int[] countArr = new int[5];
    for(int i=0;i<skills.length();i++){
        char subject = skills.charAt(i);
        if(subject=='p'){
            countArr[0]++;
        }else if(subject=='c'){
            countArr[1]++;
        }else if(subject=='m'){
            countArr[2]++;
        }else if(subject=='b'){
            countArr[3]++;
        }else if (subject=='z'){
            countArr[4]++;
        }else{
            throw new IllegalArgumentException("Invalid Input: " + subject);
        }

    }

    for(int i=0;i<5;i++){
        if(countArr[i]<numberOfTeams){
            numberOfTeams = countArr[i];
        }
    }
    System.out.println(numberOfTeams);
    return numberOfTeams;
}

//     public static int getAnagram (String s) {
//         // Write your code here
//         int len = s.length(), count = 0;
//         if (len % 2 != 0) {
//             System.out.println(-1);
//
//         }
//         String s1 = s.substring(0, len / 2);
//
//         String s2 = s.substring(len / 2, len);
//         char[] s1Chars = s1.toCharArray();
//         for (char c : s1Chars) {
//             int index = s2.indexOf(c);
//             if (index == -1) {
//                 count++;
//             } else {
//
//                 s2 =  s2.substring(index +1) + s2.substring(0, index) ;
//                 System.out.println(s2);
//             }
//         }
//
//         System.out.println(count);
//         return count;
//     }

     public static void main (String[] args) {
//         getAnagram("122432");
         perfectTeam("pcmpcmbbbzz");

//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while (t-->0){
//             String str = sc.next();
//             int len = str.length(), count = 0;
//             if (len%2!=0){
//                 System.out.println(-1);
//                 continue;
//             }
//             String s1 = str.substring(0,len/2);
//             String s2 = str.substring(len/2,len);
//             char[] s1Chars = s1.toCharArray();
//             for (char c : s1Chars){
//                 int index = s2.indexOf(c);
//                 if (index == -1){
//                     count++;
//                 } else {
//                     s2 = s2.substring(0,index)+s2.substring(index+1);
//                 }
//             }
//             System.out.println(count);
//         }
//     }
     }
 }

 class AccessTest { int a; private int b; protected void c(){ } public int d(){  return 0; } }





