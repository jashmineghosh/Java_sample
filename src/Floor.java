public class Floor
{

    private double length;
    private double width;

    public Floor(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public double getLength()
    {
        if(length <0)
        {
            return 0;
        }
        return length;
    }

    public double getWidth()
    {
        if(width <0)
        {
            return 0;
        }
        return width;
    }


//    public double getArea()
//    {
//        return length * width;
//    }

    public double getArea()
    {

        return getLength() * getWidth();
    }

    public String toString()
    {
        return "Dimensions of room: (length = " + length + ", width = " + width + ")";
    }

//}

//public class Room_Carpet
//{
//    private Room_Dimension roomDimensions;
//    private double carpetCost;
//
//    public Room_Carpet(Room_Dimension roomDimensions, double carpetCost)
//    {
//        this.roomDimensions = roomDimensions;
//        this.carpetCost = carpetCost;
//    }
//
//    public Room_Carpet(Room_Carpet roomCarpet)
//    {
//
//    }
//
//    public double getTotalCost()
//    {
//        return carpetCost * roomDimensions.getArea();
//    }
//
//    public Room_Dimension getSize()
//    {
//        return roomDimensions;
//    }
//
//    public double getCarpetCost()
//    {
//        return carpetCost;
//    }
//
//    public String toString()
//    {
//        return "" + roomDimensions + ", Carpet cost per square feet = $" + carpetCost + ", " + "Total cost = $" + getTotalCost() + "";
//    }
//
//}


//public class Carpet_Calculator
//{
    public static void main(String[] args)
    {
        Floor f1 = new Floor(-2,3.0);
        System.out.println(f1.getArea());
//        // Create a Scanner object for keyboard input.
//        Scanner keyboard = new Scanner(System.in);
//
//        // Display information about program.
//        System.out.println("This program will display the carpet cost of a room.");
//
//        // Get the length of the room.
//        System.out.print("Enter the length of room: ");
//        double length = keyboard.nextDouble();
//
//        // Get the width of the room.
//        System.out.print("Enter the width of room: ");
//        double width = keyboard.nextDouble();
//
//        // Get the cost of price per square feet of the desired carpeting.
//        System.out.print("Enter the price per square feet for the desired carpeting: ");
//        double carpetCost = keyboard.nextDouble();
//
//        //Close keyboard
//        keyboard.close();
//
//        // Create Room_Dimension and Room_Carpet objects.
//        Room_Dimension dimensions = new Room_Dimension(length, width);
//        Room_Carpet roomCarpet = new Room_Carpet(dimensions, carpetCost);
//
//        // Print the object calling the toString
//        System.out.println(roomCarpet);
    }
}