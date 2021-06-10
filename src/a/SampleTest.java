package a;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleTest {
    public static void main (String[] args) {


       List<String> s1 = solution ( "CBACD");

//        String listString = "";
//        for (String s : s1)
//        {
//            listString += s ;
//        }
//
//        System.out.println(listString);
//        List<String> s2 = solution(listString);
//        System.out.println(s2);
//        solution("CABABD");

//        CABABD
//        CBACD
        String ss1 =convert(s1);
        System.out.println("after convert"+ss1);
        List<String> s2 = solution(ss1);
        String ss2 =convert(s2);
        System.out.println("after convert"+ss2);
        List<String> s3 = solution(ss2);
        String ss4 =convert(s3);
        System.out.println("after convert"+ss4);
    }

    public static List<String> solution (String str) {
//        System.out.println(str);
//        char[] chars = str.toCharArray();
//        Arrays.sort(chars);
//        String str1 = new String(chars);
//        System.out.println(str1);
/*
            // `i` maintains the position of the current char in the input string.
            // `k` maintains the next free position in the output string.
            int i = 0, k = 0;

            // do till the end of the string is reached
            while (i < str.length())
            {
                // if the current character is `B` and previous (need not be adjacent)
                // was `A`, increment `i` and decrement `k`
                if (chars[i] == 'A' && (k > 0 && chars[k - 1] == 'B'))
                {
                    --k;
                    ++i;
                }
                // if the current character is `C`, increment `i`
                else if (chars[i] == 'C' && (k > 0 && chars[k - 1] == 'D')) {
                    --k;
                    ++i;

                }
                // for any other character, increment both `i` and `k`
                else {

                    chars[k++] = chars[i++];

                }
            }

            return new String(chars).substring(0, k);
*/

//        int l = chars.length;
//
//
//        char[] array2 = null;
//        // Iterate for every index and
//        // check for the condition
//        for (int i = 1; i < l; i++) {
//
//            // If are not consecutive
//            if (chars[i] - chars[i - 1] == 1) {
//                array2 = Arrays.copyOfRange(chars, i + 1, l);
//
//            }
//
//            }
//
//        return solution(array2.toString());
        List<String> myList = new ArrayList<String>(Arrays.asList(str.split("")));

        System.out.println(myList);
        for(int i = 0; i<myList.size()-1;i++){
            if(myList.get(i).equals("C") && myList.get(i+1).equals("D") ||
                    myList.get(i).equals("D") && myList.get(i+1).equals("C")){
                myList.remove(i);
                System.out.println("from 1 loop"+myList);
                myList.remove(i);
                System.out.println("from 1 loop"+myList);
            }

        }
        for(int i = 0; i<myList.size()-1;i++) {
            if (myList.get(i).equals("B") && myList.get(i + 1).equals("A") ||
                    myList.get(i).equals("A") && myList.get(i + 1).equals("B")) {
                myList.remove(i);
                System.out.println("from 2 loop"+myList);
                myList.remove(i);
                System.out.println("from 2 loop"+myList);
            }
        }
        return myList;
        }
public static String convert(List<String> s1){
    String listString = "";
    for (String s : s1)
    {
        listString += s ;
    }


    return listString;
}


    }


