public class Point {
    private  int x;
    private int y;

    public Point () {

    }

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX () {
        return x;
    }

    public void setX (int x) {
        this.x = x;
    }

    public int getY () {
        return y;
    }

    public void setY (int y) {
        this.y = y;
    }

    public double distance()
    {
        return Math.sqrt((this.x-0)*(this.x-0) + (this.y-0)*(this.y-0));
    }
    public double distance(int x, int y)
    {
        return  Math.sqrt((this.x-x)*(this.x-x) + (this.y-y)*(this.y-y));
    }

    public double distance(Point another)
    {
        return Math.sqrt((this.x-another.x)*(this.x-another.x) + (this.y-another.y)*(this.y-another.y));
    }

    public static void main (String[] args) {

        Point point1 = new Point(6,5);
        Point point2 = new Point(3,1);
        System.out.println("distance(0,0)" +point1.distance());
//        System.out.println(point.distance());
    }
}
