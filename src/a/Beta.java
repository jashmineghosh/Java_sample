package a;

import b.Gamma;

//public class Beta extends Alpha {
    public class Beta extends b.Gamma {
//        public class Beta {

       String name = "B";
    static String jas = "jas";
//    String name ;
//    String greeting(){
//        return "Class B";
//    }
//
//        public static void main (String[] args) {
//            int a = Integer.MIN_VALUE;
//            int b = -a;
//            System.out.println(a +" "+b);
//            b.Gamma g = new Beta();
//            Gamma g1 = new Beta();
//            System.out.println(new b.Gamma().name);
//            System.out.println(g.name);
//            System.out.println(((Beta) g1).name);
//            System.out.println(super.jas); // compile error super can not be accessed from static
//            System.out.println(new Beta().jas);

//            Alpha a = new Alpha();
//            Beta b = new Beta();
//            System.out.println(a.greeting()+" has name"+ a.getNmae());
//            System.out.println(b.greeting()+" has name"+ b.getNmae());
//            System.out.println(b.greeting()+" has name"+ b.anotherName);
//        }

//    private Beta(int instances){
//        super(instances);
//    }
    public Beta(){
//this("unknown");
//        super(name); //before super constructor is called, cant use name which is there in super
super("unknown");
    }
    public Beta(String nm){
super(nm);
        System.out.println(super.jas);
        System.out.println(jas);
    }
//    private Beta(){

//    }

    //     String getDesc () {
//        return "text";
//    }
//public  void  flipper () {   //final method cannot be overridden
//    System.out.println("slip");
//    super.flipper();
//}
//     public static void main (String[] args) throws Exception{
        public static void main (String[] args) {
        Beta b = new Beta("400");
            System.out.println(new Gamma("abc").jas);
            System.out.println(jas);
//        Gamma b1 = new Beta();
//b1.m1();
//       System.out.println(b.instances);
//        Alpha.call2();
//        call2();

//        System.out.println(new Beta().getDesc());

//    public static int multiply(int a, int b){
//
//        int c = super.multiply(a,b); //this implementation will hide parent method, hence we cant call the parent parent
//        return c;
//    }
//    public static final String FOO= "bar";
//         do{
//break;
//         }while(true);
//
//try{
//    m1();
//    System.out.println("a");
//}finally {
//    System.out.println("b");
//}
//        System.out.println("c");

    }

//    public static void m1 () throws Exception {
        public void m1 () {
//throw new Exception();
    }
}