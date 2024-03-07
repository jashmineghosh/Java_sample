package oca1;

import access.AccessTest;

//import com.sun.org.apache.xpath.internal.operations.And;


import java.io.IOException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjuster;
import java.util.*;


class IfTest
//        extends FooBase implements Bar
{
    int a = 10;

    public void bar () {
        System.out.println("In sub bar");
    }

    public static void main (String args[]) {
        //example of if else loop
//        if (true)
//            if (false)
//                System.out.println("True False");
//            else
//                System.out.println("True True");


//        boolean b1 = false; boolean b2  = false;
//        if (b2 = b1 != b2) //order of precedence example here
//        {    System.out.println("true"); } else{    System.out.println("false"); }
//

//        //switch statement wont compile
//        int x = Integer.parseInt(args[0]);
//        final Integer integer = 4;
//        switch(x)
//        {
//            case x < 5 :   System.out.println("BIG"); break;
//        case x > 5 :   System.out.println("SMALL");
//            case integer: //this will also not compile, as wrapper variable, even static final ones are not allowed, case should be constants
//        default :    System.out.println("CORRECT"); break;
//        }

//        //what will it print, C,E,F
//        char i=97;
//        LOOP: for (i=0;i<5;i++){
//            System.out.println(i);
//            switch(i++){
//
//                case '0': System.out.println("A");
//                case 1: System.out.println("B"); break LOOP;
//                case 2: System.out.println("C"); break;
//                case 3: System.out.println("D"); break;
//                case 4: System.out.println("E");
//                case 'E' : System.out.println("F");
//            }
//        }

//        System.out.println(null + true); //1
//         System.out.println(true + null); //2
//         System.out.println(null + null); //3

//        //example of class cast exception
//        A[] a, a1;       B[] b;       a = new A[10]; a1  = a;       b =  new B[20];
//        a = b;  // 1
//         b = (B[]) a;  // 2
//         b = (B[]) a1; // 3
//        class A { } class B extends A { }

//        //what will it print?
//        int size = 10;       int[] arr = new int[size];
//        for (int i = 0 ; i < size ; ++i)
//            System.out.println(arr[i]);

//        //how many times it will print 2, ans- 3 times
//        String[] dataList = {"x", "y", "z"};
//        for (String dataElement : dataList)
//        {
//            int innerCounter = 0;
//            while (innerCounter < dataList.length)
//            {
//                System.out.println(dataElement + ", " + innerCounter);                 innerCounter++;
//            }
//        }

        ////what should be printed?
//        int i;
//        int j;
//        for (i = 0, j = 0 ; j < 1 ; ++j , i++){
//            System.out.println( i + " " + j );
//        }
//        System.out.println( i + " " + j );


//        //what is value of c
//        int c = 0;
//        A: for(int i = 0; i < 2; i++){
//            B: for(int j = 0; j < 2; j++){
//                C: for(int k = 0; k < 3; k++){
//                    c++;
//                    if(k>j) break;
//                }
//            }
//        }
//        System.out.println(c);


//        //interface,super class example
//            FooBase fooBase = new IfTest();
//fooBase.bar();
//        System.out.println(((IfTest) fooBase).a);
//        System.out.println(fooBase.a);
////Bar bar = new Bar() {
////};
//        Bar bar = new IfTest();
//                bar.bar();


//
//        StringBuilder sb = new StringBuilder("abcdre");
//        StringBuilder sb1 = new StringBuilder("abcdre");
//        StringBuilder sb2 = sb1;
//        String s = "abcdre";

        ////referential equality in play for String and String builder, string has build in equals implementation
//        System.out.println(sb == sb1);//false
//        System.out.println(sb.equals(sb1));//false
//        System.out.println(sb.toString() == sb1.toString()); //false, as there are 2 different string objects
//        System.out.println(sb.toString().equals(sb1.toString()));//true, string has build in equals implementation
//        System.out.println(sb1 == sb2);//true , referential equality at play
//        System.out.println(sb1.equals(sb2));//true, referential equality at play
//        System.out.println(sb2.toString() == "abcdre");//false
//        System.out.println(sb2.toString().equals("abcdre"));//true
//        System.out.println(sb.toString() == s);//false
//        System.out.println(sb.toString().equals(s));//true

//        sb.ensureCapacity(555);
//        System.out.println(sb.capacity());
//        System.out.println(sb);
//        System.out.println(sb.replace(1,5,"a"));
//        System.out.println(sb.subSequence(1,3));
//        System.out.println(sb.subSequence(1,3).getClass());
//        System.out.println(sb.insert(1,"zzzz",0,1));
//        System.out.println(sb.delete(2,11)); // last index can be more than length
//        StringBuilder s1 = new StringBuilder("Java");
//        String s2 = "Love";
//        s1.append(s2);
//        System.out.println(s1);
//        s1.substring(4); //returns a string, since it not assigned, the result is ignored
//        System.out.println(s1);
//        int found = s1.indexOf(s2);
//        System.out.println(found);
//        java.time.LocalDate dt = java.time.LocalDate.parse("2015-01-01").minusMonths(1).minusDays(1).plusYears(1);
// System.out.println(dt);
//        String blank  = " ";  // one space
//         String line = blank + "hello" + blank + blank;
//        System.out.println(line.length());
//        LocalDate d1 = LocalDate.parse("2015-02-05", DateTimeFormatter.ISO_LOCAL_DATE); // only local date will work here
//        System.out.println(d1);
//        int[] intArray = new int[]{1, 'a', 'z', 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(intArray[1]++);
//        System.out.println(intArray[1]);//integer values are printed
//        System.out.println(intArray[2]);//integer values are printed
//        int[] intArray1 = new int[]{1, 'a', 'z', 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(intArray == intArray1);//false
//        System.out.println(intArray.equals(intArray1));//false
//        int[] intArray2 = intArray;
//        System.out.println(intArray == intArray2);//true ,
//        System.out.println(intArray.equals(intArray2));//true
//        int[] intArray3 = {1, 'a', 'z', 3, 4, 5, 6, 7, 8, 9, 10};


        //refential equality of arrays and build in implementation
//        System.out.println(intArray == intArray3);//false
//        System.out.println(intArray.equals(intArray3));//false
//        System.out.println(Arrays.equals(intArray,intArray3));//true, as i have used Arrays class equals method, arrays implements equals

//        char[] intCArray = new char[]{1, 'a', 'z', 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(intCArray[1]++);
//        System.out.println(intCArray[4]);//character values are printed
//        ArrayList<Integer> a = new ArrayList();
//        a.add(5);
//        a.add(10);
//        System.out.println(a);
//        List<Integer> b = Arrays.asList(5,10);
//        System.out.println(a == b);//false
//        System.out.println(a.equals(b));//true
//        ArrayList<Integer> a1 = a;


        //referential equality in play for arraylist
//        System.out.println(a == a1);//true , referential equality in play
//        System.out.println(a.equals(a1));//true

//        System.out.println(a.remove(new Integer(0)));
//        int c = 0;
//        JACK: while (c < 8){
//            JILL: {System.out.println(c); // if i remove the brackets from label JILL, compile error for break statement as label should be in same block
//                if (c > 3) break JILL; else c++;}        }

//        //multidimentional array example
//        int i = 4;
//        int ia[][][] = new int[i][i = 3][i];
//        System.out.println( ia.length + ", " + ia[0].length+", "+ ia[0][0].length);
//        int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
//        System.out.println("arr[0][0][1] = " + arr[0][1][1]);


//        //for wrapper class it compares the object also in equals
//        Integer i = new Integer(1) ;       Long m = new Long(1);       if( i.equals(m)) System.out.println("equal");   // 1
//         else System.out.println("not equal");

//        The parameter type and return type of the methods of DateTimeFormatter class is the
// base interface TemporalAccessor instead of concrete classes such as LocalDate or LocalDateTime. So you shouldn't directly cast the returned values to concrete classes like this -

//        Durations and periods differ in their treatment of daylight savings time when added to ZonedDateTime. A Duration will add an exact number of seconds, thus a duration of one day is always exactly 24 hours. By contrast, a Period will add a conceptual day, trying to maintain the local time.
//        Since you can't modify them once created, if you want to create new object with some changes to the original, you can use the instance method named with(...). For example, LocalDate sunday = ld.with(java.time.temporal.TemporalAdjusters.next(DayOfWeek.SUNDAY));
//        These classes are immutable and have no public constructors. You create objects of these classes using their static factory methods such as of(...) and from(TemporalAccessor ).  For example, LocalDate ld = LocalDate.of(2015, Month.JANUARY, 1); or LocalDate ld = LocalDate.from(anotherDate); or LocalDateTime ldt = LocalDateTime.of(2015, Month.JANUARY, 1, 21, 10);

//        LocalDateTime dt = LocalDateTime.parse("2015-01-02T17:13:50");
//        System.out.println(DateTimeFormatter.ofPattern("yy MMMM 'at' dd").format(DateTimeFormatter.ISO_LOCAL_DATE.parse("2015-01-01")));
//        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(LocalDateTime.of(2020,11,30,11,11)));//here if i give LocalDate.of, it will give runtime exception, as both date and time should be present
////LocalDate d2 =  DateTimeFormatter.ISO_LOCAL_DATE.parse("2015-01-01"); //class cast exception, as the method gives TemporalAccessor
//LocalDate d2 = LocalDate.from(DateTimeFormatter.ISO_LOCAL_DATE.parse("2015-01-01"));
//        LocalDate d1 = LocalDate.parse("2015-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
//        System.out.println(d1.format(DateTimeFormatter.ofPattern("yy MMMM 'at' dd")));

//        //conversions
//        int i = (int)12.5f;
//        System.out.println((int)12.5f== i);
//        System.out.println(12.5f== i);
//        float f = i;
//        System.out.println("after float widening: " + f);
//        System.out.print(f);
//        f = f * i;
//        System.out.println("*" + i + "==" + f);
//        double d = Math.sin(f);
//        System.out.println("Math.sin(" + f + ")==" + d);
//        char a = 'a';
//        short s = (short)a;
//        System.out.println(s);
//        short s1 = 122;
//        char a1 = (char)s1;
//        System.out.println(a1);

//        //Widening Primitive Conversion
//        int big = 1234567890;
//        float approx = big; //change to double and see teh result, double has 17 significant digits.
//// float only has 7.22 significant digits.
//        System.out.println(approx);
//        System.out.println((int)approx);
//        System.out.println(big - (int)approx);
//        System.out.println(3 + 100/10*2-13);

// //       Example of implicit narrowing
//         char c = 6;
//        short s = c;
//        final short s = 105;
//        char c =  s;
//        short s = 105;
//        int i = s;
//       final int i1 = 100;
//        byte b = i1; //example of implicit narrowing, if final is removed from i1,then it wont compile
//byte b1 = (byte) c;

//        final double d = 2.33;
//         float f = d; // doesnt compile, implicit narrowing applies to only char,byte,short,int

        Integer i1 = 1; Integer i2 = new Integer(1); int i3 = 1; Byte b1 = 1; Long g1 = 1L;
        int ia = 1; byte b = 1;char c = 1;float f = 1.0f;
        System.out.println(g1.equals(f)); //unrelated objects compile and gives false,
        // if 1 is primitive but different class, result in false, same class(primitive) results true
        System.out.println(g1 == f); //unrelated objects it wsont compile, if 1 is primitive(or both), it vl unbox and result in true
String str = "";
        System.out.println(str.isEmpty());
Boolean bo = new Boolean("    true");//false
        System.out.println("+++"+bo);
//    private static int loop = 15 ;
//    static final int INTERVAL = 10 ;
//    final boolean flag ;
////     {flag = true;}
//    static { loop += INTERVAL; }
//    IfTest(){
//        flag = true;
//    }

//      important about protected access->  Note that since value is protected, a class in another package which extends MyClass will only inherit this variable, but it cannot read or modify the value of a variable of a MyClass instance.

////empty loop boolean condition means, it takes true
////        As for empty conditional statements, of the two possible values true and false, they chose true because there is absolutely never any need for a loop that will not loop at all, while there are plenty of situations where we have a need for a loop that will loop forever (or until break.)
//        int i = 0;
//        for (i=1 ;  i<5  ; i++) continue;
//        for (i=0 ;       ; i++) break;
//        for (    ; i<5?false:true ;    );

        //for multi-dimentional arrya, if its initialized then arr[1][3], will give exception, else, it print 0
//int[][] arr = new int[2][4];
//arr[0]= new int[]{1,3,5,7};
//arr[1] = new int[]{2,4};
// System.out.println(arr[1][3]);

//char c1 = 35;

//        System.out.println(ch);
//        System.out.println(ba[ch]);
//        System.out.println(i.intValue());
//
//        System.out.println((int)new IfTest().c);
//        System.out.println((int)c1);

//        Integer condition = new Long();//try with different Object creation for wrapper classes

        //for lambda
//        (parameter list) OR single_variable_without_type -> { regular lines of code } OR just_an_expression_without_semicolon
//        new IfTest().parseFloat("0.0");
//        double x = 0xB10_000;
//        System.out.println(x);
//        float x1 = 0b10_000f;//This is invalid because the floating point suffices f, F, d, and D are used only when using decimal system and not while using binary.
    }

//static char ch;static boolean[] ba = new boolean[1];static Integer i = null;
//    //interesting case for return
//    public float parseFloat( String s ){
//        float f = 0.0f;      // 1
//        try{
//            f = Float.valueOf( s ).floatValue();    // 2
//            return f ;      // 3
//        }
//        catch(NumberFormatException nfe){
//            f = Float.NaN ;    // 4
//            return f;     // 5
//        }
//        finally {
//            f = 10.0f;
//            return f;     // 6
//        }
////        return f ;    // 7
//    }
}


 class Speak {
     public  void up(){         System.out.println("UP UP UP in super class");}
    public static void main(String[] args) {
//        Speak s = new GoodSpeak();
//        ((GoodSpeak)s).up();
        Speak s = new GoodSpeak();s.up();//if up() method is static the reference decides what gets called, its method hiding
        ((Speak)s).up();Speak s1 = new Speak();((GoodSpeak)s1).up();//class cast exception
    } }
    class GoodSpeak extends Speak implements Tone
{     public  void up(){
//    i=0; cant assign interface variable to new value
    System.out.println(i);

    super.up();     System.out.println("UP UP UP");
    }

    public static void main (String[] args) {
        Speak s = new GoodSpeak();
        s.up();
        System.out.println(i);

//        super.up();//cant call super from static context
        ((Speak)s).up();
    }}
    interface Tone{  void up();
//   static void up(){
// System.out.println("UP UP UP in interface");}
        int i=1;
}

abstract interface Movable{ public default void move(int dx) { System.out.println("in m");} }
interface Growable
        extends Movable
{ public default void move(int dx) { System.out.println("in g");} }  //instance method cant be made static, if 2 interfaces are extending
class Animal implements Movable, Growable{
    public static void main (String[] args) {
        Movable m = new Animal();
        m.move(2);
        Growable g = new Animal();

//        g.move(2);//static interface method cant be invoked this way
//        Growable.move(2);
    }

//    @Override
//    public void move (int dx) {
//
//    }

}


////very important concept for overloading precedence
//class TestClass{
//    void probe(int... x) { System.out.println("In ..."); }  //1
//
////    void probe(Integer x) { System.out.println("In Integer"); } //2
//
//    void probe(long x) { System.out.println("In long"); } //3
//
//    void probe(Long x) { System.out.println("In LONG"); } //4
//
//    public static void main(String[] args){
//        Integer a = 4; new TestClass().probe(a); //5
//        int b = 4; new TestClass().probe(b); //6
//    }
//}


 class Pass2{
    String invade(Number ships){
return "a few";
    }
    String invade(short... ships){
        return "a many";
    }
    public static void main (String[] args) {
//        Integer x =new Integer("6");
//        Pass2 p = new Pass2();
//p.doStuff(x);
//        System.out.println("main "+ x);
        Short s = 7;short s1 = 10;
//        System.out.println(new Pass2().invade(s));
//        System.out.println(new Pass2().invade(s1));
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
//        if((b1 = false) | (b1&b3) | (b1|b2))
//            System.out.println("beta");
//        System.out.println(" "+(b1&b3));

        float f1 = 2.3f;
        float [][] f2 = {{42.0f},{1.7f,2.3f},{2.6f,2.7f}};
        float [] f3 = {2.7f};
        float[] f4 = f2[2];
        Long x = 42L;
//         if(f1 == f2);
         if(f1 == f2[2][1]);
//        System.out.println(f2[0][0]);
        if(x == f2[0][0])
            if(x == 2.0f)
//        System.out.println("true");
//         if(f1 == f2[1,1]);
         if(f3 == f2[2]); // uses reference equality, for Arrays.equals it compares content
             if(f4 == f2[2])
        System.out.println("true 55");

            Object obj = new int[]{1,2,3,4};
//            Object[] objects = (Object[]) obj;classcast exception
            int[] somearr = (int[]) obj;
//            int i=0; //if i declare 'i' of for loop before it wont compile
            for( int i: somearr){
                System.out.println(i);
            }
        }
     void doStuff(int x){
         System.out.println("dos ="+ x++);
    }

    }



class A{
    A(){
        System.out.println("A constructor called");
    }
    A(int i){
        new A();
        System.out.println("2nd constructor called");

    }
    public void foo(String... s){
        System.out.println("A: foo ....");
    }
//    public void foo(int s){
//        System.out.println("A: foo for int");
//    }
    public void bar(String s){
        System.out.println("A: bar");
    }
    public void test(){
        System.out.println("A");
    }
    int i = 9;
    public static void test1(){
        System.out.println("static in A");
    }
}
class B extends A{
    public void test(){
        System.out.println("B");
    }
    public static void test1(){
//        super.test1();//super cant be referenced from static context, can be used in instance methods
        System.out.println("static in B");
    }
    public void foo(String s){
        System.out.println("B: foo");
    }
    public void foo(int s){
        System.out.println("B: foo for int");
    }
    public void bar(String s){

        System.out.println("B: bar"+this.i+"   "+i); // i in A can be referred as this also, since it inherited
    }

    public static void main (String[] args) {
        A a = new B(); B bb = new B();
        B b = (B)a;((A) a).bar("");
//        ((A) new B()).bar("");// this will call B method only, as object is B
//        ((B) a).foo(1); // it wont even compile as it doesnt find relevant method
        A a1 = new A();a1.bar("");
//        ((B)a1).foo(1);//class cast exception if foo(int) exists in B or A
//        a.foo(1);
//       a.foo();bb.foo();//A method is called, assuming a  {} array, hence String... overloaded method is called
//        a.foo("test");
//        a.bar("test");
//        b.foo("test");
//        b.bar("test");
        test1();//try with a.test1(), static A is called ;overridding of static method, as a is reference of class A
    }
}
class C extends A{
    public void test(){
        System.out.println("C");
    }
    int i = 10;

//int[] arrayOfInt = new int[5];
//    //reason for exception- Initialization of arrayOfInt wont happen at that moment.
//    //Compiler reads arrOfInt but when it reaches 2nd line it doesnt find the type of arrOfInt, remember compiler at this point may not have read all the variables hence it says it cannot find arrOfInt, in short it is not going to check if it has read a variable with same name of not as it is hasnt yet completed its complete processing and it is not in the initialization blocks. You are still in the declaration block of the code.
//    //if we put the below 2 lines in instance block or static block it works
//      int[] arrOfInt;
//    arrOfInt = new int[5]; // generates exception, You can't write an assignment statement as part of a class definition.
}
//class Test{
//    public static void main (String[] args) throws Throwable{
//
//        A b1 = new A();
//        A b2 = new C();
//        b1 = (A) b2;
//        C b3 = (C) b2;
//        b1.test();
//        System.out.println(((C)b2).i);
//        System.out.println(b3.i);
////        b3.test();
//        A a1 = new A(1);
//
//    }
//}



//default/static methods in interface override example
interface A1 {
    int i = 0;
 default void hello(){}
     }
    interface B1 extends A1 {
    default void hello() {
//        super.hello();//This is NOT valid.   
//         A1.super.hello();//This is valid.  
         }
}
interface C1{
    default void hello(){}

}
class VarTest implements A1,B1{
//        C1{ // this option will not compile unless default method is implemented here
    int i=10;

     public void display(){
hello();
         System.out.println(i) ;
     }
    public static void main (String[] args) {
        System.out.println(new VarTest().i+"   "+A1.i);
        new VarTest().display();
        new VarTest().hello();
    }
}
//instance of example
interface Flyer{ }
class Bird implements Flyer { }
class Eagle extends Bird { }
class Bat { }
class SubBat extends Bat implements Flyer {}

class TestClass {
// static {
//    try {
//        throw new IOException();
//    } catch (IOException e) {
////        e.printStackTrace();
//    }
//}
//TestClass(){}
    public static void main(String[] args) {
        Flyer f = new Eagle();
        Eagle e = new Eagle();
        Bat b = new SubBat();
        Bat d = new Bat();

        if(f instanceof Bird) System.out.println("f is a Bird");
//        if(e instanceof Bat) System.out.println("e is a Flyer"); //inconvertible type, compile time error
        if(e instanceof Flyer) System.out.println("e is a Flyer");
        if(b instanceof Flyer) System.out.println("b is a Flyer");
        if(d instanceof Flyer) System.out.println("d is a Flyer");
    }
}


    ////example with System.exit()
// class TestClass{
//    public static void main(String args[]){
//        int k = 0;
//        try{
//            int i = 5/k;
//        }
//        catch (ArithmeticException e){
//            System.out.println("1");
//            System.exit(0);
//        }
//        catch (RuntimeException e){
//            System.out.println("2");
//            return ;
//        }
//        catch (Exception e){
//            System.out.println("3");
//        }
//        finally{
//            System.out.println("4");
//        }
//        System.out.println("5");
//    }
//}


////checked and unchecked exception
// class Test {      static String s = "";
// public static void m0(int a, int b) throws IOException {         s += a;
// m2();
// m1(b);     }
// public static void m1(int i) {         s += i;     }      public static void m2() throws  IOException {
////     throw new NullPointerException("aa");
////         try {
////             throw new IOException();
////         } catch (IOException e) {
////             e.printStackTrace();
////         }
//     }
// public static void m() throws NullPointerException, IOException {         m0(1, 2);         m1(3);     }
// public static void main(String args[]) throws IOException {
//         m();
////         try {             m();         }
////         catch (Exception e) {         }
////         System.out.println(s);
// }
// }


//about exception-
//    Note that the program ends with ExceptionInInitializerError because any exception thrown in a
// static block is wrapped into ExceptionInInitializerError and then that ExceptionInInitializerError
// is thrown. Remember that a static or instance initializer can only throw a RuntimeException.
// If you try to throw a checked exception from a static block to the outside, the code will not compile.  An instance block is allowed to throw a checked exception but only if that exception is declared in the throws clause of all the constructors of the class.

//    //classcast exception check
//interface I{
//}
//class A implements I{
//}
//
//class B extends A {
//}
//
//class C extends B{
//}
//class TestClass {
//    public static void main (String[] args) {
//        A a = new A();
//        B b = new B();
//        C c = new C();
//        I i = (A)(I) b;
////        I i1 = (C) a;
//        I i2 = (B)(I) a;
////        I i = (B)(I)b;
//    }
//}


//    //Access to static and instance fields and static methods depends on the class of reference variable and not the actual object to which the variable points to. Observe that this is opposite of what happens in the case of instance methods.  In case of instance methods the method of the actual class of the object is called.
class ABCD{
    int x = 10;
    static int y = 20;
}
class MNOP extends ABCD{
    int x = 30;
    static int y = 40;
}

 class TestClass1 {
    public static void main(String[] args) {
        ABCD a = new MNOP();
        System.out.println(a.x);
        System.out.println(a.y);
        System.out.println(new MNOP().x+", "+ABCD.y);
        System.out.println(((MNOP)a).x);
    }
}


//important overloading concept
class AccessTester extends AccessTest {     public static void main(String[] args) {
    AccessTest ref = new AccessTest();
    ref.d();
    AccessTester ref1 = new AccessTester(); //a protected member is accessible in the subclass only using a reference whose declared type is of the same subclass (or its subclass.).
    ref1.c();
    AccessTester ref2 = new SubAccessTester();
    ref2.c();
    SubAccessTester ref3 = new SubAccessTester();
    ref3.c();

} }

class SubAccessTester extends AccessTester{
    public static void main (String[] args) {
        AccessTester ref1 = new AccessTester();
        ref1.d();

        //this will give class cast exception
//        SubAccessTester ref2 = (SubAccessTester)new AccessTester(); //a protected member is accessible in the subclass only using a reference whose declared type is of the same subclass (or its subclass.).
//        ref2.c();
        SubAccessTester ref3 = new SubAccessTester();
        ref3.c();
    }

}


//interface Runner {
//    public void run(); }
//    class TestClass {
//    public static void main(String[] args) { run( () -> voidMethod() );
//    //will invoke run(Runner ) method.        
//         run( () -> intMethod() );//will also invoke run(Runner ) method.    
//         }
//         public static void run(Runner x) {
//        x.run();}
//        public static void voidMethod() {
//
//        System.out.println("voidMethod"); }
//
//        public static int intMethod() {
//        System.out.println("intMethod"); return 0;}
//}
//        The return type of the lambda expression's body becomes important in the following code though:
//interface Runner {   public void run(); } interface Runner2 {   public int run(); }  public class TestClass {         public static void main(String[] args) {         run(() -> voidMethod()); //will invoke run(Runner ) method.         run(() -> intMethod());  //will not invoke run(Runner ) method.     }      public static void run(Runner x) {        System.out.println("In runner");         x.run();     }     public static void run(Runner2 x) {         System.out.println("In runner2");         x.run();     }      public static void voidMethod() {         System.out.println("voidMethod");     }     public static int intMethod() {         System.out.println("intMethod");         return 0;     } }


//class Holder{
//    int value = 1;
//    Holder link;
//    public Holder(int val){ this.value = val; }
//    public static void main(String[] args){
//        final Holder a = new Holder(5);
//        Holder b = new Holder(10);
//        a.link = b;
//        b.link = setIt(a, b);
//        System.out.println(
////                a.link.value);
//                " "+b.link.value);
//    }
//
//    public static Holder setIt( Holder x, final Holder y){ // try making x final and uncommenting next line
//        x.link = y.link;
//        x = null;
//        return x;
//    }
//
//}


////example with static members
//class A11{
//    A11() {  print();   }
//    static void print() { System.out.print("A "); }
//}
//class B11 extends A11{
//    static final int i =   4;
//    public static void main(String[] args){
//        A11 a = new B11();
//        print();  //make it a.print() and check
//    }
//    static void print() { System.out.print(i+" "); }
//}

//class Test {
//    static int m(byte a, int b) { return a+b; }
//    static int m(short a, short b) { return a-b; }
//    public static void main(String[] args) {
////        System.out.println(m(12, 27));  // compile-time error
//    }
//
//}

////example of class cast exception and compile time exception
//class Point { int x, y; }
//class ColoredPoint extends Point { int color; }
//
//class Test {
//    public static void main(String[] args) {
//        long[] veclong = new long[100];
//        Object o = veclong;          // okay
////        Long l = veclong;            // compile-time error
////        short[] vecshort = veclong;  // compile-time error
//        Point[] pvec = new Point[100];
//        ColoredPoint[] cpvec = new ColoredPoint[100];
////        pvec = cpvec;                // okay
////        pvec[0] = new Point();       // okay at compile time,
//        // but would throw an
//        // exception at run time
//        cpvec = (ColoredPoint[]) pvec;                // compile-time error
//    }
//}

//class TestClass11 implements I1, I2{
//    public void m1() { System.out.println("Hello"); }
//    public static void main(String[] args){
//        TestClass11 tc = new TestClass11();
//        ( (I1) tc).m1();
//    }
//}
//interface I1{
//    int VALUE = 1;
//    void m1();
//}
//interface I2{
//    int VALUE = 2;
//    void m1();
//}



////fail to compile example due to operator precedence issue for . and cast
//class X{ int val = 10; }
//class Y extends X{
//    Y val = null; //1
//
// }
// public class TestClass extends X{
//   public static void main(String[] args){     Y y = new Y();
//   int k = (X) y.val ; //2
//      X x = (X) y.val ;
//        System.out.println(k);    } }


//interface I{
//}
//class A implements I{
//}
//
//class B extends A {
//}
//
//class C extends B{
//}




interface Bar{
    default void bar(){
    System.out.println("from interface");
} }
abstract class FooBase
{
    int a = 20;
    public static void main (String[] args) {
        FooBase fooBase = new FooBase() {
            @Override
            public void bar () {
                super.bar();
            }
        };

        fooBase.bar();
    }
    public  void bar()
    {      System.out.println("In static bar");     }     }


////this code fails at number 3
//class Base{
//    void methodA(){
//        System.out.println("base - MethodA");
//    }
//}
//
//class Sub extends Base {
//    public void methodA () {
//        System.out.println("sub - MethodA");
//    }
//
//    public void methodB () {
//        System.out.println("sub - MethodB");
//    }
//    public static void main(String args[]){
//        Base b=new Sub(); //1
//        b.methodA(); //2
//        b.methodB(); //3
//    }
//}


////run time polymorphism
//class A{
//    A() {  print();   }
//     void print() { System.out.print("A "); }
//}
//class B extends A{
//    static int i =   4; //make it final or static and observe
//    public static void main(String[] args){
//        A a = new B();
//        a.print();
//    }
//     void print() { System.out.print(i+" "); } //make both print as static and observe
//}