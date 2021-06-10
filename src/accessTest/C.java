package accessTest;

class Baap {
    public int h = 4;
    public int getH() {
        System.out.println("Baap " + h);
        return h;
    }
//    private int i = 10;
final int i = 10;
    public void  f(){}
    public void g(){}
    protected void m() throws Exception{
//        protected void m() {
        System.out.println("from baap");
    }
//    public static void main (String[] args) {
//        Baap b = new Beta();
//        ((Beta) b).up();
//    }

}

 class Beta extends Baap {
    public int h = 44;
    public int getH() {
        System.out.println("Beta " + h);
        return h;
    }
     
     final int i = 20;
    public void g(){}
    public void up(){
        System.out.println("UP UP UP");
    }
     public void m(){
         System.out.println("from beta");
     }
    public static void main(String[] args)  {
        Baap b = new Beta();
//        System.out.println( b.h+" " + b.getH());
//        b.m();
        ( (Beta) b ).m();
        Beta bb = (Beta) b;
//        System.out.println(bb.h + " " + bb.getH());

    }
}

//public class C{
//    public static void main (String[] args) {
//        Baap a = new Baap();//1
//        Baap b = new Beta();//2
//        System.out.println( a.i);
//
//    }


//}