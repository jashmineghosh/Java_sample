package accessTest;

import access.AccessTest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public  class AccessTester extends AccessTest{
//    abstract public void add() throws Exception;
    public AccessTester(){

//        super(5); // both super and this cant exist as both needs ot be first statement in constructor
//        this();
    }

    LocalDate d1 = (LocalDate) DateTimeFormatter.ISO_LOCAL_DATE.parse("2015-01-01");
    //will compile but may or may not throw a ClassCastException at runtime.
    //The parameter type and return type of the methods of DateTimeFormatter class is the base interface TemporalAccessor instead of concrete classes such as LocalDate or LocalDateTime.
    LocalDate d2 = LocalDate.from(DateTimeFormatter.ISO_LOCAL_DATE.parse("2015-01-01"));
    public static void main(String[] args) {
//        AccessTester ref =  (AccessTester) new AccessTest();// this statement causes classcast exception, as not known until
        //runtime what kind of instance new AccessTest() will return
//        AccessTest ref1 =  new AccessTest(4);
//        ref1.d();
        AccessTester ref2 =  new AccessTester(); //reference has to be a subclass or subclass of sublclass
        // to be able to access protected
        ref2.c();

    }
}