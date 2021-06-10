package a;

public class AccessCheck extends Alpha{
   Alpha a = new AccessCheck();
//   a.floatInWater(10);

    @Override
    protected void floatInWater () {
        super.floatInWater();
    }
}
